import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CharmSectionComponent } from './charm-section.component';

describe('CharmSectionComponent', () => {
  let component: CharmSectionComponent;
  let fixture: ComponentFixture<CharmSectionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CharmSectionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CharmSectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
