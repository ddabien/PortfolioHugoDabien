/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.hdd.Interface;

import com.portfolio.hdd.Entity.Persona;
import java.util.List;


/**
 *
 * @author drpendejoloco
 */

public interface IPersonaService {
    //Ingresar una lista de las personas 
    public List<Persona> getPersona (); 
    // Guardo la persona
    public void savePersona(Persona persona);
    // Borrar persona  buscada x ID
    public void deletePersona(Long id);
    // Find Persona/usuario
    public Persona findPersona(Long id);
    
    
    
}
