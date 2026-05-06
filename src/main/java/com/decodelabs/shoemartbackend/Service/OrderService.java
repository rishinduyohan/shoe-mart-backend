package com.decodelabs.shoemartbackend.Service;

import com.decodelabs.shoemartbackend.model.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    OrderDTO placeOrder(OrderDTO orderDTO);
    List<OrderDTO> getAllOrders();
    OrderDTO getOrderById(Long id);
}
