package com.neuedu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.service.ScrapService;

@Controller
@RequestMapping("scrap")
public class ScrapController {
	@Autowired
	ScrapService scrapService;
	
	@RequestMapping("findAll")
	public String findAll(HttpServletRequest request) {
		request.setAttribute("listBfjl", scrapService.selectAll());
		return "baofeijilu";		
	}
	
	@RequestMapping("findBybfdh")
	public String findBybfdh(HttpServletRequest request, String zha) {
		request.setAttribute("listBfjl", scrapService.findBybfdh(Integer.parseInt(zha)));
		return "baofeijilu";		
	}
	
	

}
