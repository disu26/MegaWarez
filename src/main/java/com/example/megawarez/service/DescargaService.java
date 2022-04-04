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

    /**
     * Dao de la descarga.
     */
    @Autowired
    private DescargaDao descargaDao;

    /**
     * Devuelve una lista con todas las descargas del sistema
     *
     * @return
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional(readOnly = true)
    public List<Descarga> list() {
        return (List<Descarga>) descargaDao.findAll();
    }

    /**
     * Crea una descarga en el sistema.
     *
     * @param descarga Objeto de la descarga a crear
     * @return Objeto de la descarga creada.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional
    public Descarga save(Descarga descarga) {
        return descargaDao.save(descarga);
    }

    /**
     * Actualiza una tupla completa de la Descarga.
     *
     * @param id Identificador de la descarga a actualizar.
     * @param descarga Objeto de la descarga a actualizar.
     * @return Objeto de la descarga actualizada.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional
    public Descarga update(Long id, Descarga descarga) {
        descarga.setId(id);
        return descargaDao.save(descarga);
    }

    /**
     * Borra una descarga del sistema.
     * @param descarga Objeto de la descarga a borrar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional
    public void delete(Descarga descarga) {
        descargaDao.delete(descarga);
    }

    /**
     * Encuentra una descarga por su id.
     *
     * @param descarga Objeto de la descarga a buscar
     * @return Objeto de tipo Optional que retorna una cosa u otra dependiendo
     * de si se halla o no la descarga.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<Descarga> findDescarga(Descarga descarga) {
        return descargaDao.findById(descarga.getId());
    }
}
