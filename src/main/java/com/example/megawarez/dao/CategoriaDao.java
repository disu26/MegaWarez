package com.example.megawarez.dao;

import com.example.megawarez.domain.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * Dao para la entidad Categoria.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public interface CategoriaDao extends CrudRepository<Categoria, Long> {
    /**
     * Consulta para saber si ya existe una categoria con este nombre.
     *
     * @param nombre Objeto de tipo String con el nombre a buscar.
     * @return Objeto de tipo Optional que retorna una cosa u otra dependiendo de si lo encuentra
     * o no.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Query("select categoria from Categoria categoria where categoria.nombre = :nombre")
    public Optional<Categoria> findCategoriaByName(
            @Param(value = "nombre") String nombre
    );
}
