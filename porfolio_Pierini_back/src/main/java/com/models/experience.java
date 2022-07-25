package com.porfolio.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class experience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idExp;
    private String tituloExp;
    private Date fechaiExp;
    private Date fechafExp;
    private String descExp;
    private String imageExp;

    public experience() {
    }

    public experience(long idExp, String tituloExp, Date fechaiExp, Date fechafExp, String descExp, String imageExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechaiExp = fechaiExp;
        this.fechafExp = fechafExp;
        this.descExp = descExp;
        this.imageExp = imageExp;
    }
}
