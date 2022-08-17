import { Component, OnInit } from '@angular/core';
import { PortfolioService } from 'src/app/servicios/portfolio.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-encabezado',
  templateUrl: './encabezado.component.html',
  styleUrls: ['./encabezado.component.css']
})
export class EncabezadoComponent implements OnInit {
  datosPortfolio: any;

  constructor(private router:Router) { }

  ngOnInit(): void {
    this.datosPortfolio.obtenerDatos();
  }

  iniciaSesion() {
    this.router.navigate(['/inicia-sesion']);
  }
}
