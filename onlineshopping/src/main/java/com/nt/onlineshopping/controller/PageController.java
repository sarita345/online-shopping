package com.nt.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		System.out.println("gggggggggggggggggggggg");
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("gretting","welcome to spring mvc");
		return mv;
		
		
	}
	
	@RequestMapping(value="/test")
	//public ModelAndView test(@RequestParam("greeting") String greeting) {
		public ModelAndView test(@RequestParam(value="greeting",required=false)String greeting){
		if(greeting==null) {
			greeting="Hello there";
		}
		System.out.println("ffffffffffffff");
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("gretting",greeting);
		return mv;
		
		
	}
	
	
	@RequestMapping(value="/test1/{greeting}")
	public ModelAndView exam(@PathVariable("greeting") String greeting) {
		System.out.println("ffffffffffffff");
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("gretting",greeting);
		return mv;
		
		
	}
	

}
