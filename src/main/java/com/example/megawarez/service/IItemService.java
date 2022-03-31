package com.example.megawarez.service;

import com.example.megawarez.domain.Item;

import java.util.List;
import java.util.Optional;

public interface IItemService {
    public List<Item> list();

    public Item save(Item item);

    public Item update(Long id, Item item);

    public void delete(Item item);

    public Optional<Item> findContact(Item item);
}
