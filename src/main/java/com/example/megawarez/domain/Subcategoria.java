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
@Table(name = "subcategoria")
public class Subcategoria implements Serializable{

    /**
     * Variable utilizada para manejar el identificador de la tupla (consecutivo).
     */
    private static final Long serialVersionUID = 1L;

    /**
     * Identificador de la tupla.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scat_id")
    private Long id;

    /**
     * Id de la categoría a la que pertenece la subcategoria.
     */
    @Column(name = "scat_categoria_id")
    private Long categoria_id;

    /**
     * Nombre de la subcategoría.
     */
    @Column(name = "scat_nombre")
    private String nombre;

    /**
     * Fecha de creación de la subcategoria.
     */
    @Column(name = "scat_created_at")
    private Instant created_at;
}
