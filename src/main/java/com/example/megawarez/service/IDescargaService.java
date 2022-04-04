package com.example.megawarez.service;

import com.example.megawarez.domain.Descarga;

import java.util.List;
import java.util.Optional;

/**
 * Interface para el servicio de la descarga.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public interface IDescargaService {

    /**
     * Devuelve una lista con todas las descargas del sistema
     *
     * @return
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public List<Descarga> list();

    /**
     * Crea una descarga en el sistema.
     *
     * @param descarga Objeto de la descarga a crear
     * @return Objeto de la descarga creada.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Descarga save(Descarga descarga);

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
    public Descarga update(Long id, Descarga descarga);

    /**
     * Borra una descarga del sistema.
     * @param descarga Objeto de la descarga a borrar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void delete(Descarga descarga);

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
    public Optional<Descarga> findDescarga(Descarga descarga);
}
