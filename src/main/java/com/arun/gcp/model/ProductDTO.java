/**
 * 
 */
package com.arun.gcp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author arunraja.jayavel
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

	private long productId;
	
	private String productName;
	
	private String productDescription;
}
