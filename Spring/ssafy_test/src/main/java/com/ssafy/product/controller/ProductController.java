package com.ssafy.product.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.product.dto.Product;
import com.ssafy.product.model.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	private final ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/list")
	public String selectAll(Model model) {
		List<Product> list = productService.selectAll();
		model.addAttribute("list", list);
		return "product/list";
	}
	
	@GetMapping("/view")
	public String selectByCode(@RequestParam String code, Model model) {
		Product product = productService.selectByCode(code);
		model.addAttribute("product", product);
		return "product/view";
	}
	
	@GetMapping("/regist")
	public String registProduct() {
		return "product/regist";
	}
	
	@PostMapping("/regist")
	public String registProduct(@ModelAttribute("product") Product product) {
		productService.registProduct(product);
		return "redirect: /product/product/list";
	}
	
	@GetMapping("/delete")
	public String deleteByCode(@RequestParam String code) {
		productService.deleteByCode(code);
		return "redirect: /product/product/list";
	}
}
