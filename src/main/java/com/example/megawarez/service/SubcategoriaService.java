package com.example.megawarez.service;

import com.example.megawarez.dao.SubcategoriaDao;
import com.example.megawarez.domain.Subcategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Clase tipo Servicio para el manejo de la Subcategoria.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
@Service
public class SubcategoriaService implements ISubcategoriaService{

    /**
     * Dao de la subcategoria.
     */
    @Autowired
    private SubcategoriaDao subcategoriaDao;

    /**
     * Devuelve una lista con todas las subcategorias del sistema
     *
     * @return
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional(readOnly = true)
    public List<Subcategoria> list() {
        return (List<Subcategoria>) subcategoriaDao.findAll();
    }

    /**
     * Crea una subcategoria en el sistema.
     *
     * @param subcategoria Objeto de la subcategoria a crear
     * @return Objeto de la subcategoria creada.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional
    public Subcategoria save(Subcategoria subcategoria) {
        return subcategoriaDao.save(subcategoria);
    }

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
    @Override
    @Transactional
    public Subcategoria update(Long id, Subcategoria subcategoria) {
        subcategoria.setId(id);
        return subcategoriaDao.save(subcategoria);
    }

    /**
     * Borra una subcategoria del sistema.
     * @param subcategoria Objeto de la subcategoria a borrar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional
    public void delete(Subcategoria subcategoria) {
        subcategoriaDao.delete(subcategoria);
    }

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
    @Override
    @Transactional(readOnly = true)
    public Optional<Subcategoria> findSubcategoria(Subcategoria subcategoria) {
        return subcategoriaDao.findById(subcategoria.getId());
    }
}
