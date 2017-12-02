import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { UIRouterConfigFn } from "./app.router";
import { UIRouterModule } from "@uirouter/angular";
import { appStates }  from "./app.states";

import { DelitoService } from "./delito.service";

import { AppComponent } from './app.component';
import { MenuPrincipalComponent } from './menu-principal/menu-principal.component';
import { TabDenunciaComponent } from './tab-denuncia/tab-denuncia.component';
import { TabTipoDenunciaComponent } from './tab-tipo-denuncia/tab-tipo-denuncia.component';
import { TabLocalizacionDenunciaComponent } from './tab-localizacion-denuncia/tab-localizacion-denuncia.component';
import { TabMovilidadComponent } from './tab-movilidad/tab-movilidad.component';
import { AppStartComponent } from './app-start/app-start.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    MenuPrincipalComponent,
    TabDenunciaComponent,
    TabTipoDenunciaComponent,
    TabLocalizacionDenunciaComponent,
    TabMovilidadComponent,
    AppStartComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    UIRouterModule.forRoot({
      states: appStates,
      useHash: true,
      config: UIRouterConfigFn
    })
  ],
  providers: [DelitoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
