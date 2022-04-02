/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Backend_Spring.repositorio;

import com.example.Backend_Spring.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author marvi
 * Creamos una interface que sera una clase hija de JpaRepository, esta es una librería para realizar consultas a la base de datos.
 */
@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long>{
    
}
