import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DecorationSectionComponent } from './decoration-section.component';

describe('DecorationSectionComponent', () => {
  let component: DecorationSectionComponent;
  let fixture: ComponentFixture<DecorationSectionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DecorationSectionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DecorationSectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
