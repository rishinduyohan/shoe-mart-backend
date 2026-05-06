package com.decodelabs.shoemartbackend.mapper;

import com.decodelabs.shoemartbackend.model.dto.OrderDTO;
import com.decodelabs.shoemartbackend.model.dto.OrderItemDTO;
import com.decodelabs.shoemartbackend.model.entity.Order;
import com.decodelabs.shoemartbackend.model.entity.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDTO toDto(Order order);

    Order toEntity(OrderDTO orderDTO);

    @Mapping(source = "product.id", target = "productId")
    OrderItemDTO orderItemToOrderItemDTO(OrderItem orderItem);

    @Mapping(source = "productId", target = "product.id")
    OrderItem orderItemDTOToOrderItem(OrderItemDTO orderItemDTO);
}

