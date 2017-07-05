package me.jaegyu.url.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UrlManagerWebController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/create", method = RequestMethod.GET)
	public String create(){
		return "create";
	}
}
