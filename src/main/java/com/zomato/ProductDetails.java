package com.zomato;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductDetails {
	
	@GetMapping("showProduct")//action name
	@ResponseBody
	public String showProduct() {
		System.out.println("ProductDetails.showProduct()");
		return "Show product";
	}

}
