import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EncabezadoComponent } from './componentes/encabezado/encabezado.component';
import { AcercaDeComponent } from './componentes/acerca-de/acerca-de.component';
import { ExperienciaYEducacionComponent } from './componentes/experiencia-y-educacion/experiencia-y-educacion.component';
import { AptitudesComponent } from './componentes/aptitudes/aptitudes.component';
import { LogrosComponent } from './componentes/logros/logros.component';
import { HttpClientModule } from '@angular/common/http';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { FooterComponent } from './componentes/footer/footer.component';
import { IniciaSesionComponent } from './componentes/inicia-sesion/inicia-sesion.component';
import { PortfolioComponent } from './componentes/portfolio/portfolio.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { interceptorProvider } from './servicios/interceptor-service';


@NgModule({
  declarations: [
    AppComponent,
    EncabezadoComponent,
    AcercaDeComponent,
    ExperienciaYEducacionComponent,
    AptitudesComponent,
    LogrosComponent,
    FooterComponent,
    IniciaSesionComponent,
    PortfolioComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FontAwesomeModule,
    NgCircleProgressModule.forRoot({}),
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [
    interceptorProvider
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
