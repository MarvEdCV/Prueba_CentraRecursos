import { Component, OnInit } from '@angular/core';
//import  swal  from 'sweetalert2';
import { ActivatedRoute, Router } from '@angular/router';
import { Empleado } from 'src/app/Modelo/Empleado';
import { ServicioEmpleadoService } from 'src/app/Servicio/servicio-empleado.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-actualizar',
  templateUrl: './actualizar.component.html',
  styleUrls: ['./actualizar.component.css']
})
export class ActualizarComponent implements OnInit {

  id:number;
  empleado:Empleado = new Empleado  ();

  constructor(private empleadoService:ServicioEmpleadoService,private router:Router,private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.empleadoService.obtenerEmpleadoPorId(this.id).subscribe(dato =>{
      this.empleado = dato;
    },error => console.log(error))
  }
  irAlaListaDeEmpleados(){
    this.router.navigate(['/Mostrar']);
    Swal.fire("Se Actualizo el Empleado con Éxito")
  }
  onSubmit(){
    this.empleadoService.actualizarEmpleado(this.id,this.empleado).subscribe(dato => {
      this.irAlaListaDeEmpleados();
    },error => console.log(error));
  }

}
