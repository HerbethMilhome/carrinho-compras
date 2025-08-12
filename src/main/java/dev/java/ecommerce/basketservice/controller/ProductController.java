package dev.java.ecommerce.basketservice.controller;

import dev.java.ecommerce.basketservice.client.response.PlatziProductResponse;
import dev.java.ecommerce.basketservice.services.ProductServece;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductServece productServece;

    @GetMapping
    public ResponseEntity<List<PlatziProductResponse>> getALlProducts() {

        return ResponseEntity.ok(productServece.getALlProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlatziProductResponse> getProductById(@PathVariable Long id) {

        return ResponseEntity.ok(productServece.getProductById(id));
    }

}
