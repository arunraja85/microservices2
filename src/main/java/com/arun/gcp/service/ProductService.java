/**
 * 
 */
package com.arun.gcp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.arun.gcp.model.ProductDTO;

/**
 * @author arunraja.jayavel
 *
 */
@Service
public class ProductService {

//	@Value("${product.service}")
//	private String url;
	
	public List<ProductDTO> getAllProducts(){
		List<ProductDTO> productDTOList = new ArrayList<>();
		ProductDTO productDTO1 = new ProductDTO(4, "Test Product 4","Description of test product 4");
		ProductDTO productDTO2 = new ProductDTO(5, "Test Product 5","Description of test product 5");
		ProductDTO productDTO3 = new ProductDTO(6, "Test Product 6","Description of test product 6");
		productDTOList.add(productDTO1);
		productDTOList.add(productDTO2);
		productDTOList.add(productDTO3);
		return productDTOList;
	}
	
//	private void get() {
//		RestTemplate restTemplate = new RestTemplate();
//		List<ProductDTO> productDTOList = restTemplate.getForEntity(url, new ParameterizedTypeReference<List<ProductDTO>>() {} );
//	}
	
}
