package com.example.megawarez.controller;

import com.example.megawarez.service.*;
import com.example.megawarez.util.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlodar de la aplicación de Megawarez
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
@Slf4j
@RestController
public class Megawarez {

    /**
     *  Servicio para el manejo de la tabla Categoria.
     */
    @Autowired
    private CategoriaService categoriaService;

    /**
     * Servicio para el manejo de la tabla Descarga.
     */
    @Autowired
    private DescargaService descargaService;

    /**
     * Servicio para el manejo de la tabla Item.
     */
    @Autowired
    private ItemService itemService;

    /**
     * Servicio para el manejo de la tabla Session.
     */
    @Autowired
    private SessionService sessionService;

    /**
     * Servicio para el manejo de la tabla Subcategoria.
     */
    @Autowired
    private SubcategoriaService subcategoriaService;

    /**
     * Servicio para el manejo de la tabla Usuario.
     */
    @Autowired
    private UsuarioService usuarioService;

    /**
     * Variable para el manejo de las respuestas de las API.
     */
    private Response response = new Response();
}
