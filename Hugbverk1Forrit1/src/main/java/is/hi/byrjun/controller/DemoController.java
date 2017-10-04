package is.hi.byrjun.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 /**
 * Byrjunarcontroller sem stýrir hvað er gert þegar notandi eða viðmót
 * setur inn skipun 
 */

@Controller
@RequestMapping("/demo") // Request Mapping er gerð fyrir klasann til að slóðin byrji á /demo fyrir allar skipanir 
public class DemoController {
	//virkar já?asdfasdfasf
	SpurningaHandler spurnhandl = new SpurningaHandler();
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
	
	
	int i = 0;
	
	DemoController(){
		nySpurning();
	}
	
	public void nySpurning(){
	spurningKrossar = spurnhandl.getSpurning(i).getSpurning();
	svarmoguleiki1 = spurnhandl.getSpurning(i).getSvarmog1();
	svarmoguleiki2 = spurnhandl.getSpurning(i).getSvarmog2();
	svarmoguleiki3 = spurnhandl.getSpurning(i).getSvarmog3();
	svarmoguleiki4 = spurnhandl.getSpurning(i).getSvarmog4();
	rettSvar = spurnhandl.getSpurning(i).getrettSvar();
	
	spurningEydu = spurnhandl.getEydufyllingar(i).getSpurning();
	svarmoguleiki1Eydu = spurnhandl.getEydufyllingar(i).getSvarmog1();
	svarmoguleiki2Eydu = spurnhandl.getEydufyllingar(i).getSvarmog2();
	svarmoguleiki3Eydu = spurnhandl.getEydufyllingar(i).getSvarmog3();
	svarmoguleiki4Eydu = spurnhandl.getEydufyllingar(i).getSvarmog4();
	rettSvarEydu = spurnhandl.getEydufyllingar(i).getrettSvar();
	}
	
	@RequestMapping("krossar")
    public String krossar (Model model) {
    	model.addAttribute("spurningin", spurningKrossar);
    	model.addAttribute("valmog1", svarmoguleiki1);
    	model.addAttribute("valmog2", svarmoguleiki2);
    	model.addAttribute("valmog3", svarmoguleiki3);
    	model.addAttribute("valmog4", svarmoguleiki4);
    	return "demo/krossar";
    }
	
    @RequestMapping(value="/krossar", method=RequestMethod.POST)
    public String hvader (@RequestParam(value="answers", required=false)
    String answers, ModelMap model) {
    	model.addAttribute("answers", answers);
    	if (answers.equals(rettSvar)) {  	
    		
    		i++;
    		nySpurning();
    		
    		model.addAttribute("spurningin", spurningKrossar);
        	model.addAttribute("valmog1", svarmoguleiki1);
        	model.addAttribute("valmog2", svarmoguleiki2);
        	model.addAttribute("valmog3", svarmoguleiki3);
        	model.addAttribute("valmog4", svarmoguleiki4);
        	
    		return "demo/krossar";
    	}
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
    
    @RequestMapping("eyduFyllinar")
    public String eyduFyllingar (Model model) {
    	model.addAttribute("spurningin", spurningEydu);
    	model.addAttribute("valmog1", svarmoguleiki1Eydu);
    	model.addAttribute("valmog2", svarmoguleiki2Eydu);
    	model.addAttribute("valmog3", svarmoguleiki3Eydu);
    	model.addAttribute("valmog4", svarmoguleiki4Eydu);
    	return "demo/eyduFyllingar";
    }
	
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
    
    
}
