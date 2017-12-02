import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TabLocalizacionDenunciaComponent } from './tab-localizacion-denuncia.component';

describe('TabLocalizacionDenunciaComponent', () => {
  let component: TabLocalizacionDenunciaComponent;
  let fixture: ComponentFixture<TabLocalizacionDenunciaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TabLocalizacionDenunciaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TabLocalizacionDenunciaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
