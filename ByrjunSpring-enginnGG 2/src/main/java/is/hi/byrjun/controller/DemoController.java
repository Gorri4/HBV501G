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
	
	SpurningaHandler spurnhandl = new SpurningaHandler();
	String spurningKrossar;
	String svarmoguleiki1;
	String svarmoguleiki2;
	String svarmoguleiki3;
	String svarmoguleiki4;
	String rettSvar;
	
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
    public String hvad (@RequestParam(value="answers", required=false)
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
    	return "demo/krossarRangt";
    }
}
