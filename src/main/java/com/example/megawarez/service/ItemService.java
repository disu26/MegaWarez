package com.example.megawarez.service;

import com.example.megawarez.dao.ItemDao;
import com.example.megawarez.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Autowired
    private ItemDao itemDao;

    @Override
    public List<Item> list() {
        return (List<Item>) itemDao.findAll();
    }

    @Override
    public Item save(Item item) {
        return itemDao.save(item);
    }

    @Override
    public Item update(Long id, Item item) {
        item.setId(id);
        return itemDao.save(item);
    }

    @Override
    public void delete(Item item) {
        itemDao.delete(item);
    }

    @Override
    public Optional<Item> findContact(Item item) {
        return itemDao.findById(item.getId());
    }
}
