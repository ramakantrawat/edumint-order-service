package com.example.demo.service.impl;

import com.example.demo.config.WebClientConfig;
import com.example.demo.converters.OrderConverter;
import com.example.demo.model.entity.Order;
import com.example.demo.model.request.OrderRequest;
import com.example.demo.model.response.BaseApiResponse;
import com.example.demo.model.response.OrderResponse;
import com.example.demo.repository.OrderRepository;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class OrderImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private WebClient.Builder webClient;

    @Override
    public List<OrderResponse> getOrders() {
        List<Order> orders = orderRepository.findAll();
        return orders.stream().map(
                OrderConverter::orderToOrderResponse
        ).collect(Collectors.toList());
    }

    @Override
    public OrderResponse getOrder(Long id) {
        Order order = orderRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Order not found"));
        return OrderConverter.orderToOrderResponse(order);
    }

    @Override
    public OrderResponse saveOrder(OrderRequest orderRequest) {
        BaseApiResponse result = webClient.build().get().uri("http://inventory-service/api/v1/inventory/", uriBuilder ->
                uriBuilder.queryParam("skuCode",orderRequest.getSkuCode()).build()).retrieve().
                bodyToMono(BaseApiResponse.class).block();
        if (!(Boolean) result.getData()){
            throw new IllegalArgumentException("Order is out of stock");
        }


        return OrderConverter.orderToOrderResponse(orderRepository.save(OrderConverter.orderRequestToOrder(orderRequest)));
    }

}
