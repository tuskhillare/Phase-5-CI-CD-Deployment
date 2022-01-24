package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class User {

	@ResponseBody
	@RequestMapping("/")
public String  init ()
	{
		
		return "CI-CD Deployment using Jenkins+Docker into AWS EC2.Developed by Tushar Khillare";
		
	}

}

