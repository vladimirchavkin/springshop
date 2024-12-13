package ru.chavkin.gp.catalogueservice.service;


import ru.chavkin.gp.catalogueservice.entity.Product;

import java.util.List;
import java.util.Optional;

/**
 * @author Vladimir Chavkin (vladimirchavkinwork@gmail.com)
 */

public interface ProductService {

    List<Product> findAllProducts();

    Product createProduct(String title, String details);

    Optional<Product> findProduct(int productId);

    void updateProduct(Integer id, String title, String details);

    void deleteProduct(Integer id);
}
