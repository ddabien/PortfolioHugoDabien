/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.dab.Security.Entity;



import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import com.portfolio.dab.Security.Enums.RolNombre;
import javax.persistence.Entity;
        


@Entity
public class Rol {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    @javax.persistence.Id
    private RolNombre rolNombre;
    
    //generar constructor 

    public Rol() {
    }


    public Rol(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
    // Getter and Setter code

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolNombre getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
    
    //Getter y Setters
    
    
    
}
