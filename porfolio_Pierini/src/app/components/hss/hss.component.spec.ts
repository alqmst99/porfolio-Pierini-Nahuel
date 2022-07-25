import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HSSComponent } from './hss.component';

describe('HSSComponent', () => {
  let component: HSSComponent;
  let fixture: ComponentFixture<HSSComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HSSComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HSSComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
