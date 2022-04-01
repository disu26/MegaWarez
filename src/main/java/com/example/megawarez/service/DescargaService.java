package com.example.megawarez.service;

import com.example.megawarez.dao.DescargaDao;
import com.example.megawarez.domain.Descarga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Clase tipo Servicio para el manejo de las descargas.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
@Service
public class DescargaService implements IDescargaService{

    @Autowired
    private DescargaDao descargaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Descarga> list() {
        return (List<Descarga>) descargaDao.findAll();
    }

    @Override
    @Transactional
    public Descarga save(Descarga descarga) {
        return descargaDao.save(descarga);
    }

    @Override
    @Transactional
    public Descarga update(Long id, Descarga descarga) {
        descarga.setId(id);
        return descargaDao.save(descarga);
    }

    @Override
    @Transactional
    public void delete(Descarga descarga) {
        descargaDao.delete(descarga);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Descarga> findContact(Descarga descarga) {
        return descargaDao.findById(descarga.getId());
    }
}
