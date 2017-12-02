import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TabDenunciaComponent } from './tab-denuncia.component';

describe('TabDenunciaComponent', () => {
  let component: TabDenunciaComponent;
  let fixture: ComponentFixture<TabDenunciaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TabDenunciaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TabDenunciaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
