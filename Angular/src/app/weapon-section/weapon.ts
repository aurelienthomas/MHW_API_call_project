export class Weapon {
    id: number;
    name: string;
    type: string;
    attributes:any;
    rarity:number;
    attack:any;
    durability:any;
    slots:any;
    elements:any;
    crafting:any;
    assets:any;

    constructor(weaponObj: any) {
        console.log("Creating Weapon object")
        if (weaponObj) {
            this.id = weaponObj.id;
            this.name = weaponObj.name;
            this.type = weaponObj.type;
            this.rarity = weaponObj.rarity;
        }
    }
}