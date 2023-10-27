package com.ssafy.product.model.service;

import java.util.List;

import com.ssafy.product.dto.Product;

public interface ProductService {

	List<Product> selectAll();
	
	public Product selectByCode(String code);
	
	public int registProduct(Product product);
	
	public int deleteByCode(String code);
}
