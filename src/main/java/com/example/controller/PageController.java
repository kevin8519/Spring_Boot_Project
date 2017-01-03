package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.StatusUpdate;
import com.example.service.StatusUpdateService;

@Controller
public class PageController {
	
	@Autowired
	private StatusUpdateService statusUpdateService; 
	
	@RequestMapping("/")
	
	ModelAndView home(ModelAndView modelAndview) {
		
		StatusUpdate statusUpdate=statusUpdateService.getLatest();
		modelAndview.getModel().put("statusUpdate", statusUpdate);
		
		modelAndview.setViewName("app.homepage");
		
		
		
		return modelAndview;
	}
	
	@RequestMapping("/about")
	String about() {
		return "app.about";
	}
	
	
	
}
