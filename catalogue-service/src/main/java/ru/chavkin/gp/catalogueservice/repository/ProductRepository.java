package ru.chavkin.gp.catalogueservice.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import ru.chavkin.gp.catalogueservice.entity.Product;


/**
 * @author Vladimir Chavkin (vladimirchavkinwork@gmail.com)
 */

public interface ProductRepository extends CrudRepository<Product, Integer> {

    // JPQL Query
    //  @Query(value = "select p from Product p where p.title ilike :filter")
    // Native Query
    //  @Query(value = "select * from catalogue.t_product where c_title ilike :filter", nativeQuery = true)
    // Named Query
    @Query(name = "Product.findAllByTitleLikeIgnoringCase")
    Iterable<Product> findAllByTitleLikeIgnoreCase(@Param("filter") String filter);

}
