package com.abhi.spring.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.abhi.spring.springMVC.controller.model.User;

@Controller
public class RequestParamController {

	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");

		modelAndView.addObject("id", id);
		modelAndView.addObject("name", name);

		System.out.println(id + name);

		return modelAndView;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("user") User user) {
		ModelAndView modelAndView = new ModelAndView();
		if (user.getId() == 123) {
			modelAndView.setViewName("success");
		}
		else {
			modelAndView.setViewName("error");
		}
		System.out.println(user);
		modelAndView.addObject("userDetails", user);

		return modelAndView;
	}

	@RequestMapping(value = "/moreData")
	public ModelAndView details(@RequestParam("city") String city) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("details");
		modelAndView.addObject("city", city);
		System.out.println("city:" + city);
		return modelAndView;
	}

	@RequestMapping(value = "/more", method = RequestMethod.GET)
	public ModelAndView redirect() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("more");

		return modelAndView;
	}
}
