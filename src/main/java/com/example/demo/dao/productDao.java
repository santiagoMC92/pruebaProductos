package com.example.demo.dao;

import com.example.demo.model.product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productDao extends CrudRepository<product, Long> {
}
