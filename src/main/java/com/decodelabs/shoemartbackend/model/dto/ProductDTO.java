package com.decodelabs.shoemartbackend.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("priceValue")
    private Double priceValue;
}

