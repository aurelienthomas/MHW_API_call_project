//need to include all fields from JSON to prevent errors
export class Armor {
    id: number;
    name: string;
    asset: string;
    rarity: number;
    desc: string;
    type: string;

    constructor(armorObj: any) {
        console.log("Creating Armor object")
        if (armorObj) {
            this.id = armorObj.id;
            this.name = armorObj.name;
            this.asset = armorObj.assets["imageMale"];
            this.rarity = armorObj.rarity;
            this.desc = armorObj.desc;
            this.type = armorObj.type;
        }
    }
}