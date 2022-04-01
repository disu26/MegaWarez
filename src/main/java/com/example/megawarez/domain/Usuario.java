package com.example.megawarez.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.io.Serializable;
import java.time.Instant;

/**
 * Entidad item.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{

    /**
     * Variable utilizada para manejar el identificador de la tupla (consecutivo).
     */
    private static final Long serialVersionUID = 1L;

    /**
     * Identificador de la tupla.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usu_id")
    private Long id;

    /**
     * Nombre de usuario del usuario.
     */
    @Column(name = "usu_username")
    private String username;

    /**
     * Contraseña del usuario.
     */
    @Column(name = "usu_password")
    private String password;

    /**
     * Fecha de creación del usuario.
     */
    @Column(name = "usu_created_at")
    private Instant created_at;

    /**
     * Fecha de actualizacion del usuario
     */
    @Column(name = "usu_updated_at")
    private Instant updated_at;
}
