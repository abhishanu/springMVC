package com.abhi.spring.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelANdView = new ModelAndView();
		modelANdView.setViewName("hello");
		modelANdView.addObject("name", "Abhi");
		return modelANdView;
	}
}
