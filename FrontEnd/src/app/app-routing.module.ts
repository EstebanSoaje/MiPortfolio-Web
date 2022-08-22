import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { IniciaSesionComponent } from './componentes/inicia-sesion/inicia-sesion.component';
import { PortfolioComponent } from './componentes/portfolio/portfolio.component';

const routes: Routes = [
  {path:"", component: PortfolioComponent}, //home
  {path:"inicia-sesion", component:IniciaSesionComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
