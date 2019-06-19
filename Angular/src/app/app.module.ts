import { ApiService } from './api.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponentComponent } from './header-component/header-component.component';
import { ArmorSectionComponent } from './armor-section/armor-section.component';
import { WeaponSectionComponent } from './weapon-section/weapon-section.component';
import { CharmSectionComponent } from './charm-section/charm-section.component';
import { DecorationSectionComponent } from './decoration-section/decoration-section.component';
import { HomeSectionComponent } from './home-section/home-section.component';
import { ArmorComponent } from './armor/armor.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponentComponent,
    ArmorSectionComponent,
    WeaponSectionComponent,
    CharmSectionComponent,
    DecorationSectionComponent,
    HomeSectionComponent,
    ArmorComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,

    FormsModule,
  ],
  providers: [ApiService],
  bootstrap: [AppComponent]
})
export class AppModule { }
