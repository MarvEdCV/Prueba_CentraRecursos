import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Empleado } from '../Modelo/Empleado'; 
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ServicioEmpleadoService {

  constructor(private http: HttpClient ) { }
  private MyUrlBackend = 'http://localhost:8080/api/v1/empleados'; //Ruta para consumir la API creada en Srpring boot Java para consumir todos los empleados

  ObtenerEmpleados():Observable<Empleado[]>{
    return this.http.get<Empleado[]>(`${this.MyUrlBackend}`);
  }
  RegistrarEmpleado(empleado:Empleado):Observable<Object>{
    return this.http.post(`${this.MyUrlBackend}`,empleado);
  }
  obtenerEmpleadoPorId(id:number):Observable<Empleado>{
    return this.http.get<Empleado>(`${this.MyUrlBackend}/${id}`);
  }
   //este metodo sirve para actualizar el empleado
   actualizarEmpleado(id:number,empleado:Empleado) : Observable<Object>{
    return this.http.put(`${this.MyUrlBackend}/${id}`,empleado);
  }
  eliminarEmpleado(id:number): Observable<Object>{
    return this.http.delete(`${this.MyUrlBackend}/${id}`)
  }
}
