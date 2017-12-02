import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TabMovilidadComponent } from './tab-movilidad.component';

describe('TabMovilidadComponent', () => {
  let component: TabMovilidadComponent;
  let fixture: ComponentFixture<TabMovilidadComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TabMovilidadComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TabMovilidadComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
