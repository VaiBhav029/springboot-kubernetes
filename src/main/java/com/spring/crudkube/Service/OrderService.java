package com.spring.crudkube.Service;

import com.spring.crudkube.Entrity.Orders;
import com.spring.crudkube.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Orders addOrder(Orders order)
    {
        return orderRepository.save(order);
    }
    public List<Orders> getOrders() {
        return orderRepository.findAll();
    }

    public Orders getOrderById(int id)
    {
        return orderRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Inavlid"+ id));
    }
}
