package com.prodcatalog.application.dto;

import java.math.BigDecimal;

public record ProductResponseDTO(Long id, String name, String description, BigDecimal price) {
}
