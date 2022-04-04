package com.example.megawarez.service;

import com.example.megawarez.domain.Session;

import java.util.List;
import java.util.Optional;

/**
 * Interface para el servicio del item.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public interface ISessionService {
    /**
     * Devuelve una lista con todas las sesiones del sistema
     *
     * @return
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public List<Session> list();

    /**
     * Crea una sesion en el sistema.
     *
     * @param session Objeto de la sesion a crear
     * @return Objeto de la sesion creada.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Session save(Session session);

    /**
     * Actualiza una tupla completa de la Sesion.
     *
     * @param id Identificador de la sesion a actualizar.
     * @param session Objeto de la sesion a actualizar.
     * @return Objeto de la sesion actualizada.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Session update(Long id, Session session);

    /**
     * Borra una sesion del sistema.
     * @param session Objeto de la sesion a borrar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void delete(Session session);

    /**
     * Encuentra una sesion por su id.
     *
     * @param session Objeto de la descarga a buscar
     * @return Objeto de tipo Optional que retorna una cosa u otra dependiendo
     * de si se halla o no la sesion.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Optional<Session> findSession(Session session);
}
