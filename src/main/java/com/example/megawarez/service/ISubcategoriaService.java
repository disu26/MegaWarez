package com.example.megawarez.service;

import com.example.megawarez.domain.Subcategoria;

import java.util.List;
import java.util.Optional;

public interface ISubcategoriaService {
    public List<Subcategoria> list();

    public Subcategoria save(Subcategoria subcategoria);

    public Subcategoria update(Long id, Subcategoria subcategoria);

    public void delete(Subcategoria subcategoria);

    public Optional<Subcategoria> findContact(Subcategoria subcategoria);
}
