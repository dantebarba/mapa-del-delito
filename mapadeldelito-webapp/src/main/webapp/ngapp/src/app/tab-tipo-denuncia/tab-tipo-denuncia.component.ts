import { Component, OnInit } from '@angular/core';
import { DelitoService } from '../delito.service';

@Component({
  selector: 'app-tab-tipo-denuncia',
  templateUrl: './tab-tipo-denuncia.component.html',
  styleUrls: ['./tab-tipo-denuncia.component.css']
})
export class TabTipoDenunciaComponent implements OnInit {



  constructor(private delitoService: DelitoService) {
    this.tiposModalidades = [];

    this.tipoDelito = [];

    this.modalidades = [];

    this.modalidadSeleccionada = null;

    this.tipoSeleccionado = null;
  }

  ngOnInit() {
    this.getTiposDelitoModalidades();
  }

  public onTipoChange(tipo) {
      this.tipoSeleccionado = tipo
      this.modalidades = this.tipoDelito[this.tipoSeleccionado];
  }

  public getTiposDelitoModalidades() {
    this.delitoService.getTiposDelito().subscribe(( tiposDelito ) => { this.tiposModalidades = tiposDelito; this.tipoDelito = Object.keys(tiposDelito); });
  }

  public seleccionarModalidad(modalidad) {
    this.modalidadSeleccionada = modalidad;
  }

  onSubmit() { delitoService.delito.modalidadDelito = modalidad }


}
