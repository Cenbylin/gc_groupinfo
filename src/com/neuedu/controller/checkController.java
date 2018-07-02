package com.neuedu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.service.BuyService;
import com.neuedu.service.RepairService;
import com.neuedu.service.ScrapService;
import com.neuedu.service.TranslateService;

@Controller
@RequestMapping("check")
public class checkController {
	@Autowired
	BuyService buyService;
	@Autowired
	TranslateService translateService;
	@Autowired
	RepairService repairService;
	@Autowired
	ScrapService scrapService;
	
	@RequestMapping("findAll")
	public String findBuyList(HttpServletRequest request) {
		request.setAttribute("listBuy1", buyService.findAllBuy());
		request.setAttribute("listBuy2", translateService.findAllTranslate());
		request.setAttribute("listBuy3", repairService.findAllRepair());
		request.setAttribute("listBuy4", scrapService.selectAll());
		return "pandianxinxi";
	}

}
