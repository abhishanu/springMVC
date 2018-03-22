package com.abhi.spring.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.abhi.spring.springMVC.controller.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/emplpyeeData")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");

		Employee employee = new Employee();
		employee.setId(1);
		employee.setSalary(10000.0);
		employee.setName("AK");

		modelAndView.addObject("emp", employee);

		return modelAndView;
	}
}
