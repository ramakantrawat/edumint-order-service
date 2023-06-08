package com.example.demo.model.response;

import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderResponse {
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
