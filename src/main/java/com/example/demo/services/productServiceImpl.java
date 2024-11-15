package com.example.demo.services;

import com.example.demo.dao.productDao;
import com.example.demo.model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Service
public class productServiceImpl implements productService {

    @Autowired
    productDao productdao;

    @Override
    public List<product> getProductos() {
        return (List<product>) productdao.findAll();
    }

    @Override
    public Optional<product> getProduct(Long id) {
        return productdao.findById(id);
    }

    @Override
    public boolean createProduct(product product) {
        try {
            productdao.save(product);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean UpdateProduct(Long id, product product) {
        if(id>0){
            product.setId(id);
        }else{
            return false;
        }

        try {
            productdao.save(product);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean deleteProduct(Long id) {
        try {
            productdao.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
