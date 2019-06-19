import * as tslib_1 from "tslib";
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
var ApiService = /** @class */ (function () {
    function ApiService(httpClient) {
        this.httpClient = httpClient;
        this.apiArmor = 'https://mhw-db.com/armor';
        this.apiWeapon = 'https://mhw-db.com/weapons';
        this.apiCharm = 'https://mhw-db.com/charms';
        this.apiDecoration = 'https://mhw-db.com/decorations';
    }
    ApiService.prototype.getArmor = function () { };
    ApiService = tslib_1.__decorate([
        Injectable({
            providedIn: 'root'
        }),
        tslib_1.__metadata("design:paramtypes", [HttpClient])
    ], ApiService);
    return ApiService;
}());
export { ApiService };
//# sourceMappingURL=api.service.js.map