package com.spring.main;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		
		model.addAttribute("hello","world");
		
		return "main";
	}
	
	@RequestMapping(value = "/main/main2", method = RequestMethod.GET)
	public String main2(Locale locale, Model model) {
		
		model.addAttribute("hello","world");
		
		return "main2";
	}
}
