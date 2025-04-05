package com.prodcatalog.application.mapper;

import com.prodcatalog.application.dto.ProductRequestDTO;
import com.prodcatalog.application.dto.ProductResponseDTO;
import com.prodcatalog.domain.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toEntity(ProductRequestDTO dto) {
        return Product.builder()
                .name(dto.name())
                .description(dto.description())
                .price(dto.price())
                .build();
    }

    public ProductResponseDTO toDTO(Product product) {
        return new ProductResponseDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice()
        );
    }

    public void update(Product existing, ProductRequestDTO dto) {
        existing.setName(dto.name());
        existing.setDescription(dto.description());
        existing.setPrice(dto.price());
    }
}
