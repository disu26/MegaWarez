package com.example.megawarez.service;

import com.example.megawarez.dao.SessionDao;
import com.example.megawarez.domain.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Clase tipo Servicio para el manejo de la Sesion.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
@Service
public class SessionService implements ISessionService{

    /**
     * Dao de la session.
     */
    @Autowired
    private SessionDao sessionDao;

    /**
     * Devuelve una lista con todas las sesiones del sistema
     *
     * @return
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional(readOnly = true)
    public List<Session> list() {
        return (List<Session>) sessionDao.findAll();
    }

    /**
     * Crea una sesion en el sistema.
     *
     * @param session Objeto de la sesion a crear
     * @return Objeto de la sesion creada.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional
    public Session save(Session session) {
        return sessionDao.save(session);
    }

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
    @Override
    @Transactional
    public Session update(Long id, Session session) {
        session.setId(id);
        return sessionDao.save(session);
    }

    /**
     * Borra una sesion del sistema.
     * @param session Objeto de la sesion a borrar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional
    public void delete(Session session) {
        sessionDao.delete(session);
    }

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
    @Override
    @Transactional(readOnly = true)
    public Optional<Session> findSession(Session session) {
        return sessionDao.findById(session.getId());
    }

    @Transactional(readOnly = true)
    public Optional<Session> findSessionByIdToken(Session session){
        return sessionDao.findSessionByIdToken(session.getUsuario_id(), session.getToken());
    }
}
