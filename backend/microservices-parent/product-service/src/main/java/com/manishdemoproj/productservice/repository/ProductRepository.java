package com.manishdemoproj.productservice.repository;

import com.manishdemoproj.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
