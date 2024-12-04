package ru.chavkin.gp.catalogueservice.service;


import ru.chavkin.gp.catalogueservice.entity.Product;

import java.util.Optional;

/**
 * @author Vladimir Chavkin (vladimirchavkinwork@gmail.com)
 */

public interface ProductService {

    Iterable<Product> findAllProducts(String filter);

    Product createProduct(String title, String details);

    Optional<Product> findProduct(int productId);

    void updateProduct(Integer id, String title, String details);

    void deleteProduct(Integer id);
}
