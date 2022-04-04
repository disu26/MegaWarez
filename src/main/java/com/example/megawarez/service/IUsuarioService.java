package com.example.megawarez.service;

import com.example.megawarez.domain.Usuario;

import java.util.List;
import java.util.Optional;

/**
 * Interface para el servicio de la subcategoria.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public interface IUsuarioService {
    /**
     * Devuelve una lista con todos los Usuarios del sistema
     *
     * @return
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public List<Usuario> list();

    /**
     * Crea un usuario en el sistema.
     *
     * @param usuario Objeto del usuario a crear
     * @return Objeto del usuario creado.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Usuario save(Usuario usuario);

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
    public Usuario update(Long id, Usuario usuario);

    /**
     * Borra un usuario del sistema.
     * @param usuario Objeto del usuario a borrar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void delete(Usuario usuario);

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
    public Optional<Usuario> findUsuario(Usuario usuario);
}
