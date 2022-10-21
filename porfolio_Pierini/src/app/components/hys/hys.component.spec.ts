import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HYSComponent } from './hys.component';

describe('HYSComponent', () => {
  let component: HYSComponent;
  let fixture: ComponentFixture<HYSComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HYSComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HYSComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
