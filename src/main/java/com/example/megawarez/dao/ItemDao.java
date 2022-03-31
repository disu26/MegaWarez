package com.example.megawarez.dao;

import com.example.megawarez.domain.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemDao extends CrudRepository<Item, Long> {
}
