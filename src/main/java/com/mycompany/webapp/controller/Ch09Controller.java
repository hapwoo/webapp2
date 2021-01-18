package com.mycompany.webapp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.webapp.dto.Ch09Pocketmon;

@Controller
@RequestMapping("/ch09")
public class Ch09Controller {
	private static final Logger logger = LoggerFactory.getLogger(Ch09Controller.class);
	
	@GetMapping("/content")
	public String content() {
		logger.info("실행");
		return "ch09/content";
	}
	
	@PostMapping("/pocketmonphotoupload")
	public String pocketmonphotoUpload(Ch09Pocketmon pocketmon) {
		//문자파트 정보얻기
		String pname = pocketmon.getPname();
		String ppersonality = pocketmon.getPpersonality();
		String ppassword = pocketmon.getPpassword();
		logger.info("pname :" + pname);
		logger.info("ppersonality :" + ppersonality);
		logger.info("ppassword :" + ppassword);
		
		//파일파트 정보얻기
		MultipartFile pphoto = pocketmon.getPphoto();
		if(!pphoto.isEmpty()) {
			String originalFileName = pphoto.getOriginalFilename();
			String contentType = pphoto.getContentType();
			long size = pphoto.getSize();
			
			logger.info("originalFileName :" + originalFileName);
			logger.info("contentType :" + contentType);
			logger.info("size :" + size);
			
			//파일 저장 이름 및 경로
			String saveDirPath = "D:/MyWorkspace/uploadfiles/";
			String fileName = new Date().getTime() + "-" + originalFileName;
			String filePath = saveDirPath + fileName;
			File file = new File(filePath);
			try {
				pphoto.transferTo(file);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		return "redirect:/ch09/content";
	}
	
	@GetMapping("/photolist")
	public String photoList(Model model) {
		String saveDirPath = "D:/MyWorkspace/uploadfiles/";
		File dir = new File(saveDirPath);
		String[] fileNames = dir.list();
		model.addAttribute("fileNames",fileNames);
		return "ch09/photolist";
	}
	
	@GetMapping("/photodownload")
	public void photoDownload(String photo, HttpServletResponse response) {
		String saveDirPath = "D:/MyWorkspace/uploadfiles/";
		String filePath = saveDirPath + photo;
		
		
		//응답 헤더에 응답 본문 데이터의 종류를 추가
		try {
			// HTTP 규약에 따라 헤더에는 한글을 넣지 못함.
			// 따라서 UTF-8을 다시 ISO-8859-1로 인코딩해야함
			photo = new String(photo.getBytes("UTF-8"), "ISO-8859-1");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		response.setContentType("image/jpg");
		response.setContentType("image/png");
		
		//응답 본문 데이터를 파일로 다운로드 할 수 있도록 응답 헤더에 추가
		response.setHeader("Content-Disposition", "attachment; filename=\""+ photo + "\"");
		
		try {
			OutputStream os = response.getOutputStream();
			InputStream is = new FileInputStream(filePath);
			byte[] data = new byte[1024];
			while (true) {
				int readByteNum = is.read(data);
				if(readByteNum == -1) break;
				os.write(data, 0, readByteNum);
			}
			os.flush();
			os.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	

	
}
