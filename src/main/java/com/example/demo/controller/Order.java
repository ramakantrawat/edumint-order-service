package com.example.demo.controller;

import com.example.demo.constant.RestMappingConstant;
import com.example.demo.model.request.OrderRequest;
import com.example.demo.model.response.BaseApiResponse;
import com.example.demo.model.response.OrderResponse;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(RestMappingConstant.OrderConstant.ORDER_URL)
public class Order {
    @Autowired
    private OrderService orderService;
    @GetMapping("/{id}")
    public ResponseEntity<BaseApiResponse<OrderResponse>> getOrder(@PathVariable Long id){
        return ResponseEntity.ok(new BaseApiResponse<>(orderService.getOrder(id)));
    }
    @GetMapping
    public ResponseEntity<BaseApiResponse<List<OrderResponse>>> getOrders(){
        return ResponseEntity.ok(new BaseApiResponse<>(orderService.getOrders()));
    }

    @PostMapping
    public ResponseEntity<BaseApiResponse<OrderResponse>> saveOrder(@RequestBody OrderRequest orderRequest){
        return ResponseEntity.ok(new BaseApiResponse<>(orderService.saveOrder(orderRequest)));
    }
}
