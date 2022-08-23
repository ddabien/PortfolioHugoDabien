/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.hdd.Security.Repository;

import com.portfolio.hdd.Security.Entity.Rol;
import com.portfolio.hdd.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author drpendejoloco
 */
@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional <Rol> findByRolNombre (RolNombre rolNombre);
}
