import { Component, OnInit } from '@angular/core';
import Swal from 'sweetalert2'
import { Router } from '@angular/router';
import { Empleado } from 'src/app/Modelo/Empleado';
import { ServicioEmpleadoService } from 'src/app/Servicio/servicio-empleado.service';

@Component({
  selector: 'app-mostrar',
  templateUrl: './mostrar.component.html',
  styleUrls: ['./mostrar.component.css']
})
export class MostrarComponent implements OnInit {
  Empleados:Empleado[]
  constructor(private ServicioEmpleado: ServicioEmpleadoService,private router:Router ) { }

  ngOnInit(): void {
    this.GetEmpleados();
  }

  private GetEmpleados(){  

    this.ServicioEmpleado.ObtenerEmpleados().subscribe(dato =>{
      this.Empleados = dato;
    })
  }
  actualizarEmpleado(id:number){
    this.router.navigate(['Actualizar',id]);
  }
  eliminarEmpleado(id:number){
    Swal.fire({
      title: '¿Estas seguro?',
      text: "Confirma si deseas eliminar al empleado",
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Sí, Eliminar'
    }).then((result) => {
      if(result.isConfirmed){
        this.ServicioEmpleado.eliminarEmpleado(id).subscribe(dato => {
          console.log(dato);
          this.obtenerEmpleados();
          Swal.fire(
            'Empleado eliminado',
            'El empleado ha sido eliminado con exito',
            'success'
          )
        })
      }
    })
  }
  private obtenerEmpleados(){
    this.ServicioEmpleado.ObtenerEmpleados().subscribe(dato =>{
      this.Empleados = dato;
    })
  } 
}
