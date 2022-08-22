import { Component, OnInit } from '@angular/core';
import { PortfolioService } from 'src/app/servicios/portfolio.service';
import { Router } from '@angular/router';
import { TokenService } from 'src/app/servicios/token.service';

@Component({
  selector: 'app-encabezado',
  templateUrl: './encabezado.component.html',
  styleUrls: ['./encabezado.component.css']
})
export class EncabezadoComponent implements OnInit {
  isLogged = false;
  datosPortfolio: any;

  constructor(private router:Router, public tokenService: TokenService) { }

  ngOnInit(): void {
    
    if(this.tokenService.getToken()){
      this.isLogged = true;
    }else{
      this.isLogged = false;
    }
  }

  iniciaSesion() {
    this.router.navigate(['/inicia-sesion']);
  }

  cerrarSesion(){
    this.tokenService.logOut();
    window.location.reload();
  }
}
