package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/ch02")
public class Ch02Controller {
	private static final Logger logger = LoggerFactory.getLogger(Ch02Controller.class);
	
	@RequestMapping("/content")
	public String content() {
		logger.info("실행");
		return "ch02/content";
	}
	
	@RequestMapping("/request1")
	public String request1() {
		logger.info("실행");
		return "ch02/content";
	}
	
	@RequestMapping("/request2")
	public String request2() {
		logger.info("실행");
		return "ch02/content";
	}
	
	@RequestMapping("/dahye")
	public String dahyeJJang() {
		logger.info("실행");
		return "ch02/content";
	}
	
	@RequestMapping("/goodjob")
	public String good() {
		logger.info("실행되었습니다.");
		return "ch02/imGood";
	}
	
	@RequestMapping(value="/getMethod_", method=RequestMethod.GET) //GET만 지원
	public String get_Method() {
		logger.info("실행");
		return "ch02/content";
	}
	
	@RequestMapping(value="/postMethod_", method=RequestMethod.POST)
	public String post_Method() {
		logger.info("실행");
		return "ch02/content";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String joinForm() {
		logger.info("실행되었습니다.");
		return "ch02/joinForm";
	}
	
	@GetMapping("/joinAsync")
	public String joinFormAsync() {
		logger.info("회원가입 페이지");
		return "ch02/joinFormAsync";
	}
	
	@PostMapping("join")
	public String join() {
		logger.info("회원가입 처리함");
		return "ch02/content";
	}
	
	@GetMapping("eevee")
	public String eevee() {
		logger.info("이브이를 키워봅시다.");
		return "ch02/eevee";
	}
	
	@PostMapping("/water")
	public String water() {
		logger.info("샤미드로 진화했다!");
		return "ch02/water";
	}
	
	@PostMapping("thunder")
	public String thunder() {
		logger.info("쥬피썬더로 진화했다!");
		return "ch02/thunder";
	}
	
	@PostMapping("fire")
	public String fire() {
		logger.info("부스터로 진화했다!");
		return "ch02/fire";
	}
	
	@PostMapping("grass")
	public String grass() {
		logger.info("리피아로 진화했다!");
		return "ch02/grass";
	}
	
	@PostMapping("ice")
	public String ice() {
		logger.info("글레이시아로 진화했다!");
		return "ch02/ice";
	}
	
}
