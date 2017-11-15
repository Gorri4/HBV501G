package is.hi.byrjun.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import is.hi.byrjun.model.Login;
import is.hi.byrjun.service.LoginService;
import is.hi.byrjun.service.SpurningaService;



/**
 * @author gudmundurorripalsson
 * LoginHandler sækir Login og Signup síður og
 * sér um að vinna úr inntaki notenda þegar þeir skrá sig inn eða búa til nýjan notenda
 * Klasinn athugar hvort notandinn sé til og hvort lykilorð passi. Ef svo er sendir hann 
 * notendann yfir á valmyndasíðu.
 *
 */
@Controller
@RequestMapping("/demo")
public class LoginHandler {
	
	@Autowired
    LoginService loginService;
	public SpurningaHandler spurnHandl;
	
    int a = 1; //Gildi sem er sent á útlitið í byrjun
    
	@RequestMapping(value="/Login", method=RequestMethod.GET)
    public String Login () {
    	return "demo/Login";
    }
	
	@RequestMapping(value="/SignUp", method=RequestMethod.GET)
    public String SignUp () {
    	return "demo/SignUp";
    }
	
    
    /**
     * Fall sem sækir upplýsingar frá notenda og sendir hann yfir á Valmynd ef upplýsingar
     * passa við gagnagrunn. Annars fær hann villumeldingu.
     *
     */
    @RequestMapping(value="/Login", method=RequestMethod.POST)
    public String login (@RequestParam("loginInfo") List<String> params, ModelMap model) {
    	String user = params.get(0);
    	String password = params.get(1);
    	ArrayList<Login> notendur = (ArrayList)loginService.allirNotendur();
    	if (checkLoginInfo(notendur, user, password)) {
    		model.addAttribute("i", a);
    		return "demo/Valmynd";
    	}
    	model.addAttribute("wrongLogin", true);
    	return "demo/FrontPage";	
    }
    
    /**
     * Fall sem sækir upplýsingar notenda og bætir við gagnagrunn við nýskráningu.
     * @return FrontPage
     */
    @RequestMapping(value="/SignUp", method=RequestMethod.POST)
    public String signUp (@RequestParam("signupInfo") List<String> params) {
    	String user = params.get(1);
    	String password = params.get(2);
    	String email = params.get(0);
    	
    	addNotandi(user,password,email);
    		return "demo/FrontPage";	
    }
    
	
	/**
	 * K�kir hvort notendanafni� og passwordi� passar.
	 * 
	 * @return true ef notendanafn og lykilor� er r�tt, false annars
	 */
    
	public boolean checkLoginInfo(ArrayList<Login> notendur, String userInput, String passwordInput) {
		boolean userinnBool = false;
		boolean passwordBool = false;
		//System.out.println("fer inn í fall");
		for (Login s: notendur) {
			if (userInput.equals(s.getUser())){
				userinnBool = true;
			}
		}
		for(Login s: notendur) {
			if (passwordInput.equals(s.getPassword())){
				passwordBool = true;
			}
		}
		if(userinnBool && passwordBool){
			return true;
		}
			return false;	
	}
	
	/**
	 * 
	 * @param notandi
	 * @param password
	 * @param email
	 * 
	 * Bætir notanda við gagnagrunn 
	 */
	
	public void addNotandi(String notandi, String password,String email){
		Login notandinn = new Login(notandi,password,email);
		loginService.addNotandi(notandinn);
	}

    @RequestMapping("FrontPage")
    public String Valmynd () {
    	System.out.println("virkar");
    	return "demo/FrontPage";
    }
    
    /**
     * 
     * @param button
     * @param model
     * @return 
     * 
     * Fall sem sækir Login og SignUp form eftir því hvaða takki er valinn
     */
    @RequestMapping(value="/FrontPage", method=RequestMethod.POST)
    public String hvadValmynd (@RequestParam(value="button", required=false)
    String button, ModelMap model) {
    	model.addAttribute("button", button);
    	if(button.equals("button1")){
    	    	return "demo/Login";
    	}
    	else
    	 return "demo/SignUp";
    }
	
	
}

