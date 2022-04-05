package com.example.megawarez.dao;

import com.example.megawarez.domain.Categoria;
import com.example.megawarez.domain.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * Dao para la entidad Item.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public interface ItemDao extends CrudRepository<Item, Long> {
    @Query("select item from Item item where item.nombre = :nombre")
    public Optional<Item> findItemByName(
            @Param(value = "nombre") String nombre
    );
}
