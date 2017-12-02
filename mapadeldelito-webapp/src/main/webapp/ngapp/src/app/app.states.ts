import { AppStartComponent }  from './app-start/app-start.component';
import { TabTipoDenunciaComponent }      from './tab-tipo-denuncia/tab-tipo-denuncia.component';
import { TabLocalizacionDenunciaComponent }   from './tab-localizacion-denuncia/tab-localizacion-denuncia.component';
import { TabMovilidadComponent }    from './tab-movilidad/tab-movilidad.component';
import { TabDenunciaComponent } from './tab-denuncia/tab-denuncia.component';

export const appStates = [
    { name: 'app-start', url: '/',  component: AppStartComponent },
    // 1st State
    { name: 'tab-tipo-denuncia', url: '/tipo-denuncia',  component: TabTipoDenunciaComponent },
    // 2nd State
    { name: 'tab-localizacion-denuncia', url: '/localizacion',  component: TabLocalizacionDenunciaComponent },
    // 3rd State
    { name: 'tab-movilidad', url: '/movilidad',  component: TabMovilidadComponent },
    // 4th State
    { name: 'tab-denuncia', url: '/denuncia',  component: TabDenunciaComponent }
];
