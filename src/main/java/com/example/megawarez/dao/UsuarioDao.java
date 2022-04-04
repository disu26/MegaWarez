package com.example.megawarez.dao;

import com.example.megawarez.domain.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * Dao para la entidad Usuario.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public interface UsuarioDao extends CrudRepository<Usuario, Long> {
    @Query("select Usuario from Usuario usuario where usuario.username = :username")
    public Optional<Usuario> findUsuarioByUserName(
            @Param(value = "username") String username
    );
}
