package com.example.megawarez.service;

import com.example.megawarez.dao.CategoriaDao;
import com.example.megawarez.domain.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Clase tipo Servicio para el manejo de la categoria.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
@Service
public class CategoriaService implements ICategoriaService{

    /**
     * Dao de la categoria.
     */
    @Autowired
    private CategoriaDao categoriaDao;

    /**
     * Devuelve una lista con todas las categorias del sistema
     *
     * @return
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional(readOnly = true)
    public List<Categoria> list() {
        return (List<Categoria>) categoriaDao.findAll();
    }

    /**
     * Crea una categoria en el sistema.
     *
     * @param categoria Objeto de la categoria a crear
     * @return Objeto de la categoria creada.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional
    public Categoria save(Categoria categoria) {
        return categoriaDao.save(categoria);
    }

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
    @Override
    @Transactional
    public Categoria update(Long id, Categoria categoria) {
        categoria.setId(id);
        return categoriaDao.save(categoria);
    }

    /**
     * Borra una categoria del sistema.
     * @param categoria Objeto de la categoria a borrar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional
    public void delete(Categoria categoria) {
        categoriaDao.delete(categoria);
    }

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
    @Override
    @Transactional(readOnly = true)
    public Optional<Categoria> findCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getId());
    }
}
