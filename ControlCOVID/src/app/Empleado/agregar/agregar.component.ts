import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Empleado } from 'src/app/Modelo/Empleado';
import { ServicioEmpleadoService } from 'src/app/Servicio/servicio-empleado.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-agregar',
  templateUrl: './agregar.component.html',
  styleUrls: ['./agregar.component.css']
})
export class AgregarComponent implements OnInit {
  empleado: Empleado = new Empleado();
  constructor(private empleadoServicio:ServicioEmpleadoService,private router:Router) { }

  ngOnInit(): void {
  }
  guardarEmpleado(){
    this.empleadoServicio.RegistrarEmpleado(this.empleado).subscribe(dato =>{
      Swal.fire("Se Agregó el Empleado con Éxito")
      console.log(dato);
      this.router.navigate(['Mostrar']);
    },error=> console.log(error))
  }

  onSubmit(){
    console.log(this.empleado)
   this.guardarEmpleado();
  }

}
