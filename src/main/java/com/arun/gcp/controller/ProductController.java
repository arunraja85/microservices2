/**
 * 
 */
package com.arun.gcp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arun.gcp.model.ProductDTO;
import com.arun.gcp.service.ProductService;

/**
 * @author arunraja.jayavel
 *
 */
@RestController("/ms2")
public class ProductController {

	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<ProductDTO>> getAllProducts(){
		return ResponseEntity.ok().body(productService.getAllProducts());
	}
}
