package com.spring.crudkube.Controller;

import com.spring.crudkube.Entrity.Orders;
import com.spring.crudkube.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/")
    public List<Orders> getAllOrders() {
        return  orderService.getOrders();
    }

    @PostMapping("/")
    public Orders createOrder(@RequestBody Orders order) {
        return orderService.addOrder(order);
    }
    @GetMapping("/{id}")
    public Orders getOrderById(@PathVariable int id) {
        return orderService.getOrderById(id);
    }
}
