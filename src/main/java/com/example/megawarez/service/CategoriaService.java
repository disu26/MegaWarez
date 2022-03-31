package com.example.megawarez.service;

import com.example.megawarez.dao.CategoriaDao;
import com.example.megawarez.domain.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService implements ICategoriaService{

    @Autowired
    private CategoriaDao categoriaDao;


    @Override
    @Transactional(readOnly = true)
    public List<Categoria> list() {
        return (List<Categoria>) categoriaDao.findAll();
    }

    @Override
    @Transactional
    public Categoria save(Categoria categoria) {
        return categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public Categoria update(Long id, Categoria categoria) {
        categoria.setId(id);
        return categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Categoria categoria) {
        categoriaDao.delete(categoria);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Categoria> findContact(Categoria categoria) {
        return categoriaDao.findById(categoria.getId());
    }
}
