package com.shoppershub.productservice.service.impl;

import com.shoppershub.productservice.dto.ProductUpdateRequest;
import com.shoppershub.productservice.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppershub.productservice.dto.ProductRequest;
import com.shoppershub.productservice.entity.Product;
import com.shoppershub.productservice.service.ProductService;

import java.util.List;

@Slf4j
@Service
public class ProductSeviceImpletation implements ProductService{

	@Autowired
	private ProductRepository productRepository;

    @Override
	public void addProduct(ProductRequest productRequest) {
	log.info("Saving Product in DB");
	Product product = Product.builder().productName(productRequest.getProductName())
			.productDescription(productRequest.getProductDescription()).price(productRequest.getPrice())
			.expDate(productRequest.getExpDate()).build();
			productRepository.save(product);
	log.info("Product {} is saved", product.getProductId());
	}

	@Override
	public List<Product> getProductById(List<Long> productList) {
		log.info("Fetching Products from DB by product id");
		return productRepository.findAllById(productList);
	}

	@Override
	public List<Product> getAllProducts() {
		log.info("Fetching All Products from DB");
		return productRepository.findAll();
	}

	@Override
	public Product updateProduct(ProductUpdateRequest productUpdateRequest) {
		log.info("Updating Products from DB by product id");
		Product product = productRepository.getProductById(productUpdateRequest.getProductId());
		product.setProductName(productUpdateRequest.getProductName());
		product.setProductDescription(productUpdateRequest.getProductDescription());
		product.setPrice(productUpdateRequest.getPrice());
		product.setExpDate(productUpdateRequest.getExpDate());
		productRepository.save(product);
		return product;
	}

	@Override
	public void deleteProductsById(List<Long> pruductIds) {
		log.info("Deleting Products from DB by product id");
		productRepository.deleteAllById(pruductIds);
	}
}
