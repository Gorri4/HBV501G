package is.hi.byrjun.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	String[] users;
	String[] passwords;
	
    
	@RequestMapping("Login")
    public String Login () {
    	return "demo/Login";
    }


	
    //Fall sem athugar hvort Login sé rétt	
    @RequestMapping(value="/Login", method=RequestMethod.POST)
    public String login (@RequestParam("loginInfo") List<String> params) {
    	
    	String user = params.get(0);
    	String password = params.get(1);
    	Login notandi = new Login("Gummi","1234");
    	loginService.addNotandi(notandi);
    	System.out.println("Notanda batt vid");
    	//ArrayList<Login> notendur = (ArrayList)loginService.allirNotendur();
    	//for(int s = 0; s < notendur.size() ; s++){
		//	users[s] = notendur.get(s).getUser();
		//	passwords[s] = notendur.get(s).getPassword();
		//}
    	//
    	//if (checkLoginInfo(user,password)) {
    	//	return "demo/Valmynd";
    	//}
    	return "demo/LoginRangt";
    	
    }
	
	/**
	 * K�kir hvort notendanafni� og passwordi� passar.
	 * 
	 * @return true ef notendanafn og lykilor� er r�tt, false annars
	 */
	
	public boolean checkLoginInfo(String user, String password) {
		for (int i = 0; i < 4; i++) {
			if (user.equals(users[i]) && password.equals(passwords[i]))
				return true;
		}
		return false;
	}
	
}

