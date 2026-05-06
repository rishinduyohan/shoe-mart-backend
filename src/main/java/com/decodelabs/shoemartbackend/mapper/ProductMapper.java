package com.decodelabs.shoemartbackend.mapper;

import com.decodelabs.shoemartbackend.model.dto.ProductDTO;
import com.decodelabs.shoemartbackend.model.entity.Product;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO toDto(Product product);

    Product toEntity(ProductDTO productDTO);

    @AfterMapping
    default void calculatePriceValue(Product product, @MappingTarget ProductDTO productDTO) {
        if (productDTO.getPriceValue() == null && product.getOldPrice() != null && product.getDiscount() != null) {
            double oldPrice = product.getOldPrice();
            int discount = product.getDiscount();
            double priceValue = oldPrice - (oldPrice * discount / 100);
            productDTO.setPriceValue(priceValue);
        }
    }
}
