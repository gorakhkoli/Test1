package com.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WishController implements Controller 
{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception 
	{
		ModelAndView modelAndView = new ModelAndView("wish", "mesage", " gorakh");
		return modelAndView;
	}

}
