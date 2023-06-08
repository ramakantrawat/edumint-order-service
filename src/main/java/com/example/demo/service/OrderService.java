package com.example.demo.service;

import com.example.demo.model.request.OrderRequest;
import com.example.demo.model.response.OrderResponse;

import java.util.List;

public interface OrderService {
    List<OrderResponse> getOrders();
    OrderResponse getOrder(Long id);
    OrderResponse saveOrder(OrderRequest orderRequest);
}
