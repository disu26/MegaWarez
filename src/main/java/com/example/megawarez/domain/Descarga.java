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
 * Entidad descarga.
 *
 * @version 1.0.0 2022-03-31
 * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
 * @since 1.0.0
 */
@Data
@Entity
@Table(name = "descarga")
public class Descarga implements Serializable {

    /**
     * Variable utilizada para manejar el identificador de la tupla (consecutivo).
     */
    private static final Long serialVersionUID = 1L;

    /**
     * Identificador de la tupla.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dwn_id")
    private Long id;

    /**
     * Id del usuario que realiza una descarga.
     */
    @Column(name = "dwn_usuario_id")
    private Long usuario_id;

    /**
     * Id del item que es descargado.
     */
    @Column(name = "dwn_item_id")
    private Long item_id;

    /**
     * Fecha de la descarga.
     */
    @Column(name = "dwn_created_at")
    private Instant created_at;
}
