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
 * SpurningaHandler sem stýrir hvað er gert þegar notandi eða viðmót
 * setur inn skipun 
 */

@Controller
@RequestMapping("/demo") // Request Mapping er gerð fyrir klasann til að slóðin byrji á /demo fyrir allar skipanir 
public class SpurningaHandler {
	
    // Tenging yfir í þjónustu klasa fyrir forritið 
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
	int s = 3;
	//Teljari fyrir heildarfjölda rétt svaraðra spurninga notenda
	static int a = 3;
	//Boolena breyta sem segir til um hvort spurningin er krossaspurning eða ekki
	boolean kross;
	
	
	SpurningaHandler(){

	}
	
	public static void resetA(){
		System.out.println("Gorr");
		a = 3;
		System.out.println(a);
	}
	
	/**
	 * 
	 * @param a
	 * @return boolean
	 * 
	 * Fall sem sækir nýja spurningu í gagnagrunn, ef spurningin fannst skilar fallir true annars false
	 */
	
	public boolean nySpurning(boolean a){
		if(a){
		try{
		Spurningar spurning = spurningaService.getbyId(i);
		spurningKrossar = spurning.getSpurning();
		svarmoguleiki1 = spurning.getSvarmog1();
		svarmoguleiki2 = spurning.getSvarmog2();
		svarmoguleiki3 = spurning.getSvarmog3();
		svarmoguleiki4 = spurning.getSvarmog4();
		rettSvar = spurning.getrettSvar();
		return true;
		}
		catch(NullPointerException e){
			return false;
		}
		}
		else{
			try{
		Eydufyllingar spurninginEydu = eydufyllingaService.getbyId(s); 
		spurningEydu = spurninginEydu.getSpurning();
		svarmoguleiki1Eydu = spurninginEydu.getSvarmog1();
		svarmoguleiki2Eydu = spurninginEydu.getSvarmog2();
		svarmoguleiki3Eydu = spurninginEydu.getSvarmog3();
		svarmoguleiki4Eydu = spurninginEydu.getSvarmog4();
		rettSvarEydu = spurninginEydu.getrettSvar();
		return true;
		}
		catch(NullPointerException e){
			return false;
		}
	  }
	}
	
	//Sækir síðuna /krossar og setur inn gildi á viðeigandi stað
	@RequestMapping("krossar")
    public String krossar (Model model) {
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
    	try{
    	if (answers.equals(rettSvar)) {
    		//Notandi getur ekki svarað sömu spurningunni aftur og komist lengra á þann hátt
    		if(i >= a){
    			a++;
    		}
    		i++;
    		kross = true;
    		if(i == 12 || i == 22 || i==32){
    			i++;
    			a++;
    			model.addAttribute("i", a);
    			return "demo/Valmynd";
    		}
    		if(nySpurning(kross)){
    		model.addAttribute("spurningin", spurningKrossar);
        	model.addAttribute("valmog1", svarmoguleiki1);
        	model.addAttribute("valmog2", svarmoguleiki2);
        	model.addAttribute("valmog3", svarmoguleiki3);
        	model.addAttribute("valmog4", svarmoguleiki4);
    		return "demo/krossar";
    		}
    		else{
    			model.addAttribute("i", a);
    			return "demo/Valmynd";
    		}
    	}
    	}
    	//Bregst við ef notandi velur engann valmöguleika og svo submit
    	catch(NullPointerException e){ 
        	model.addAttribute("spurningin", spurningKrossar);
        	model.addAttribute("valmog1", svarmoguleiki1);
        	model.addAttribute("valmog2", svarmoguleiki2);
        	model.addAttribute("valmog3", svarmoguleiki3);
        	model.addAttribute("valmog4", svarmoguleiki4);
        	return "demo/krossar";
		}
    	//Ef rangt kemur sama spurning aftur
    	model.addAttribute("selected", answers); 
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
    			kross = true;
    			if(nySpurning(kross)){
    	    	model.addAttribute("spurningin", spurningKrossar);
    	    	model.addAttribute("valmog1", svarmoguleiki1);
    	    	model.addAttribute("valmog2", svarmoguleiki2);
    	    	model.addAttribute("valmog3", svarmoguleiki3);
    	    	model.addAttribute("valmog4", svarmoguleiki4);
    	    	return "demo/krossar";
    			}
    			else{
    			model.addAttribute("i", a);
    			return "demo/Valmynd";
    			}
    	}
    	
    	if(button.equals("button2") && a > 12){
    		i=13;
    		kross = true;
    		if(nySpurning(kross)){
    	    	model.addAttribute("spurningin", spurningKrossar);
    	    	model.addAttribute("valmog1", svarmoguleiki1);
    	    	model.addAttribute("valmog2", svarmoguleiki2);
    	    	model.addAttribute("valmog3", svarmoguleiki3);
    	    	model.addAttribute("valmog4", svarmoguleiki4);
    	    	return "demo/krossar";
    			}
    			else{
    			model.addAttribute("i", a);
    			return "demo/Valmynd";
    			}
	}
    	
    	if(button.equals("button3") && a > 22){
    		i=23;
    		kross = true;
    		if(nySpurning(kross)){
    	    	model.addAttribute("spurningin", spurningKrossar);
    	    	model.addAttribute("valmog1", svarmoguleiki1);
    	    	model.addAttribute("valmog2", svarmoguleiki2);
    	    	model.addAttribute("valmog3", svarmoguleiki3);
    	    	model.addAttribute("valmog4", svarmoguleiki4);
    	    	return "demo/krossar";
    			}
    			else{
    			model.addAttribute("i", a);
    			return "demo/Valmynd";
    			}
	}
    	
    	if(button.equals("button4") && a > 31){
    		s=1;
    		kross = false;
			if(nySpurning(kross)){
	    	model.addAttribute("spurningin", spurningEydu);
	    	model.addAttribute("valmog1", svarmoguleiki1Eydu);
	    	model.addAttribute("valmog2", svarmoguleiki2Eydu);
	    	model.addAttribute("valmog3", svarmoguleiki3Eydu);
	    	model.addAttribute("valmog4", svarmoguleiki4Eydu);
	    	return "demo/eyduFyllingar";
			}
			else{
				model.addAttribute("i", a);
    			return "demo/Valmynd";
			}
	}
    	if(button.equals("button5") && a > 51){
    	s=21;
    	kross = false;
    	if(nySpurning(kross)){
    	model.addAttribute("spurningin", spurningEydu);
    	model.addAttribute("valmog1", svarmoguleiki1Eydu);
    	model.addAttribute("valmog2", svarmoguleiki2Eydu);
    	model.addAttribute("valmog3", svarmoguleiki3Eydu);
    	model.addAttribute("valmog4", svarmoguleiki4Eydu);
    	 return "demo/eyduFyllingar";
    	}
    	else{
    		model.addAttribute("i", a);
			return "demo/Valmynd";
    	}
    }
    	return "demo/Valmynd";
   }
    
    
    //Fall nær í eyðufyllingasíðu
	@RequestMapping("eyduFyllingar")
    public String eyduFyllingar (Model model) {
		Eydufyllingar spurninginEydu = eydufyllingaService.getbyId(s); 
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
    	try{
    	if (answers.equals(rettSvarEydu)) {
    		a++;
    		s++;
    		kross = false;
    		if(s == 20){
    			s++;
    			a++;
    			model.addAttribute("i", a);
    			return "demo/Valmynd";
    		}
    		if(nySpurning(kross)){
    		model.addAttribute("spurningin", spurningEydu);
    		model.addAttribute("valmog1", svarmoguleiki1Eydu);
        	model.addAttribute("valmog2", svarmoguleiki2Eydu);
        	model.addAttribute("valmog3", svarmoguleiki3Eydu);
        	model.addAttribute("valmog4", svarmoguleiki4Eydu);
        	
    		return "demo/eyduFyllingar";
    		}
    		else{
    			model.addAttribute("i", a);
    			return "demo/Valmynd";
    		}
    	}
    	}
    	//Bregst við ef notandinn velur ekkert og smellir á submit
    	catch(NullPointerException e){
    		model.addAttribute("spurningin", spurningEydu);
    		model.addAttribute("valmog1", svarmoguleiki1Eydu);
    		model.addAttribute("valmog2", svarmoguleiki2Eydu);
    		model.addAttribute("valmog3", svarmoguleiki3Eydu);
    		model.addAttribute("valmog4", svarmoguleiki4Eydu);
    		return "demo/eyduFyllingar";
		}
    	//Ef svarið var vitlaust
    		model.addAttribute("selected", answers);
    		model.addAttribute("spurningin", spurningEydu);
    		model.addAttribute("valmog1", svarmoguleiki1Eydu);
    		model.addAttribute("valmog2", svarmoguleiki2Eydu);
    		model.addAttribute("valmog3", svarmoguleiki3Eydu);
    		model.addAttribute("valmog4", svarmoguleiki4Eydu);
    		return "demo/eyduFyllingar";
    	}
    }
