package com.example.megawarez.service;

import com.example.megawarez.dao.UsuarioDao;
import com.example.megawarez.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Clase tipo Servicio para el manejo de los usuarios.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
@Service
public class UsuarioService implements IUsuarioService{

    /**
     * Dao Usuario
     */
    @Autowired
    private UsuarioDao usuarioDao;

    /**
     * Devuelve una lista con todos los Usuarios del sistema
     *
     * @return
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional(readOnly = true)
    public List<Usuario> list() {
        return (List<Usuario>) usuarioDao.findAll();
    }

    /**
     * Crea un usuario en el sistema.
     *
     * @param usuario Objeto del usuario a crear
     * @return Objeto del usuario creado.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional
    public Usuario save(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    /**
     * Actualiza una tupla completa del usuario.
     *
     * @param id Identificador del usuario a actualizar.
     * @param usuario Objeto del usuario a actualizar.
     * @return Objeto del usuario actualizada.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional
    public Usuario update(Long id, Usuario usuario) {
        usuario.setId(id);
        return usuarioDao.save(usuario);
    }

    /**
     * Borra un usuario del sistema.
     * @param usuario Objeto del usuario a borrar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional
    public void delete(Usuario usuario) {
        usuarioDao.delete(usuario);
    }

    /**
     * Encuentra un usuario por su id.
     *
     * @param usuario Objeto del usuario a buscar
     * @return Objeto de tipo Optional que retorna una cosa u otra dependiendo
     * de si se halla o no el usuario.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<Usuario> findUsuario(Usuario usuario) {
        return usuarioDao.findById(usuario.getId());
    }

    @Transactional(readOnly = true)
    public Optional<Usuario> findUsuarioByUserName(Usuario usuario){
        return usuarioDao.findUsuarioByUserName(usuario.getUsername());
    }
}
