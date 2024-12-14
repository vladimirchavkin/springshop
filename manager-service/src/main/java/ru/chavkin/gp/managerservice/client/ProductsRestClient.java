package ru.chavkin.gp.managerservice.client;


import ru.chavkin.gp.managerservice.entity.Product;

import java.util.List;
import java.util.Optional;

/**
 * @author Vladimir Chavkin (vladimirchavkinwork@gmail.com)
 */

public interface ProductsRestClient {

    List<Product> findAllProducts(String filter);

    Product createProduct(String title, String details);

    Optional<Product> findProduct(int productId);

    void updateProduct(int productId, String title, String details);

    void deleteProduct(int productId);
}