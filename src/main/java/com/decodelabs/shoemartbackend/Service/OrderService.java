package com.decodelabs.shoemartbackend.Service;

import com.decodelabs.shoemartbackend.Repository.OrderRepository;
import com.decodelabs.shoemartbackend.model.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order placeOrder(Order order) {
        order.setOrderDate(LocalDateTime.now());
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
