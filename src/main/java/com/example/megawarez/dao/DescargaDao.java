package com.example.megawarez.dao;

import com.example.megawarez.domain.Categoria;
import com.example.megawarez.domain.Descarga;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * Dao para la entidad Descarga.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public interface DescargaDao extends CrudRepository<Descarga, Long> {
}
