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
    /**
     * Consulta para saber si ya existe un usuario con este username.
     *
     * @param username Objeto de tipo String con el username a buscar.
     * @return Objeto de tipo Optional que retorna una cosa u otra dependiendo de si lo encuentra
     * o no.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Query("select usuario from Usuario usuario where usuario.username = :username")
    public Optional<Usuario> findUsuarioByUserName(
            @Param(value = "username") String username
    );
}
