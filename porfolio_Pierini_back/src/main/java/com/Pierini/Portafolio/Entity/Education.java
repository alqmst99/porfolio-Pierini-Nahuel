
package com.Pierini.Portafolio.Entity;

import java.text.spi.DateFormatProvider;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Pieirni Nahuel Nicolas 
 */
@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
private DateFormatProvider dateI;
private DateFormatProvider dateF;
private String descEd;

    public Education() {
    }

    public Education(DateFormatProvider dateI, DateFormatProvider dateF, String descEd) {
        this.dateI = dateI;
        this.dateF = dateF;
        this.descEd = descEd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DateFormatProvider getDateI() {
        return dateI;
    }

    public void setDateI(DateFormatProvider dateI) {
        this.dateI = dateI;
    }

    public DateFormatProvider getDateF() {
        return dateF;
    }

    public void setDateF(DateFormatProvider dateF) {
        this.dateF = dateF;
    }

    public String getDescEd() {
        return descEd;
    }

    public void setDescEd(String descEd) {
        this.descEd = descEd;
    }
 
}
