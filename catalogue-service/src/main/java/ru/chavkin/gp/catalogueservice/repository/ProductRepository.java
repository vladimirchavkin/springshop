package ru.chavkin.gp.catalogueservice.repository;


import ru.chavkin.gp.catalogueservice.entity.Product;

import java.util.List;
import java.util.Optional;

/**
 * @author Vladimir Chavkin (vladimirchavkinwork@gmail.com)
 */

public interface ProductRepository {

    List<Product> findAll();

    Product save(Product product);

    Optional<Product> findById(Integer productId);

    void deleteById(Integer id);
}
