import { Component, OnInit } from '@angular/core';
import { persona } from 'src/app/models/persona.model';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {
  persona: persona = new persona("","","");
  constructor(public personaService: PersonaService) { }
// la informacion de persona se va a guardar en data //
  ngOnInit(): void {
    this.personaService.getPersona().subscribe(data => {this.persona = data})

  }

}
