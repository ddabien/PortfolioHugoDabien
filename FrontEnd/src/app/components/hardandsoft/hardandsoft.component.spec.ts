import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HardandsoftComponent } from './hardandsoft.component';

describe('HardandsoftComponent', () => {
  let component: HardandsoftComponent;
  let fixture: ComponentFixture<HardandsoftComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HardandsoftComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HardandsoftComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
