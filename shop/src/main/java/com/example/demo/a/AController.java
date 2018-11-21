package com.example.demo.a;

import org.springframework.stereotype.Controller;

@Controller	
public class AController {
	public String start() {
		System.out.println();
		return "a/index";
	}
}
