package com.Pierini.Portafolio.Entity;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

 /**
 *
 * @author Nahuel Pierini
 */
@Getter @Setter
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @NotNull
    
    private String Name;
    @NotNull
    private String LastName;
    @NotNull
    private String DescP;
    @NotNull
    private String imgP;

  
    
}
