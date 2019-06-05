export class Armor {
    id: number;
    name: string;
    assets: any;
    rarity: number;
    rank: string;
    type: string;
    resistances: any;
    attributes:any;
    slots:any;
    skills:any;
    crafting:any;
    armorSet:any;

    constructor(armorObj: any) {
        console.log("Creating Armor object")
        if (armorObj) {
            this.id = armorObj.id;
            this.name = armorObj.name;
            this.assets = armorObj.assets["imageMale"];
            this.rarity = armorObj.rarity;
            this.rank = armorObj.rank;
            this.type = armorObj.type;
        }
    }
}