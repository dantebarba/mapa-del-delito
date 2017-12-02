import { LocalizacionEspacialTemporal} from "./localizacion-espacial-temporal";
import { ModalidadDelito } from "./modalidad-delito";


export class Delito {

  public static uri = {
    "tiposDelito" : "/tiposDelito",
    "delito" : "/"
  };

  public id;

  public fechaDenuncia: Date;

  public modalidadDelito: ModalidadDelito;

  public descripcion: string;

  public localizacion: LocalizacionEspacialTemporal;

  public cantidadDelincuentes: number;

//  public arma: Arma;

  public hechoConsumado: boolean = false;

  public hashMd5: string;


}
