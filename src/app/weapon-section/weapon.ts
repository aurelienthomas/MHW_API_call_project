export class Weapon {
    id: number;
    name: string;
    desc: string;
    type: string;

    constructor(weaponObj: any) {
        console.log("Creating Weapon object")
        if (weaponObj) {
            this.id = weaponObj.id;
            this.name = weaponObj.name;
            this.desc = weaponObj.desc;
            this.type = weaponObj.type;
        }
    }
}