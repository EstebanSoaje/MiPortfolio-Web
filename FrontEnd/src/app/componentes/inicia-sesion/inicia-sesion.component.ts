import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-inicia-sesion',
  templateUrl: './inicia-sesion.component.html',
  styleUrls: ['./inicia-sesion.component.css']
})

export class IniciaSesionComponent implements OnInit {
  form:FormGroup;
  constructor(private formBuilder:FormBuilder) {
    this.form=this.formBuilder.group(
      {

      }
    )
   }



  ngOnInit(): void {
  }

}
