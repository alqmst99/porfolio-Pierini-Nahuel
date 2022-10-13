package com.Pierini.Portafolio.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
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
    
    private String name;
    @NotNull
    private String lastName;
    @NotNull
    private String descP;
    @NotNull
    private String imgP;

  
    
}
