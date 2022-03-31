package com.example.megawarez.service;

import com.example.megawarez.domain.Descarga;

import java.util.List;
import java.util.Optional;

public interface IDescargaService {

    public List<Descarga> list();

    public Descarga save(Descarga descarga);

    public Descarga update(Long id, Descarga descarga);

    public void delete(Descarga descarga);

    public Optional<Descarga> findContact(Descarga descarga);
}
