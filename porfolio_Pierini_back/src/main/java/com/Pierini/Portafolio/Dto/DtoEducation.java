/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.Pierini.Portafolio.Dto;




/**
 *
 * @author Pieirni Nahuel Nicolas 
 */
public class DtoEducation {
@Not

private String nameE;

private String descE;

private String dateI;

private String dateF;

    public DtoEducation() {
    }

    public DtoEducation(String nameE, String descE, String dateI, String dateF) {
        this.nameE = nameE;
        this.descE = descE;
        this.dateI = dateI;
        this.dateF = dateF;
    }

    public String getNameE() {
        return nameE;
    }

    public void setNameE(String nameE) {
        this.nameE = nameE;
    }

    public String getDescE() {
        return descE;
    }

    public void setDescE(String descE) {
        this.descE = descE;
    }

    public String getDateI() {
        return dateI;
    }

    public void setDateI(String dateI) {
        this.dateI = dateI;
    }

    public String getDateF() {
        return dateF;
    }

    public void setDateF(String dateF) {
        this.dateF = dateF;
    }

}
