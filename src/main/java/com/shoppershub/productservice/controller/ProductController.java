package com.shoppershub.productservice.controller;

import com.shoppershub.productservice.dto.ProductUpdateRequest;
import com.shoppershub.productservice.entity.Product;
import com.shoppershub.productservice.service.ProductService;
import com.shoppershub.productservice.service.impl.ProductSeviceImpletation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.shoppershub.productservice.dto.ProductRequest;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductService productService;

    @PostMapping
	public ResponseEntity<String> createProduct(@RequestBody ProductRequest productRequest) {
		productService.addProduct(productRequest);
		return ResponseEntity.status(HttpStatus.CREATED).body("Product added successfully");
	}

	@GetMapping("/get")
	public ResponseEntity<List<Product>> fetchProductById(@RequestParam List<Long> pruductList) {
		List<Product> products = productService.getProductById(pruductList);
		return ResponseEntity.status(HttpStatus.OK).body(products);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Product>> fetchAllProduct() {
		List<Product> products =productService.getAllProducts();
		return ResponseEntity.status(HttpStatus.OK).body(products);
	}

	@PutMapping
	public ResponseEntity<Product> updateProductById(@RequestBody ProductUpdateRequest productUpdateRequest) {
		Product product =productService.updateProduct(productUpdateRequest);
		return ResponseEntity.status(HttpStatus.OK).body(product);
	}

	@DeleteMapping
	public ResponseEntity<String> deleteProductById(@RequestParam List<Long> pruductIds) {
		productService.deleteProductsById(pruductIds);
		return ResponseEntity.status(HttpStatus.OK).body("Product deleted successfully");
	}

}
