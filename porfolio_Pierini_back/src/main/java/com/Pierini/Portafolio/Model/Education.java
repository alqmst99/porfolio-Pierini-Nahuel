
package com.Pierini.Portafolio.Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education {
    

  @Id @GeneratedValue(strategy=GenerationType.AUTO) 
   private Long idEdu;
   private String tituloEdu;
   private Date  fechaIEdu;
   private Date FechaFEdu;
   private String imagenEdu;

    public Education() {
    }

    public Education(Long idEdu, String tituloEdu, Date fechaIEdu, Date FechaFEdu, String imagenEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.fechaIEdu = fechaIEdu;
        this.FechaFEdu = FechaFEdu;
        this.imagenEdu = imagenEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public Date getFechaIEdu() {
        return fechaIEdu;
    }

    public void setFechaIEdu(Date fechaIEdu) {
        this.fechaIEdu = fechaIEdu;
    }

    public Date getFechaFEdu() {
        return FechaFEdu;
    }

    public void setFechaFEdu(Date FechaFEdu) {
        this.FechaFEdu = FechaFEdu;
    }

    public String getImagenEdu() {
        return imagenEdu;
    }

    public void setImagenEdu(String imagenEdu) {
        this.imagenEdu = imagenEdu;
    }
    
}
