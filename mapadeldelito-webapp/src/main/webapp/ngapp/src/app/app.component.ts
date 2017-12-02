import { Component, OnInit } from '@angular/core';
import { UIROUTER_DIRECTIVES }  from "@uirouter/angular";


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent  implements OnInit {
  title = 'Mapa del delito';

  ngOnInit() {
    console.log("working");
  }

}
