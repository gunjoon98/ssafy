package com.ssafy.product.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.product.dto.Product;
import com.ssafy.product.model.mapper.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService {
	private final ProductMapper productMapper;

	public ProductServiceImpl(ProductMapper productMapper) {
		super();
		this.productMapper = productMapper;
	}
	
	public List<Product> selectAll() {
		return productMapper.selectAll();
	}
	
	public Product selectByCode(String code) {
		return productMapper.selectByCode(code);
	}
	
	public int registProduct(Product product) {
		return productMapper.registProduct(product);
	}
	
	public int deleteByCode(String code) {
		return productMapper.deleteByCode(code);
	}
}
