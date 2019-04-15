import * as tslib_1 from "tslib";
import { Component } from '@angular/core';
import { ArmorService } from './armor.service';
var ArmorSectionComponent = /** @class */ (function () {
    function ArmorSectionComponent(armorService) {
        this.armorService = armorService;
    }
    ArmorSectionComponent.prototype.ngOnInit = function () {
        this.getArmors();
    };
    ArmorSectionComponent.prototype.getArmors = function () {
        var _this = this;
        this.armorService.getArmors()
            .subscribe(function (armors) { return _this.armors = armors; });
    };
    ArmorSectionComponent = tslib_1.__decorate([
        Component({
            selector: 'app-armor-section',
            templateUrl: './armor-section.component.html',
            styleUrls: ['./armor-section.component.css']
        }),
        tslib_1.__metadata("design:paramtypes", [ArmorService])
    ], ArmorSectionComponent);
    return ArmorSectionComponent;
}());
export { ArmorSectionComponent };
//# sourceMappingURL=armor-section.component.js.map