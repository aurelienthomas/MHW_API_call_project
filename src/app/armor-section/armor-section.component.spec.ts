import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ArmorSectionComponent } from './armor-section.component';

describe('ArmorSectionComponent', () => {
  let component: ArmorSectionComponent;
  let fixture: ComponentFixture<ArmorSectionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ArmorSectionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ArmorSectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
