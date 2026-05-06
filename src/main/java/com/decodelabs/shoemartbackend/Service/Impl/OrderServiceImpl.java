package com.decodelabs.shoemartbackend.Service.Impl;

import com.decodelabs.shoemartbackend.Repository.OrderRepository;
import com.decodelabs.shoemartbackend.Service.OrderService;
import com.decodelabs.shoemartbackend.mapper.OrderMapper;
import com.decodelabs.shoemartbackend.model.dto.OrderDTO;
import com.decodelabs.shoemartbackend.model.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Override
    public OrderDTO placeOrder(OrderDTO orderDTO) {
        Order order = orderMapper.toEntity(orderDTO);
        order.setOrderDate(LocalDateTime.now());
        return orderMapper.toDto(orderRepository.save(order));
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        return orderRepository.findAll().stream()
                .map(orderMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public OrderDTO getOrderById(Long id) {
        return orderRepository.findById(id)
                .map(orderMapper::toDto)
                .orElse(null);
    }
}
