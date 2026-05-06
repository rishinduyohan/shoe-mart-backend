package com.decodelabs.shoemartbackend.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    private String category;
    private Double oldPrice;
    private Integer discount;
    private Integer rating;
    private String image;
    private Double priceValue;
}

