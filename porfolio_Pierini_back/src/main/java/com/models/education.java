package com.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "education", indexes = {
        @Index(name = "idx_education_idedu", columnList = "idEdu")
})
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
