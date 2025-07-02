package com.shoppershub.productservice.service;

import com.shoppershub.productservice.dto.ProductRequest;
import com.shoppershub.productservice.dto.ProductUpdateRequest;
import com.shoppershub.productservice.entity.Product;

import java.util.List;

public interface ProductService {

	void addProduct(ProductRequest productRequest);
	List<Product> getProductById(List<Long> productList);
	List<Product> getAllProducts();
	Product updateProduct(ProductUpdateRequest productUpdateRequest);
	void deleteProductsById(List<Long> pruductIds);

}
