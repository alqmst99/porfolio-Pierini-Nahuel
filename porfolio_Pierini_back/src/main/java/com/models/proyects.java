package com.porfolio.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.awt.*;
import java.util.Date;

@Entity
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
