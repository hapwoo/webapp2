package com.mycompany.webapp.dto;

import org.springframework.web.multipart.MultipartFile;

public class Ch09Pocketmon {
	private String pname;
	private String ppersonality;
	private String ppassword;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPpersonality() {
		return ppersonality;
	}
	public void setPpersonality(String ppersonality) {
		this.ppersonality = ppersonality;
	}
	public String getPpassword() {
		return ppassword;
	}
	public void setPpassword(String ppassword) {
		this.ppassword = ppassword;
	}
	public MultipartFile getPphoto() {
		return pphoto;
	}
	public void setPphoto(MultipartFile pphoto) {
		this.pphoto = pphoto;
	}
	private MultipartFile pphoto;
}
