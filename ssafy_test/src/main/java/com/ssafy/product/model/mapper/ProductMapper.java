package com.ssafy.product.model.mapper;

import java.util.List;

import com.ssafy.product.dto.Product;

public interface ProductMapper {
	List<Product> selectAll();
	Product selectByCode(String code);
	int registProduct(Product product);
	int deleteByCode(String code);
}
