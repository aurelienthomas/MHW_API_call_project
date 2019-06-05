export class Armor {
    id: number;
    name: string;
    assets: any;
    rarity: number;
    rank: string;
    type: string;
    resistances?: any;
    attributes?:any;
    slots?:any;
    skills?:any;
    crafting?:any;
    armorSet?:any;
    defense?:any;

    constructor(armorObj: any) {
        console.log("Creating Weapon object")
        if (armorObj) {
            this.id = armorObj.id;
            this.name = armorObj.name;
            this.type = armorObj.type;
            this.rarity = armorObj.rarity;
        }
    }
}