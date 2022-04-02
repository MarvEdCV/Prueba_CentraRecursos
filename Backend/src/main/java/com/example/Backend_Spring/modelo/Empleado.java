/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Backend_Spring.modelo;

import java.util.Date;
import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/**
 *
 * @author marvi
 */
/*
Toda la estructura para el almacenamiento de datos y recuperación de los mismos es la de JPA https://spring.io/guides/gs/accessing-data-jpa/ 
*/
@Entity 
@Table(name = "Empleado") //Aqui damos el nombre que le queremos dar a la tabla donde almacenaremos los diferentes datos de los empleados. Esta tabla si no existe en la base de datos configurada será creada y sino será solamente actualizada
public class Empleado {

    //Indicamos los diferentes atributos de nuestra tabla, de igual manera le asignamos sus diferentes carácteristicas(NO ES NECESARIO CREAR LA TABLA EN LA BASE DE DATOS, SOLAMENTE LA BASE DE DATOS!).
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre",nullable=false)
    private String Nombre;
    
    @Column(name = "puesto",nullable=false)
    private String Puesto;
    
    @Column(name = "nombrevacuna",nullable=false)
    private String Nombrevacuna;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "fechaprimeradosis",nullable=false)
    private Date Fechaprimeradosis;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "fechasegundadosis")
    private Date Fechasegundadosis;
    
    //Creamos los constructores.
    public Empleado() {

    }
    public Empleado(Long id, String Nombre, String Puesto, String NombreVacuna, Date FechaPrimeraDosis, Date FechaSegundaDosis) {
        this.id = id;
        this.Nombre = Nombre;
        this.Puesto = Puesto;
        this.Nombrevacuna = NombreVacuna;
        this.Fechaprimeradosis = FechaPrimeraDosis;
        this.Fechasegundadosis = FechaSegundaDosis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public String getNombreVacuna() {
        return Nombrevacuna;
    }

    public void setNombreVacuna(String NombreVacuna) {
        this.Nombrevacuna = NombreVacuna;
    }

    public Date getFechaPrimeraDosis() {
        return Fechaprimeradosis;
    }

    public void setFechaPrimeraDosis(Date FechaPrimeraDosis) {
        this.Fechaprimeradosis = FechaPrimeraDosis;
    }

    public Date getFechaSegundaDosis() {
        return Fechasegundadosis;
    }

    public void setFechaSegundaDosis(Date FechaSegundaDosis) {
        this.Fechasegundadosis = FechaSegundaDosis;
    }

}
