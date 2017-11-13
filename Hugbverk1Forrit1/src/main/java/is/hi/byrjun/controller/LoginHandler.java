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
 * Klasi sem er nota�ur til a� sj� hvort notendanafn
 * og lykilor� s� r�tt.
 * 
 * @author Helgi
 *
 */

@Controller
@RequestMapping("/demo")
public class LoginHandler {
	
	@Autowired
    LoginService loginService;
	
	//Harðkóðuð gildi fyrir user-a og password þeirra
    
	@RequestMapping(value="/Login", method=RequestMethod.GET)
    public String Login () {
        System.out.println ("Login");
    	return "demo/Login";
    }
	
	@RequestMapping(value="/SignUp", method=RequestMethod.GET)
    public String SignUp () {
        System.out.println ("SignUp");
    	return "demo/SignUp";
    }


	
    //Fall sem athugar hvort Login sé rétt	
    @RequestMapping(value="/Login", method=RequestMethod.POST)
    public String login (@RequestParam("loginInfo") List<String> params) {
    	String user = params.get(0);
    	String password = params.get(1);
    	ArrayList<Login> notendur = (ArrayList)loginService.allirNotendur();
    	
    	if (checkLoginInfo(notendur, user, password)) {
    		return "demo/Valmynd";
    	}
    		return "demo/LoginRangt";	
    }
    
    @RequestMapping(value="/SignUp", method=RequestMethod.POST)
    public String signUp (@RequestParam("signupInfo") List<String> params) {
    	String user = params.get(0);
    	String password = params.get(1);
    	
    	addNotandi(user,password);
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
		System.out.println("fer inn í fall");
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
	
	public void addNotandi(String notandi, String password){
		Login notandinn = new Login(notandi,password);
		loginService.addNotandi(notandinn);
	}

    @RequestMapping("FrontPage")
    public String Valmynd () {
    	System.out.println("virkar");
    	return "demo/FrontPage";
    }
    
    //Fall sem sér um val á æfingu
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

