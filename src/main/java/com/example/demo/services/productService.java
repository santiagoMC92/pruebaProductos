package com.example.demo.services;

import com.example.demo.model.product;

import java.util.List;
import java.util.Optional;

public interface productService {

    List<product> getProductos();

    Optional<product> getProduct(Long id);

    boolean createProduct(product product);

    boolean UpdateProduct(Long id, product product);

    boolean deleteProduct(Long id);

}
