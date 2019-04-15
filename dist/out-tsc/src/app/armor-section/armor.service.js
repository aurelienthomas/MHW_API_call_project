import * as tslib_1 from "tslib";
import { Injectable } from '@angular/core';
import { of } from 'rxjs';
import { ARMORS } from './mock-armors';
var ArmorService = /** @class */ (function () {
    function ArmorService() {
    }
    ArmorService.prototype.getArmors = function () {
        console.log(of(ARMORS));
        return of(ARMORS);
    };
    ArmorService.prototype.extractData = function (res) {
        var body = res.json();
        return body || {};
    };
    ArmorService = tslib_1.__decorate([
        Injectable({
            providedIn: 'root',
        }),
        tslib_1.__metadata("design:paramtypes", [])
    ], ArmorService);
    return ArmorService;
}());
export { ArmorService };
//# sourceMappingURL=armor.service.js.map