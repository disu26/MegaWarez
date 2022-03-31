package com.example.megawarez.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "session")
public class Session implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ses_id")
    private Long id;

    @Column(name = "ses_usuario_id")
    private Long usuario_id;

    @Column(name = "ses_token")
    private String token;

    @Column(name = "ses_created_at")
    private Date created_at;
}
