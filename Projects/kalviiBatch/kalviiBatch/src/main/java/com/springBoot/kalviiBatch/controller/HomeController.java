package com.springBoot.kalviiBatch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/homeController")     
@RestController
public class HomeController {
      
	@GetMapping("/home")
	String welcomeMSG()
	{
		return "welcome Home!";
	}
	
}
