import * as tslib_1 from "tslib";
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { ArmorSectionComponent } from './armor-section/armor-section.component';
import { CharmSectionComponent } from './charm-section/charm-section.component';
import { WeaponSectionComponent } from './weapon-section/weapon-section.component';
import { DecorationSectionComponent } from './decoration-section/decoration-section.component';
import { HomeSectionComponent } from './home-section/home-section.component';
var routes = [
    { path: 'armors', component: ArmorSectionComponent },
    { path: 'charms', component: CharmSectionComponent },
    { path: 'weapons', component: WeaponSectionComponent },
    { path: 'decorations', component: DecorationSectionComponent },
    { path: 'home', component: HomeSectionComponent },
    { path: '', redirectTo: '/home', pathMatch: 'full' }
];
var AppRoutingModule = /** @class */ (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = tslib_1.__decorate([
        NgModule({
            imports: [RouterModule.forRoot(routes)],
            exports: [RouterModule]
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());
export { AppRoutingModule };
//# sourceMappingURL=app-routing.module.js.map