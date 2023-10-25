package com.ssafy.product.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafy.product.dto.Member;
import com.ssafy.product.model.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	private final MemberService memberService;

	public MemberController(MemberService memService) {
		super();
		this.memberService = memService;
	}
	
	@GetMapping("/login")
	public String login() {
		return "member/login";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute Member member, HttpSession httpSession) {
		
		if(memberService.login(member) != null) {
			httpSession.setAttribute("userinfo", member);
		}
		return "redirect: /product";
	}
}
