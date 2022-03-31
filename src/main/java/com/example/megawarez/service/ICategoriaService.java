package com.example.megawarez.service;

import com.example.megawarez.domain.Categoria;

import java.util.List;
import java.util.Optional;

public interface ICategoriaService {

    public List<Categoria> list();

    public Categoria save(Categoria categoria);

    public Categoria update(Long id, Categoria categoria);

    public void delete(Categoria categoria);

    public Optional<Categoria> findContact(Categoria categoria);
}
