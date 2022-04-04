package com.example.megawarez.service;

import com.example.megawarez.domain.Subcategoria;

import java.util.List;
import java.util.Optional;

/**
 * Interface para el servicio de la subcategoria.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public interface ISubcategoriaService {
    /**
     * Devuelve una lista con todas las subcategorias del sistema
     *
     * @return
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public List<Subcategoria> list();

    /**
     * Crea una subcategoria en el sistema.
     *
     * @param subcategoria Objeto de la subcategoria a crear
     * @return Objeto de la subcategoria creada.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Subcategoria save(Subcategoria subcategoria);

    /**
     * Actualiza una tupla completa de la Subcategoria.
     *
     * @param id Identificador de la subcategoria a actualizar.
     * @param subcategoria Objeto de la subcategoria a actualizar.
     * @return Objeto de la subcategoria actualizada.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Subcategoria update(Long id, Subcategoria subcategoria);

    /**
     * Borra una subcategoria del sistema.
     * @param subcategoria Objeto de la subcategoria a borrar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void delete(Subcategoria subcategoria);

    /**
     * Encuentra una subcategoria por su id.
     *
     * @param subcategoria Objeto de la subcategoria a buscar
     * @return Objeto de tipo Optional que retorna una cosa u otra dependiendo
     * de si se halla o no la subcategoria.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Optional<Subcategoria> findSubcategoria(Subcategoria subcategoria);
}
