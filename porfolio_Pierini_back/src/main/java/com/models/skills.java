package com.porfolio.ap.models;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.awt.*;

@Entity
public class skills {
    private String nameSkill;
    private String levelSkill;
    private Image imgSkill;

    public skills() {
    }

    public skills(String idSkill, String nameSkill, String levelSkill) {
        this.nameSkill = nameSkill;
        this.levelSkill = levelSkill;
    }

    public skills(Image imgSkill) {
        this.imgSkill = imgSkill;
    }
}
