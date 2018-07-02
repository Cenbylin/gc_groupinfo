package com.neuedu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.service.TranslateService;

@Controller
@RequestMapping("translate")
public class TranslateController {
	
	@Autowired
	TranslateService translateService;
	
	@RequestMapping("findAll")
	public String findAllTranslate(HttpServletRequest request) {
		request.setAttribute("findAll", translateService.findAllTranslate());
		return "daiopeixinxi";
	}
	
	@RequestMapping("findAll2")
	public String findAll(HttpServletRequest request) {
		request.setAttribute("listTpjl", translateService.selectAll());
		return "tiaopeijilu";		
	}
	
	@RequestMapping("findBytpbh")
	public String findBytpbh( HttpServletRequest request, String zha ) {
		request.setAttribute("listTpjl", translateService.findBytpbh(Integer.parseInt(zha)));
		return "tiaopeijilu";
	}

}
