package com.example.megawarez.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "subcategoria")
public class Subcategoria implements Serializable{

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scat_id")
    private Long id;

    @Column(name = "scat_categoria_id")
    private Long categoria_id;

    @Column(name = "scat_nombre")
    private String nombre;

    @Column(name = "scat_created_at")
    private Date created_at;
}