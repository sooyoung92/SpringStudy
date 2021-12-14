package com.spring.study;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PageController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String indexForm(Model model) {
		model.addAttribute("hello", "안녕하세요. 반갑습니다. spring 수업입니다.");
		return "index/index";
	}
	
	
}
// 기본적인 Component 4가지
// Controller - page관련, 
// Service - 로직관련,Repository로 요청을 전달후 받은 응답을 로직에 넣고 나온 리턴값을 Controller로 전달.
// Repository - db와 소통한 값을 Service한테 전달. 
// Configuration - 설정에 대한 것