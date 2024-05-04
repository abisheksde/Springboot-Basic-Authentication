package com.example.auth.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.auth.Model.ProductModel;

public interface ProductRepository extends CrudRepository<ProductModel,Integer> {

}