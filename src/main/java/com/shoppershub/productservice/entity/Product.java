package com.shoppershub.productservice.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name ="product")


public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="product_id", nullable = false)
	private Long productId;
	@Column(name="product_name", nullable = false)
	private String productName;
	@Column(name="product_description")
	private String productDescription;
	@Column(name="price", nullable = false)
	private BigDecimal price;
	@Column(name="exp_date", nullable = false)
	private Date expDate;
}


