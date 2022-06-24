package com.nodos.market.domain.repository;

import com.nodos.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();
    Optional<List<Product>> getByCategory();
    Optional<List<Product>> getScarseProduct (int quantity);
    Optional<List<Product>> getProduct(int productId);
    Product save (Product product);
    void delete(int productId);

}
