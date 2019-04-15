//need to include all fields from JSON to prevent errors
var Armor = /** @class */ (function () {
    function Armor(armorObj) {
        if (armorObj) {
            this.id = armorObj.id;
            this.name = armorObj.name;
            this.asset = armorObj.asset;
            this.rarity = armorObj.rarity;
            this.desc = armorObj.desc;
        }
    }
    return Armor;
}());
export { Armor };
//# sourceMappingURL=armor.js.map