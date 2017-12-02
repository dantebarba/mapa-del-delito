import { TestBed, inject } from '@angular/core/testing';

import { DelitoService } from './delito.service';

describe('DelitoServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [DelitoServiceService]
    });
  });

  it('should be created', inject([DelitoServiceService], (service: DelitoServiceService) => {
    expect(service).toBeTruthy();
  }));
});
