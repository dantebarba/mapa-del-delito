import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TabTipoDenunciaComponent } from './tab-tipo-denuncia.component';

describe('TabTipoDenunciaComponent', () => {
  let component: TabTipoDenunciaComponent;
  let fixture: ComponentFixture<TabTipoDenunciaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TabTipoDenunciaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TabTipoDenunciaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
