package com.training.ProductService.services;

import com.training.ProductService.entities.Product;

import java.util.List;

public interface ProductService {

    Product add(Product product);

    List<Product> getAll();

    Product getOne(int id);

    List<Product> getProductsByUser(int userId);
}
