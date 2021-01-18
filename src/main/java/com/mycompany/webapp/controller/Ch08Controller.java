package com.mycompany.webapp.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.webapp.dto.Ch07Board;


@Controller
@RequestMapping("/ch08")
public class Ch08Controller {
	private static final Logger logger = LoggerFactory.getLogger(Ch08Controller.class);
	
	@GetMapping("/content")
	public String content() {
		logger.info("실행");
		return "ch08/content";
	}
	
	@GetMapping("/method1")
	public String method1(HttpSession session) {
		session.setAttribute("name","지우");
		session.setAttribute("age",17);
		session.setAttribute("job","피카츄 노예");
		
		return "ch08/el";
	}
	
	@GetMapping("/method2")
	public String method2(HttpSession session) {
		
		Ch07Board pocketmon = new Ch07Board();
		pocketmon.setName("eevee");
		pocketmon.setPersonality("flower");
		pocketmon.setAge(5);
		pocketmon.setBirthday(new Date());
		session.setAttribute("pocketmonBook", pocketmon);
		
		return "ch08/el";
		
	}
	
	@GetMapping("/method22")
	public String method22(HttpSession session) {
		
		Ch07Board pocketmon = new Ch07Board();
		pocketmon.setName("꼬부기");
		pocketmon.setPersonality("물");
		pocketmon.setAge(4);
		pocketmon.setBirthday(new Date());
		session.setAttribute("pocketmonBook", pocketmon);
		
		return "ch08/el";
	}
	
	@GetMapping("/method3")
	public String method3(HttpSession session) {
		List<Ch07Board> pocketmonList = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			Ch07Board pocketmon = new Ch07Board();
			pocketmon.setName("꼬부기"+i);
			pocketmon.setPersonality("물"+i);
			pocketmon.setAge(4+i);
			pocketmon.setBirthday(new Date());
			pocketmonList.add(pocketmon);
		}
		session.setAttribute("pocketmonList", pocketmonList);
		return "ch08/el";
	}
	
	
}
