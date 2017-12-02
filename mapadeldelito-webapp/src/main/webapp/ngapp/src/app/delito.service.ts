import { Injectable } from '@angular/core';
import { Delito } from './model/delito';
import { HttpClient, HttpHeaders, HttpClientModule } from '@angular/common/http';
import {Observable} from 'rxjs/Rx';
import { catchError, map, tap } from 'rxjs/operators';
import { of } from 'rxjs/observable/of';

@Injectable()
export class DelitoService {

  public static serviceUrl: string = "http://localhost:8080/api";

  public delito: Delito;

  constructor(private http: HttpClient) {
    this.delito = new Delito();
  }

  /**
  * Handle Http operation that failed.
  * Let the app continue.
  * @param operation - name of the operation that failed
  * @param result - optional value to return as the observable result
  */
  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }

  getTiposDelito(): Observable<string[]> {
    return this.http.get<string[]>(DelitoService.serviceUrl + Delito.uri.tiposDelito)
    .pipe(
      catchError(this.handleError('getTiposDelito', []))
    );
  }

}
