import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WeaponSectionComponent } from './weapon-section.component';

describe('WeaponSectionComponent', () => {
  let component: WeaponSectionComponent;
  let fixture: ComponentFixture<WeaponSectionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WeaponSectionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WeaponSectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
