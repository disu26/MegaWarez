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
@Table(name = "usuario")
public class Usuario implements Serializable{

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usu_id")
    private Long id;

    @Column(name = "usu_username")
    private String username;

    @Column(name = "usu_password")
    private String password;

    @Column(name = "usu_created_at")
    private Date created_at;

    @Column(name = "usu_updatedx_at")
    private Date updated_at;
}
