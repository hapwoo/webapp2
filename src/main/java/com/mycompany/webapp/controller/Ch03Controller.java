package com.mycompany.webapp.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.webapp.dto.Ch03Dto;


@Controller
@RequestMapping("/ch03")
public class Ch03Controller {
	private static final Logger logger = LoggerFactory.getLogger(Ch03Controller.class);
	
	@RequestMapping("/content")
	public String content() {
		logger.info("실행");
		return "ch03/content";
	}
	
	@RequestMapping("/method1")
	public String method1(String param1, int param2, @DateTimeFormat(pattern="yyyy-MM-dd") Date param3) {
		logger.info("param1:" + param1);
		logger.info("param2:" + param2);
		logger.info("param3:" + param3);
		return "ch03/content";
	}
	
	@RequestMapping("/method2")
	public String method2(@RequestParam("param1")String arg1, @RequestParam("param2")int arg2, @DateTimeFormat(pattern="yyyy-MM-dd")@RequestParam("param3")Date arg3) {
		logger.info("param1:" + arg1);
		logger.info("param2:" + arg2);
		logger.info("param3:" + arg3);
		return "ch03/content";
	}
	
	@RequestMapping("/method3")
	public String method3(String param1, @RequestParam(defaultValue = "0") int param2, @RequestParam(defaultValue = "0") @DateTimeFormat(pattern="yyyy-MM-dd") Date param3) {
		logger.info("param1:" + param1);
		logger.info("param2:" + param2);
		logger.info("param3:" + param3);
		return "ch03/content";
	}
	
	@RequestMapping("/method4")
	public String method4(Ch03Dto dto) {
		logger.info("param1:" + dto.getParam1());
		logger.info("param2:" + dto.getParam2());
		logger.info("param3:" + dto.getParam3());
		return "ch03/content";
	}

}
