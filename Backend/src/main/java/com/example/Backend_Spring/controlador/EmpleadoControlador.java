/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Backend_Spring.controlador;

import com.example.Backend_Spring.modelo.Empleado;
import com.example.Backend_Spring.repositorio.EmpleadoRepositorio;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author marvi
 * API generada
 */
@RestController //Agregamos una anotación a nivel de clase para utilizar codigo para la API REST
@RequestMapping("/api/v1/")//Declaramos nuestra base para el consumo de nuestra api
@CrossOrigin(origins = "http://localhost:4200") //Por medio de esta anotación podemos realizar la transmisión y conexión hacia nuestro front-end
public class EmpleadoControlador {

    @Autowired //Inyectamos dependencias desde el rest controller
    private EmpleadoRepositorio repositorio;

    //Este metodo es el utilizado para listar todos los empleados, el cual lo redirigimos en la ruta /api/v1/empleados para su consumo desde alguna aplicacion.
    @GetMapping("/empleados")//Metodo GET para solicitar datos
    public List<Empleado> listarTodosLosEmpleados() {
        return repositorio.findAll();
    }

    //Este metodo sirve para guardar algun empleado.
    @PostMapping("/empleados")//Metodo POST para poder inyectar datos al la DB
    public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
        System.out.println(empleado);
        return repositorio.save(empleado);
    }

    //Metodo sirve para buscar un empleado por el id.
    @GetMapping("/empleados/{id}")//Metodo Get para localizar un unico registro de nuestra entidad, en este caso nuestra entidad es la de Empleado
    public ResponseEntity<Empleado> obtenerEmpleadoPorId(@PathVariable Long id) {
        Empleado empleado = repositorio.findById(id).orElseThrow();
        return ResponseEntity.ok(empleado);
    }

    @PutMapping("/empleados/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado detallesEmpleado) {
        Empleado empleado = repositorio.findById(id).orElseThrow();
        empleado.setNombre(detallesEmpleado.getNombre());
        empleado.setPuesto(detallesEmpleado.getPuesto());
        empleado.setNombreVacuna(detallesEmpleado.getNombreVacuna());
        empleado.setFechaPrimeraDosis(detallesEmpleado.getFechaPrimeraDosis());
        empleado.setFechaSegundaDosis(detallesEmpleado.getFechaSegundaDosis());

        Empleado empleadoActualizado = repositorio.save(empleado);
        return ResponseEntity.ok(empleadoActualizado);
    }

    //este metodo sirve para eliminar un empleado
    @DeleteMapping("/empleados/{id}")
    public ResponseEntity<Map<String, Boolean>> eliminarEmpleado(@PathVariable Long id) {
        Empleado empleado = repositorio.findById(id)
                .orElseThrow();

        repositorio.delete(empleado);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminar", Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}
