package com.decodelabs.shoemartbackend.Service;

import com.decodelabs.shoemartbackend.model.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getAllProducts();
    ProductDTO saveProduct(ProductDTO productDTO);
    boolean deleteProduct(Long id);
    ProductDTO getProductById(Long id);
    ProductDTO updateProduct(Long id, ProductDTO productDTO);
}
