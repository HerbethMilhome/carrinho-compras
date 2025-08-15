package dev.java.ecommerce.basketservice.services;

import dev.java.ecommerce.basketservice.client.PlatziStoreClient;
import dev.java.ecommerce.basketservice.client.response.PlatziProductResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductServece {

    private final PlatziStoreClient platziStoreClient;

    @Cacheable(value = "products")
    public List<PlatziProductResponse> getALlProducts() {
        log.info("Getting all products from Platzi Store...");
        return platziStoreClient.getAllProducts();
    }

    @Cacheable(value = "product", key = "#id")
    public PlatziProductResponse getProductById(Long id) {
        log.info("Getting product by id: {}", id);
        return platziStoreClient.getProductById(id);
    }

}
