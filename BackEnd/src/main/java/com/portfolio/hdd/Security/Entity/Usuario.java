/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.hdd.Security.Entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;




/**
 *
 * @author drpendejoloco
 */
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nombre;
    @NotNull
    @Column(unique = true)
    private String nombreUsario;
    @NotNull
    private String email;
    @NotNull
    private String password;
    /**
     * Relacion de tabla Rol con Usuario// un usuario varios roles y viceversa
     * Muchos a muchos es la relacion
     */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "usuario_id"),inverseJoinColumns = @JoinColumn ( name = "rol_id"))
    private Set<Rol> roles = new HashSet<>();

    public Usuario() {
    }

    public Usuario(String nombre, String nombreUsario, String email, String password) {
        this.nombre = nombre;
        this.nombreUsario = nombreUsario;
        this.email = email;
        this.password = password;
    }
    
 // Getter y Setter 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsario() {
        return nombreUsario;
    }

    public void setNombreUsario(String nombreUsario) {
        this.nombreUsario = nombreUsario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }
    
    /**
     * Se crea la union de dos tablas Usuario rol y dos columnas usuario ID y la otra 
     * va a tener un campo q es rol Id
     * Usuario X relacionado con Rol X
     */
    
    
}




