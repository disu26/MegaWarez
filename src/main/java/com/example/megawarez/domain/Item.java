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
@Table(name = "descarga")
public class Item implements Serializable{

    /**
     * Variable utilizada para manejar el identificador de la tupla (consecutivo).
     */
    private static final Long serialVersionUID = 1L;

    /**
     * Identificador de la tupla.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itm_id")
    private Long id;

    /**
     * Id de la subcategoria del item.
     */
    @Column(name = "itm_subcategoria_id")
    private Long subcategoria_id;

    /**
     * Nombre del item.
     */
    @Column(name = "itm_nombre")
    private String nombre;

    /**
     * Fecha de creación del item.
     */
    @Column(name = "itm_created_at")
    private Instant created_at;
}
