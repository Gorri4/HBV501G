package is.hi.byrjun.controller;

import java.util.ArrayList;

//import java.util.ArrayList;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import is.hi.byrjun.model.Eydufyllingar;
import is.hi.byrjun.model.Spurningar;
import is.hi.byrjun.service.EydufyllingaService;
import is.hi.byrjun.service.SpurningaService;
 
/**
 * Byrjunarcontroller sem stýrir hvað er gert þegar notandi eða viðmót
 * setur inn skipun 
 */

@Controller
@RequestMapping("/demo") // Request Mapping er gerð fyrir klasann til að slóðin byrji á /demo fyrir allar skipanir 
public class SpurningaHandler {
	
    // Tenging yfir í þjónustu klasa fyrir góðan daginn forritið 
	@Autowired
    SpurningaService spurningaService;
	@Autowired
	EydufyllingaService eydufyllingaService;
	
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
	int i = 3;
	int a = 3;
	
	SpurningaHandler(){
		
	}
	
	//Fall sem nær í nýja spurningu
	public void nySpurning(){
		/*
		ArrayList<Spurningar> spurningalisti;
		spurningalisti = (ArrayList)spurningaService.allarSpurningar();
		*/
		Spurningar spurning = spurningaService.getbyId(i);
		spurningKrossar = spurning.getSpurning();
		svarmoguleiki1 = spurning.getSvarmog1();
		svarmoguleiki2 = spurning.getSvarmog2();
		svarmoguleiki3 = spurning.getSvarmog3();
		svarmoguleiki4 = spurning.getSvarmog4();
		rettSvar = spurning.getrettSvar();
		
		Eydufyllingar spurninginEydu = eydufyllingaService.getbyId(i); 
		spurningEydu = spurninginEydu.getSpurning();
		svarmoguleiki1Eydu = spurninginEydu.getSvarmog1();
		svarmoguleiki2Eydu = spurninginEydu.getSvarmog2();
		svarmoguleiki3Eydu = spurninginEydu.getSvarmog3();
		svarmoguleiki4Eydu = spurninginEydu.getSvarmog4();
		rettSvarEydu = spurninginEydu.getrettSvar();
		
	}
	
	//Sækir síðuna /krossar og setur inn gildi á viðeigandi stað
	@RequestMapping("krossar")
    public String krossar (Model model) {
		/*
		ArrayList<Spurningar> spurningalisti;
		spurningalisti = (ArrayList)spurningaService.allarSpurningar();
		*/
		Spurningar spurning = spurningaService.getbyId(i);
		spurningKrossar = spurning.getSpurning();
		svarmoguleiki1 = spurning.getSvarmog1();
		svarmoguleiki2 = spurning.getSvarmog2();
		svarmoguleiki3 = spurning.getSvarmog3();
		svarmoguleiki4 = spurning.getSvarmog4();
		rettSvar = spurning.getrettSvar();
		System.out.println("réttSvar" + rettSvar);
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
    		a++;
    		nySpurning();
    		model.addAttribute("spurningin", spurningKrossar);
        	model.addAttribute("valmog1", svarmoguleiki1);
        	model.addAttribute("valmog2", svarmoguleiki2);
        	model.addAttribute("valmog3", svarmoguleiki3);
        	model.addAttribute("valmog4", svarmoguleiki4);
        	
    		return "demo/krossar";
    	}
    	//Ef rangt kemur sama spurning aftur
    	model.addAttribute("selected", answers); // Svari� sem var vali�
    	model.addAttribute("spurningin", spurningKrossar);
    	model.addAttribute("valmog1", svarmoguleiki1);
    	model.addAttribute("valmog2", svarmoguleiki2);
    	model.addAttribute("valmog3", svarmoguleiki3);
    	model.addAttribute("valmog4", svarmoguleiki4);
    	return "demo/krossar";
    }
    
    
    
    @RequestMapping("Valmynd")
    public String Valmynd (Model model) {
    	model.addAttribute("i", a);
    	return "demo/Valmynd";
    }
    
    //Fall sem sér um val á æfingu
    @RequestMapping(value="/valmynd", method=RequestMethod.POST)
    public String hvadValmynd (@RequestParam(value="button", required=false)
    String button, ModelMap model) {
    	model.addAttribute("button", button);
    	model.addAttribute("i", a);
    	if(button.equals("button1")){
    			i=3;
    			nySpurning();
    	    	model.addAttribute("spurningin", spurningKrossar);
    	    	model.addAttribute("valmog1", svarmoguleiki1);
    	    	model.addAttribute("valmog2", svarmoguleiki2);
    	    	model.addAttribute("valmog3", svarmoguleiki3);
    	    	model.addAttribute("valmog4", svarmoguleiki4);
    	    	return "demo/krossar";
    	}
    	
    	if(button.equals("button2") && a > 12){
    		i=13;
			nySpurning();
	    	model.addAttribute("spurningin", spurningKrossar);
	    	model.addAttribute("valmog1", svarmoguleiki1);
	    	model.addAttribute("valmog2", svarmoguleiki2);
	    	model.addAttribute("valmog3", svarmoguleiki3);
	    	model.addAttribute("valmog4", svarmoguleiki4);
	    	return "demo/krossar";
	}
    	
    	if(button.equals("button3") && a > 22){
    		i=23;
			nySpurning();
	    	model.addAttribute("spurningin", spurningKrossar);
	    	model.addAttribute("valmog1", svarmoguleiki1);
	    	model.addAttribute("valmog2", svarmoguleiki2);
	    	model.addAttribute("valmog3", svarmoguleiki3);
	    	model.addAttribute("valmog4", svarmoguleiki4);
	    	return "demo/krossar";
	}
    	
    	if(button.equals("button4") && a > 32){
    		i=1;
			nySpurning();
	    	model.addAttribute("spurningin", spurningEydu);
	    	model.addAttribute("valmog1", svarmoguleiki1Eydu);
	    	model.addAttribute("valmog2", svarmoguleiki2Eydu);
	    	model.addAttribute("valmog3", svarmoguleiki3Eydu);
	    	model.addAttribute("valmog4", svarmoguleiki4Eydu);
	    	return "demo/eyduFyllingar";
	}
    	if(button.equals("button5") && a > 52){
    	i=21;
    	nySpurning();
    	model.addAttribute("spurningin", spurningEydu);
    	model.addAttribute("valmog1", svarmoguleiki1Eydu);
    	model.addAttribute("valmog2", svarmoguleiki2Eydu);
    	model.addAttribute("valmog3", svarmoguleiki3Eydu);
    	model.addAttribute("valmog4", svarmoguleiki4Eydu);
    	 return "demo/eyduFyllingar";
    }
    	return "demo/Valmynd";
   }
    
    
    //Fall nær í eyðufyllingasíðu
	@RequestMapping("eyduFyllingar")
    public String eyduFyllingar (Model model) {
		Eydufyllingar spurninginEydu = eydufyllingaService.getbyId(i); 
		spurningEydu = spurninginEydu.getSpurning();
		svarmoguleiki1Eydu = spurninginEydu.getSvarmog1();
		svarmoguleiki2Eydu = spurninginEydu.getSvarmog2();
		svarmoguleiki3Eydu = spurninginEydu.getSvarmog3();
		svarmoguleiki4Eydu = spurninginEydu.getSvarmog4();
		rettSvarEydu = spurninginEydu.getrettSvar();
		System.out.println("réttSvar" + rettSvar);
    	
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
    		
    		a++;
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
    		model.addAttribute("selected", answers);
    		model.addAttribute("spurningin", spurningEydu);
    		model.addAttribute("valmog1", svarmoguleiki1Eydu);
    		model.addAttribute("valmog2", svarmoguleiki2Eydu);
    		model.addAttribute("valmog3", svarmoguleiki3Eydu);
    		model.addAttribute("valmog4", svarmoguleiki4Eydu);
    		return "demo/eyduFyllingar";
    	}
    }
    
    

    
}
