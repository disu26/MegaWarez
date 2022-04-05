package com.example.megawarez.dao;

import com.example.megawarez.domain.Categoria;
import com.example.megawarez.domain.Session;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * Dao para la entidad Sesion.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public interface SessionDao extends CrudRepository<Session, Long> {
    /**
     * Consulta para saber si ya existe una sesion de este usuario con ese token.
     *
     * @param usuario_id Objeto de tipo Long con el nombre a buscar.
     * @param token Objeto de tipo String con el token a buscar
     * @return Objeto de tipo Optional que retorna una cosa u otra dependiendo de si lo encuentra
     * o no.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Query("select session from Session session where session.usuario_id = :usuario_id AND session.token = :token")
    public Optional<Session> findSessionByIdToken(
            @Param(value = "usuario_id") Long usuario_id,
            @Param(value = "token") String token
    );
}
