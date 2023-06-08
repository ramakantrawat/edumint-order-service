package com.example.demo.converters;

import com.example.demo.model.entity.Order;
import com.example.demo.model.request.OrderRequest;
import com.example.demo.model.response.OrderResponse;

public class OrderConverter {
    public static OrderResponse orderToOrderResponse(Order order){
        return OrderResponse.
                builder().
                id(order.getId()).
                price(order.getPrice()).
                skuCode(order.getSkuCode()).
                quantity(order.getQuantity()).
                build();
    }
    public static Order orderRequestToOrder(OrderRequest orderRequest){
        return Order.
                builder().
                price(orderRequest.getPrice()).
                skuCode(orderRequest.getSkuCode()).
                quantity(orderRequest.getQuantity()).
                build();
    }
}
