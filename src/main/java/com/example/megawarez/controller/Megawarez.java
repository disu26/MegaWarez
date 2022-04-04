package com.example.megawarez.controller;

import com.example.megawarez.domain.Usuario;
import com.example.megawarez.service.*;
import com.example.megawarez.util.LoginData;
import com.example.megawarez.util.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

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

    /**
     * Manejo del código HTTP que se responde en las API
     */
    private HttpStatus httpStatus = HttpStatus.OK;

    @PostMapping(path = "/api/v1/login")
    public ResponseEntity<Response> login(@RequestBody LoginData loginData) {
        response.restart();
        try {
            response.message = "Todo OK";
            response.data = loginData.getToken();
            httpStatus = HttpStatus.OK;
            //Consulta para saber si el usuario y la contraseña coinciden
        }catch (DataAccessException exception){
            getErrorMessageForResponse(exception);
        }catch (Exception exception){
            getErrorMessageInternal(exception);
        }
        return new ResponseEntity<>(response,httpStatus);
    }

    @PostMapping(path = "/api/v1/signin")
    public ResponseEntity<Response> signin(@RequestBody Usuario usuario){
        response.restart();
        try {
            log.info("Usuario a crear: {}", usuario);
            var usu = usuarioService.findUsuarioByUserName(usuario);
            if(!usu.isPresent()){
                response.data = usuarioService.save(usuario);
                httpStatus = httpStatus.CREATED;
            }else{
                throw new Exception("El usuario ya se encuentra registrado");
            }
        }catch (Exception exc){
            getErrorMessageInternal(exc);
        }
        return new ResponseEntity<>(response,httpStatus);
    }
    /**
     * Administrador para las excepciones a nivel de SQL con respecto al manejo del acceso a los datos
     *
     * @param exception Objeto DataAccessException
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    private void getErrorMessageForResponse(DataAccessException exception) {
        response.error = true;
        if(exception.getRootCause() instanceof SQLException) {
            SQLException sqlEx = (SQLException) exception.getRootCause();
            var sqlErrorCode = sqlEx.getErrorCode();
            switch (sqlErrorCode) {
                case 1062:
                    response.message = "El dato ya está registrado";
                    break;
                case 1452:
                    response.message = "El usuario indicado no existe";
                    break;
                default:
                    response.message = exception.getMessage();
                    response.data = exception.getCause();
            }
            httpStatus = HttpStatus.BAD_REQUEST;
        } else {
            response.message = exception.getMessage();
            response.data = exception.getCause();
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }

    /**
     * Administrador para las excepciones del sistema
     *
     * @param exception Objeto Exception
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    private void getErrorMessageInternal(Exception exception) {
        response.error = true;
        response.message = exception.getMessage();
        response.data = exception.getCause();
        httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
    }
}
