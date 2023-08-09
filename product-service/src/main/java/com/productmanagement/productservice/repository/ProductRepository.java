package com.productmanagement.productservice.repository;

import com.productmanagement.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String>  {
}
