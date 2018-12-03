package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
 
public class HelloNameController implements Controller{
 
	//@Override
	public ModelAndView handleRequest(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		
		String name = request.getParameter("name");
 
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("Message", "Hello "+name);
		
		return modelandview;
	}
}