import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ControlCOVID';

  constructor(private router:Router){}

  Mostrar(){
    this.router.navigate(["Mostrar"]);
  }
  Nuevo(){
    this.router.navigate(["Agregar"]);
  }
}
