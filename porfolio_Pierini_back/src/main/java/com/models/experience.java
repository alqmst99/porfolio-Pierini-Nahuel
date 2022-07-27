package com.models;

import com.service.experienceService;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "experience", indexes = {
        @Index(name = "idx_experience_idexp", columnList = "idExp")
})
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

    @OneToOne(optional = false)
    private experienceService service;

    public experienceService getService() {
        return service;
    }

    public void setService(experienceService service) {
        this.service = service;
    }
}
