package com.example.demo.controller;

import com.example.demo.model.product;
import com.example.demo.services.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product")
public class productController {

    @Autowired
    productService productservice;

    @GetMapping
    public List<product> getProductos(){
        return productservice.getProductos();
    }

    @GetMapping("/{id}")
    public Optional<product> getProduct(@PathVariable Long id){
        return productservice.getProduct(id);
    }

    @PostMapping
    public boolean createProduct(@RequestBody product product){
        return productservice.createProduct(product);
    }

    @PutMapping("/{id}")
    public boolean updateProduct(@PathVariable Long id, @RequestBody product product){
        return productservice.UpdateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public boolean deleteProduct(@PathVariable Long id){
        return productservice.deleteProduct(id);
    }
}
