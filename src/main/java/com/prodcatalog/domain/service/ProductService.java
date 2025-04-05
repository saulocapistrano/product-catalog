package com.prodcatalog.application.service;

import com.prodcatalog.application.dto.ProductRequestDTO;
import com.prodcatalog.application.dto.ProductResponseDTO;
import com.prodcatalog.application.mapper.ProductMapper;
import com.prodcatalog.domain.repositoty.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    public ProductResponseDTO create(ProductRequestDTO dto) {
        var product = mapper.toEntity(dto);
        var saved = repository.save(product);
        return mapper.toDTO(saved);
    }

    public List<ProductResponseDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }
}
