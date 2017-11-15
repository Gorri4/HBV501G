package is.hi.byrjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Redirect {
	@RequestMapping(value ="/", method = RequestMethod.GET)
		public String root() {
		System.out.println("yo");
			return "redirect:/demo/FrontPage";
		}
	}

