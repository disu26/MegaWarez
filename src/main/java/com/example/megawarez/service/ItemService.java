package com.example.megawarez.service;

import com.example.megawarez.dao.ItemDao;
import com.example.megawarez.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Clase tipo Servicio para el manejo de los items.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
@Service
public class ItemService implements IItemService{

    /**
     * Dao del item.
     */
    @Autowired
    private ItemDao itemDao;

    /**
     * Devuelve una lista con todos los items del sistema
     *
     * @return
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional(readOnly = true)
    public List<Item> list() {
        return (List<Item>) itemDao.findAll();
    }

    /**
     * Crea un item en el sistema.
     *
     * @param item Objeto del item a crear
     * @return Objeto del item creado.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional
    public Item save(Item item) {
        return itemDao.save(item);
    }

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
    @Override
    @Transactional
    public Item update(Long id, Item item) {
        item.setId(id);
        return itemDao.save(item);
    }

    /**
     * Borra un item del sistema.
     * @param item Objeto del item a borrar.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Override
    @Transactional
    public void delete(Item item) {
        itemDao.delete(item);
    }

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
    @Override
    @Transactional(readOnly = true)
    public Optional<Item> findItem(Item item) {
        return itemDao.findById(item.getId());
    }

    /**
     * Encuentra un item por su nombre.
     *
     * @param item Objeto del item a buscar
     * @return Objeto de tipo Optional que retorna una cosa u otra dependiendo
     * de si se halla o no el item.
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    @Transactional(readOnly = true)
    public Optional<Item> findItemByName(Item item){
        return itemDao.findItemByName(item.getNombre());
    }
}
