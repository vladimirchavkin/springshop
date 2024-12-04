package ru.chavkin.gp.managerservice.repository;


import org.springframework.data.repository.CrudRepository;
import ru.chavkin.gp.managerservice.entity.CatalogueUser;

import java.util.Optional;

/**
 * @author Vladimir Chavkin (vladimirchavkinwork@gmail.com)
 */

public interface CatalogueUserRepository extends CrudRepository<CatalogueUser, Integer> {

    Optional<CatalogueUser> findByUsername(String username);

}
