package com.porfolio.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class education {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long idEdu;
    private String tituloEdu;
    private Date fechaiEdu;
    private Date fechafEdu;
    private String descEdu;
    private String imageEdu;

    public education() {
    }

    public education(long idEdu, String tituloEdu, Date fechaiEdu, Date fechafEdu, String descEdu, String imageEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.fechaiEdu = fechaiEdu;
        this.fechafEdu = fechafEdu;
        this.descEdu = descEdu;
        this.imageEdu = imageEdu;
    }
}
