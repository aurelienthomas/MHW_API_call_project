import { Component, OnInit } from '@angular/core';

import { Weapon } from './weapon';
import { WeaponService } from './weapon.service';

@Component({
  selector: 'app-weapon-section',
  templateUrl: './weapon-section.component.html',
  styleUrls: ['./weapon-section.component.css']
})
export class WeaponSectionComponent implements OnInit {
  weapons: Weapon[];

  constructor(private weaponService: WeaponService) { }

  ngOnInit() {
    this.getWeapons();
  }

  getWeapons(): void {
    this.weaponService.getweapons()
      .subscribe(weapons => this.weapons = weapons);
  }

}
