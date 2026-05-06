package com.decodelabs.shoemartbackend.Service.Impl;

import com.decodelabs.shoemartbackend.Repository.ProductRepository;
import com.decodelabs.shoemartbackend.Service.ProductService;
import com.decodelabs.shoemartbackend.mapper.ProductMapper;
import com.decodelabs.shoemartbackend.model.dto.ProductDTO;
import com.decodelabs.shoemartbackend.model.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream()
                .map(productMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO saveProduct(ProductDTO productDTO) {
        Product product = productMapper.toEntity(productDTO);
        return productMapper.toDto(productRepository.save(product));
    }

    @Override
    public boolean deleteProduct(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public ProductDTO getProductById(Long id) {
        return productRepository.findById(id)
                .map(productMapper::toDto)
                .orElse(null);
    }

    @Override
    public ProductDTO updateProduct(Long id, ProductDTO productDTO) {
        if (productRepository.existsById(id)) {
            Product product = productMapper.toEntity(productDTO);
            product.setId(id);
            return productMapper.toDto(productRepository.save(product));
        }
        return null;
    }
}
