package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/member/*")
@Controller
public class MemberController {

	@GetMapping("/join")
	public void join() {
		
	}
}
