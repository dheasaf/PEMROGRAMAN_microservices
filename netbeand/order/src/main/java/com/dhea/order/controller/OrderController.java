package com.dhea.order.controller;

import com.dhea.order.entity.Order;
import com.dhea.order.service.OrderService;
import com.dhea.order.vo.ResponseTemplate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    
    @GetMapping
    public List<Order> getAll() {
        return orderService.getAll();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable("id") Long id) {
        return orderService.getOrderById(id);
    }
    
    @GetMapping("/with-produk/{id}")
    public List<ResponseTemplate> getOrderWithProdukById(@PathVariable("id") Long id) {
        return orderService.getOrderWithProdukById(id);
    }
    
    @PutMapping("/{id}")
    public void updateOrder(@PathVariable("id") Long id,
                            @RequestParam(required = false) int jumlah,
                            @RequestParam(required = false) String tanggal,
                            @RequestParam(required = false) String status) {
        orderService.update(id, jumlah, tanggal, status);
    }
        @DeleteMapping(path = "{id}")
    public void deleteOrder(@PathVariable("id") Long id) {
        OrderService.deleteOrder(id);
    }

}
