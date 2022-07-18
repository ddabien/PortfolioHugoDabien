/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.hdd.Controller;

import com.portfolio.hdd.Entity.Persona;
import com.portfolio.hdd.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author drpendejoloco
 */

@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    // url:localhost/personas/traer
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    // url:localhost/personas/crear "","",""
    @PostMapping ("/personas/crear")
    public String createPersona (@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La creacion de la persona ha sido correcta";
    } 
    // url:localhost/personas/borrar/x
    @DeleteMapping ("/personas/borrar/{id}")  
    public String deletePersona (@PathVariable Long id){
    ipersonaService.deletePersona(id);
    return "La eliminacion de la persona ha sido correcta";
    }

    @PutMapping ("/personas/editar/{id}")
    public Persona editPersona (@PathVariable Long id,
            @RequestParam ("nombre") String nuevoNombre,
            @RequestParam ("apellido") String nuevoApellido,
            @RequestParam ("img") String nuevoImg) {
        Persona persona = ipersonaService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
        
        ipersonaService.savePersona(persona);
        return persona;
    }
        
}
