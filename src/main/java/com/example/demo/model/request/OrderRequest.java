package com.example.demo.model.request;

import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
