package com.example.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.StatusUpdate;
import com.example.service.StatusUpdateService;

@Controller
public class PageController {
	@Autowired
	private StatusUpdateService statusUpdateService; 
	@RequestMapping("/")
	String home() {
		return "app.homepage";
	}
	
	@RequestMapping("/about")
	String about() {
		return "app.about";
	}
	
	@RequestMapping(value="/addstatus",method=RequestMethod.GET)
	ModelAndView addStatus(ModelAndView modelAndView) {
	StatusUpdate status= new StatusUpdate();
	StatusUpdate getLatesStatusUpdate=statusUpdateService.getLatest();
	modelAndView.setViewName("app.addStatus");
	modelAndView.getModel().put("statusUpdate", status);
	modelAndView.getModel().put("getLatesStatusUpdate", getLatesStatusUpdate);	
		return modelAndView;
	}
	
	@RequestMapping(value="/addstatus",method=RequestMethod.POST)
	ModelAndView addStatus(ModelAndView modelAndView, StatusUpdate statusUpdate) {
	
	
	modelAndView.setViewName("app.addStatus");
	
	statusUpdateService.save(statusUpdate); 
	StatusUpdate getLatesStatusUpdate=statusUpdateService.getLatest();
	modelAndView.getModel().put("getLatesStatusUpdate", getLatesStatusUpdate);	
		return modelAndView;
	}
}
