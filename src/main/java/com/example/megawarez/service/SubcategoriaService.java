package com.example.megawarez.service;

import com.example.megawarez.dao.SubcategoriaDao;
import com.example.megawarez.domain.Subcategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Autowired
    private SubcategoriaDao subcategoriaDao;

    @Override
    public List<Subcategoria> list() {
        return (List<Subcategoria>) subcategoriaDao.findAll();
    }

    @Override
    public Subcategoria save(Subcategoria subcategoria) {
        return subcategoriaDao.save(subcategoria);
    }

    @Override
    public Subcategoria update(Long id, Subcategoria subcategoria) {
        subcategoria.setId(id);
        return subcategoriaDao.save(subcategoria);
    }

    @Override
    public void delete(Subcategoria subcategoria) {
        subcategoriaDao.delete(subcategoria);
    }

    @Override
    public Optional<Subcategoria> findContact(Subcategoria subcategoria) {
        return subcategoriaDao.findById(subcategoria.getId());
    }
}
