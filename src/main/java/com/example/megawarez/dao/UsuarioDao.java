package com.example.megawarez.dao;

import com.example.megawarez.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 * Dao para la entidad Usuario.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public interface UsuarioDao extends CrudRepository<Usuario, Long> {
}
