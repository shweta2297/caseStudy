package com.example.demo.controllerr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WelcomeController {

	@RequestMapping(value="/")
	public String init(Model model) {
		
		
		model.addAttribute("heading","Car Details");
		
		return "index";
	}
}
