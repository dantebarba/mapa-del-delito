import { Component, OnInit } from '@angular/core';
import { DelitoService } from '../delito.service';

declare var Materialize: any;

@Component({
  selector: 'app-tab-tipo-denuncia',
  templateUrl: './tab-tipo-denuncia.component.html',
  styleUrls: ['./tab-tipo-denuncia.component.css']
})
export class TabTipoDenunciaComponent implements OnInit {

  tipoDelito: any = [];

  modalidades: any = [];

  modalidadSeleccionada = null;

  tipoSeleccionado = null;

  constructor(private delitoService: DelitoService) {

  }

  ngOnInit() {
    this.getTiposDelitoModalidades();
  }

  public seleccionarTipo(tipo) {
    Materialize.toast(tipo, 2000);
    this.tipoSeleccionado = tipo
    this.modalidades = this.tipoDelito[tipo];
  }

  public getTiposDelitoModalidades() {
    this.delitoService.getTiposDelito().subscribe(( tiposDelito ) => { this.tipoDelito = tiposDelito });
  }

  public getTiposDelito() {
    return Object.keys(this.tipoDelito);
  }

  public seleccionarModalidad(modalidad) {
    this.modalidadSeleccionada = modalidad;
  }


}
