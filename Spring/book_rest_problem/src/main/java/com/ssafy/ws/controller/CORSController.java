package com.ssafy.ws.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cors")
public class CORSController {
	
	@GetMapping
	@ResponseBody
	public String test01() {
		System.out.println("test01() 실행");
		return "hi";
	}
	
	@GetMapping("/test02")
	@ResponseBody
	@CrossOrigin("http://127.0.0.1:5500")
	public String test02(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1:5500");
		return "hi";
	}
}
