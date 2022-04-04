package com.example.megawarez.service;

import com.example.megawarez.domain.Item;

import java.util.List;
import java.util.Optional;

/**
 * Interface para el servicio del item.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
public interface IItemService {
    /**
     * Devuelve una lista con todos los items del sistema
     *
     * @return
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public List<Item> list();

    /**
     * Crea un item en el sistema.
     *
     * @param item Objeto del item a crear
     * @return Objeto del item creado.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Item save(Item item);

    /**
     * Actualiza una tupla completa del Item.
     *
     * @param id Identificador del item a actualizar.
     * @param item Objeto del item a actualizar.
     * @return Objeto del item actualizada.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Item update(Long id, Item item);

    /**
     * Borra un item del sistema.
     * @param item Objeto del item a borrar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void delete(Item item);

    /**
     * Encuentra un item por su id.
     *
     * @param item Objeto del item a buscar
     * @return Objeto de tipo Optional que retorna una cosa u otra dependiendo
     * de si se halla o no el item.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Optional<Item> findItem(Item item);
}
