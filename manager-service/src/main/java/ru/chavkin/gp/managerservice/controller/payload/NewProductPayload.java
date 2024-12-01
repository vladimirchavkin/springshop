package ru.chavkin.gp.managerservice.controller.payload;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * @author Vladimir Chavkin (vladimirchavkinwork@gmail.com)
 */

public record NewProductPayload(

        @NotNull(message = "{catalogue.products.create.errors.title_is_null}")
        @Size(min = 3, max = 50, message = "{catalogue.products.create.errors.title_size_is_invalid}")
        String title,

        @Size(max = 500, message = "{catalogue.products.create.errors.details_size_is_invalid}")
        String details

) {
}
