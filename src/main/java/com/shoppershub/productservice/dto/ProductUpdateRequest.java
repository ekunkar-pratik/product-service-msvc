package com.shoppershub.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductUpdateRequest {

    private Long productId;
    private String productName;
    private String productDescription;
    private BigDecimal price;
    private Date expDate;
}
