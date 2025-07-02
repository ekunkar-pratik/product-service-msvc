package com.shoppershub.productservice.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductRequest {
	
	private String productName;
	private String productDescription;
	private BigDecimal price;
	private Date expDate;
}
