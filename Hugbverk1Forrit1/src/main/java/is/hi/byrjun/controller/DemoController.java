package is.hi.byrjun.controller;

import java.util.List;
//import java.util.ArrayList;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import is.hi.byrjun.model.Spurningar;
import is.hi.byrjun.service.SpurningaService;
 /**
 * Byrjunarcontroller sem stýrir hvað er gert þegar notandi eða viðmót
 * setur inn skipun 
 */

@Controller
@RequestMapping("/demo") // Request Mapping er gerð fyrir klasann til að slóðin byrji á /demo fyrir allar skipanir 
public class DemoController {
	
    // Tenging yfir í þjónustu klasa fyrir góðan daginn forritið 
	@Autowired
    SpurningaService spurningaService;


    @RequestMapping("/notandi")
    public String notandi(Model model) {
        model.addAttribute("nafn", "Ebba Þóra");
        return "demo/synaNotandi";
    }
	
    String spurningKrossar;
	String svarmoguleiki1;
	String svarmoguleiki2;
	String svarmoguleiki3;
	String svarmoguleiki4;
	String rettSvar;
	String spurningEydu;
	String svarmoguleiki1Eydu;
	String svarmoguleiki2Eydu;
	String svarmoguleiki3Eydu;
	String svarmoguleiki4Eydu;
	String rettSvarEydu;
	
	//Teljari sem er notaður sem ID spurninga
	int i = 0;
	
	DemoController(){
		nySpurning();
	}
	
	//Fall sem nær í nýja spurningu
	public void nySpurning(){
		//List<Spurningar> spurningalisti = spurningaService.allirKennarar();
		//String x = spurningalisti.get(0).getSpurning();
		//System.out.println(x);
	//spurningKrossar = spurnhandl.getSpurning(i).getSpurning();
	//svarmoguleiki1 = spurnhandl.getSpurning(i).getSvarmog1();
	//svarmoguleiki2 = spurnhandl.getSpurning(i).getSvarmog2();
	//svarmoguleiki3 = spurnhandl.getSpurning(i).getSvarmog3();
	//svarmoguleiki4 = spurnhandl.getSpurning(i).getSvarmog4();
	//rettSvar = spurnhandl.getSpurning(i).getrettSvar();
	
	//spurningEydu = spurnhandl.getEydufyllingar(i).getSpurning();
	//svarmoguleiki1Eydu = spurnhandl.getEydufyllingar(i).getSvarmog1();
	//svarmoguleiki2Eydu = spurnhandl.getEydufyllingar(i).getSvarmog2();
	//svarmoguleiki3Eydu = spurnhandl.getEydufyllingar(i).getSvarmog3();
	//svarmoguleiki4Eydu = spurnhandl.getEydufyllingar(i).getSvarmog4();
	//rettSvarEydu = spurnhandl.getEydufyllingar(i).getrettSvar();
	
	}
	
	//Sækir síðuna /krossar og setur inn gildi á viðeigandi stað
	@RequestMapping("krossar")
    public String krossar (Model model) {
		System.out.println("Adding question");
		Spurningar spurning = new Spurningar("sdf","sdfsdf","sdfsdf","sdfsd","sdf","sdf");
		spurningaService.addSpurning(spurning);
		List<Spurningar> spurningalisti = spurningaService.allarSpurningar();
		spurningKrossar = spurningalisti.get(1).getSpurning();
		System.out.println(spurningKrossar);
	//	svarmoguleiki1 = spurningalisti.get(i).getSvarmog1();
	//	svarmoguleiki2 = spurningalisti.get(i).getSvarmog2();
	//	svarmoguleiki3 = spurningalisti.get(i).getSvarmog3();
	//	svarmoguleiki4 = spurningalisti.get(i).getSvarmog4();
    	model.addAttribute("spurningin", spurningKrossar);
    	model.addAttribute("valmog1", svarmoguleiki1);
    	model.addAttribute("valmog2", svarmoguleiki2);
    	model.addAttribute("valmog3", svarmoguleiki3);
    	model.addAttribute("valmog4", svarmoguleiki4);
    	return "demo/krossar";
    }
	
	
	//Fall sem sækir valið gildi úr Forminu
    @RequestMapping(value="/krossar", method=RequestMethod.POST)
    public String hvader (@RequestParam(value="answers", required=false)
    String answers, ModelMap model) {
    	model.addAttribute("answers", answers);
    	if (answers.equals(rettSvar)) {  	
    		//Ef svarið er rétt hækkar teljari um einn og nær í nýja spurningu 
    		i++;
    		nySpurning();
    		
    		model.addAttribute("spurningin", spurningKrossar);
        	model.addAttribute("valmog1", svarmoguleiki1);
        	model.addAttribute("valmog2", svarmoguleiki2);
        	model.addAttribute("valmog3", svarmoguleiki3);
        	model.addAttribute("valmog4", svarmoguleiki4);
        	
    		return "demo/krossar";
    	}
    	//Ef rangt kemur sama spurning aftur
    	model.addAttribute("spurningin", spurningKrossar);
    	model.addAttribute("valmog1", svarmoguleiki1);
    	model.addAttribute("valmog2", svarmoguleiki2);
    	model.addAttribute("valmog3", svarmoguleiki3);
    	model.addAttribute("valmog4", svarmoguleiki4);
    	return "demo/krossarRangt";
    }
    
    
    
    @RequestMapping("Valmynd")
    public String Valmynd () {
    	return "demo/Valmynd";
    }
    
    //Fall sem sér um val á æfingu
    @RequestMapping(value="/valmynd", method=RequestMethod.POST)
    public String hvadValmynd (@RequestParam(value="button", required=false)
    String button, ModelMap model) {
    	model.addAttribute("button", button);
    	if(button.equals("button1")){
    	    	model.addAttribute("spurningin", spurningKrossar);
    	    	model.addAttribute("valmog1", svarmoguleiki1);
    	    	model.addAttribute("valmog2", svarmoguleiki2);
    	    	model.addAttribute("valmog3", svarmoguleiki3);
   	    	model.addAttribute("valmog4", svarmoguleiki4);
    	    	return "demo/krossar";
    	}
    	else
    	model.addAttribute("spurningin", spurningEydu);
    	model.addAttribute("valmog1", svarmoguleiki1Eydu);
    	model.addAttribute("valmog2", svarmoguleiki2Eydu);
    	model.addAttribute("valmog3", svarmoguleiki3Eydu);
    	model.addAttribute("valmog4", svarmoguleiki4Eydu);
    	 return "demo/eyduFyllingar";
    }
    
    //Fall nær í eyðufyllingasíðu
    @RequestMapping("eyduFyllinar")
    public String eyduFyllingar (Model model) {
    	model.addAttribute("spurningin", spurningEydu);
    	model.addAttribute("valmog1", svarmoguleiki1Eydu);
    	model.addAttribute("valmog2", svarmoguleiki2Eydu);
    	model.addAttribute("valmog3", svarmoguleiki3Eydu);
    	model.addAttribute("valmog4", svarmoguleiki4Eydu);
    	return "demo/eyduFyllingar";
    }
	
    //Fall sem sækir valið svar úr eyðufyllingum
    @RequestMapping(value="/eyduFyllingar", method=RequestMethod.POST)
    public String eyduFyll (@RequestParam(value="answers", required=false)
    String answers, ModelMap model) {
    	model.addAttribute("answers", answers);
    	if (answers.equals(rettSvarEydu)) {  	
    		
    		i++;
    		nySpurning();
    		
    		model.addAttribute("spurningin", spurningEydu);
    		model.addAttribute("valmog1", svarmoguleiki1Eydu);
        	model.addAttribute("valmog2", svarmoguleiki2Eydu);
        	model.addAttribute("valmog3", svarmoguleiki3Eydu);
        	model.addAttribute("valmog4", svarmoguleiki4Eydu);
        	
    		return "demo/eyduFyllingar";
    	}
    	else{
    	model.addAttribute("spurningin", spurningEydu);
    	model.addAttribute("valmog1", svarmoguleiki1Eydu);
    	model.addAttribute("valmog2", svarmoguleiki2Eydu);
    	model.addAttribute("valmog3", svarmoguleiki3Eydu);
    	model.addAttribute("valmog4", svarmoguleiki4Eydu);
    	return "demo/eyduFyllingarRangt";
    	}
    }
    
    /*
     * @return skilar Login s��una
     */
	
    @RequestMapping("Login")
    public String Login () {
    	return "demo/Login";
    }
    
    /**
     * @param params Geymir notendanafni� og lykilor�i�
     * @return Skilar s�mu s��u me� villuskilabo� e�a Valmyndars��una
     */
    
    //Fall sem athugar hvort Login sé rétt
	
    @RequestMapping(value="/Login", method=RequestMethod.POST)
    public String login (@RequestParam("loginInfo") List<String> params) {
    	
    	String user = params.get(0);
    	String password = params.get(1);
    	
    	LoginHandler login = new LoginHandler(user, password);
    	
    	if (login.checkLoginInfo()) {
    		return "demo/Valmynd";
    	}
    	return "demo/LoginRangt";
    	
    }
    
}
