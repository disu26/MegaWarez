package com.example.megawarez.service;

import com.example.megawarez.domain.Categoria;

import java.util.List;
import java.util.Optional;

/**
 * Interface para el servicio de la categoria.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public interface ICategoriaService {

    /**
     * Devuelve una lista con todas las categorias del sistema
     *
     * @return
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public List<Categoria> list();

    /**
     * Crea una categoria en el sistema.
     *
     * @param categoria Objeto de la categoria a crear
     * @return Objeto de la categoria creada.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Categoria save(Categoria categoria);

    /**
     * Actualiza una tupla completa de la Categoria.
     *
     * @param id Identificador de la categoria a actualizar.
     * @param categoria Objeto de la categoria a actualizar.
     * @return Objeto de la categoria actualizada.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Categoria update(Long id, Categoria categoria);

    /**
     * Borra una categoria del sistema.
     * @param categoria Objeto de la categoria a borrar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void delete(Categoria categoria);

    /**
     * Encuentra una cateogria por su id.
     *
     * @param categoria Objeto de la categoria a buscar
     * @return Objeto de tipo Optional que retorna una cosa u otra dependiendo
     * de si se halla o no la categoria.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Optional<Categoria> findCategoria(Categoria categoria);
}
