package com.personalpage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandingController {

	@RequestMapping({"/", ""})
	public String home() {
		return "index";
	}
	
}
