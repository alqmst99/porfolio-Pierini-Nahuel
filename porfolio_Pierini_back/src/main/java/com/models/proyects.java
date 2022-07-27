package com.models;

import javax.persistence.*;
import java.awt.*;
import java.util.Date;

@Entity
@Table(name = "proyects", indexes = {
        @Index(name = "idx_proyects_idproy", columnList = "idProy")
})
public class proyects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idProy;
    private String nameProy;
    private String DescProy;
    private Image imgProy;
    private Date  dateProy;

    public proyects() {
    }

    public proyects(long idProy, String nameProy, String descProy, Image imgProy, Date dateProy) {
        this.idProy = idProy;
        this.nameProy = nameProy;
        DescProy = descProy;
        this.imgProy = imgProy;
        this.dateProy = dateProy;
    }
}
