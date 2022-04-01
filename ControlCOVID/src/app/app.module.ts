import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MostrarComponent } from './Empleado/mostrar/mostrar.component';
import { AgregarComponent } from './Empleado/agregar/agregar.component';
import { ActualizarComponent } from './Empleado/actualizar/actualizar.component';

@NgModule({
  declarations: [
    AppComponent,
    MostrarComponent,
    AgregarComponent,
    ActualizarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
