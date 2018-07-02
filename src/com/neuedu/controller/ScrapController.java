package com.neuedu.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.model.Scrap;
import com.neuedu.service.ScrapService;

@Controller
@RequestMapping("scrap")
public class ScrapController {
	@Autowired
	ScrapService scrapService;
	//用于查询记录的
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
	
	@RequestMapping("findAll2")
	public String findAllScrap(HttpServletRequest request) {
		request.setAttribute("listBuy4", scrapService.selectAll());
		return "baofeixinxi";
	}
	
	@RequestMapping("foradd")
	public String forAddScrap(HttpServletRequest request) {
		request.setAttribute("", "");
		return "";
	}
	
	@RequestMapping("add")
	public String addScrap(HttpServletRequest request,Scrap scrap) {
		try {
			scrapService.addScrap(scrap);
			request.setAttribute("", "");
			return "";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			return "";
		}
	}
	
	@RequestMapping("update")
	public String updateScrap(HttpServletRequest request,Scrap scrap) {
		try {
			scrapService.updateScrap(scrap);
			request.setAttribute("", "");
			return "";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			return "";
		}
	}
	
	@RequestMapping("delete")
	public String deleteScrap(HttpServletRequest request,String id) {
		try {
			scrapService.dedleteScrap(id);
			request.setAttribute("", "");
			return "";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			return "";
		}
	}
	
	@RequestMapping("findById")
	public String findScrapmh(HttpServletRequest request,int id) {
		try {
			 request.setAttribute("", scrapService.findScrapById(id));
			 return "";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			return "";
		}
	}
	
	@RequestMapping("findByIdmh")
	public String findScrapmh(HttpServletRequest request,String id) {
		try {
			 request.setAttribute("", scrapService.findScrapById(id));
			 return "";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			return "";
		}
	}

}
