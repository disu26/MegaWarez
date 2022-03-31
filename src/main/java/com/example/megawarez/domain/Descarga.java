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
@Table(name = "descarga")
public class Descarga implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dwn_id")
    private Long id;

    @Column(name = "dwn_usuario_id")
    private Long usuario_id;

    @Column(name = "dwn_item_id")
    private Long item_id;

    @Column(name = "dwn_created_at")
    private Date created_at;
}
