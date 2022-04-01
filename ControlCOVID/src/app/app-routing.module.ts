import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ActualizarComponent } from './Empleado/actualizar/actualizar.component';
import { AgregarComponent } from './Empleado/agregar/agregar.component';
import { MostrarComponent } from './Empleado/mostrar/mostrar.component';

const routes: Routes = [
{
path:'Mostrar',component:MostrarComponent
},
{
path:'Agregar',component:AgregarComponent
},
{
path:'Actualizar',component:ActualizarComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
