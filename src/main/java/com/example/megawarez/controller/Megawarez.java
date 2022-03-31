package com.example.megawarez.controller;

import com.example.megawarez.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Megawarez {

    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private DescargaService descargaService;

    @Autowired
    private ItemService itemService;

    @Autowired
    private SessionService sessionService;

    @Autowired
    private SubcategoriaService subcategoriaService;

    @Autowired
    private UsuarioService usuarioService;
}
