package ru.chavkin.gp.catalogueservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vladimir Chavkin (vladimirchavkinwork@gmail.com)
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Integer id;

    private String title;

    private String details;
}
