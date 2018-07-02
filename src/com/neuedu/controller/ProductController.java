package com.neuedu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.model.Product;
import com.neuedu.service.ProductService;


@Controller
@RequestMapping("product")
public class ProductController {
	@Autowired 
	ProductService productService;
	
	@RequestMapping("findAll")
	public String findAllProduct(HttpServletRequest request){
		List<Product> product=productService.selectAll();
		request.setAttribute("listProduct", product);
		return "productxinxi";		
	}
	
	@RequestMapping("findBybh")
	public String findProviderDetails2(HttpServletRequest request,String zha) {
		try {
			request.setAttribute("listProduct",productService.selectByPrimaryKey(Integer.parseInt(zha)));
			return "productxinxi";
			
		}catch (Exception e) {
			// TODO: handle exception
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("listProduct", productService.selectAll());
			return "productxinxi";
		}		
	}
	
	@RequestMapping("findByBuyId")
	public String findByBuyId( HttpServletRequest request, int Buyid) {
		request.setAttribute("listProduct",productService.findByBuyId(Buyid));	
		return "productdetails";		
	}
		
	@RequestMapping("findByBuyId1")
	public String findByBuyId1( HttpServletRequest request, int Buyid) {
		request.setAttribute("listProduct",productService.findByBuyId(Buyid));	
		return "updateproduct";
	}
	
	@RequestMapping("update")
	public String update( HttpServletRequest request, String Buycount, String Prodcount, int Prodid, int Buyid ) {
		productService.update( Double.parseDouble(Buycount), Double.parseDouble(Prodcount), Prodid, Buyid );
		request.setAttribute("listProduct", productService.selectAll());
		return "productxinxi";		
	}
}
