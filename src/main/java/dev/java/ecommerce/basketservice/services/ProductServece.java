package dev.java.ecommerce.basketservice.services;

import dev.java.ecommerce.basketservice.client.PlatziStoreClient;
import dev.java.ecommerce.basketservice.client.response.PlatziProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServece {

    private final PlatziStoreClient platziStoreClient;

    public List<PlatziProductResponse> getALlProducts() {
        return platziStoreClient.getAllProducts();
    }

    public PlatziProductResponse getProductById(Long id) {
        return platziStoreClient.getProductById(id);
    }

}
