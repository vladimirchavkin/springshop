package ru.chavkin.gp.catalogueservice.controller.payload;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * @author Vladimir Chavkin (vladimirchavkinwork@gmail.com)
 */

public record UpdateProductPayload(

        @NotNull(message = "{catalogue.products.update.errors.title_is_null}")
        @Size(min = 3, max = 50, message = "{catalogue.products.update.errors.title_size_is_invalid}")
        String title,

        @Size(max = 500, message = "{catalogue.products.create.update.details_size_is_invalid}")
        String details
) {
}
