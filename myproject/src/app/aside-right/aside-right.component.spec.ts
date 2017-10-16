/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { AsideRightComponent } from './aside-right.component';

describe('AsideRightComponent', () => {
  let component: AsideRightComponent;
  let fixture: ComponentFixture<AsideRightComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AsideRightComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AsideRightComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
