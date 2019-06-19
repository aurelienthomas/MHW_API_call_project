import { Component, OnInit } from '@angular/core';

import { Armor } from './armor';
import { ArmorService } from './armor.service';

@Component({
  selector: 'app-armor-section',
  templateUrl: './armor-section.component.html',
  styleUrls: ['./armor-section.component.css']
})
export class ArmorSectionComponent implements OnInit {
  armors: Armor[];

  constructor(private armorService: ArmorService) { }

  ngOnInit() {
    this.getArmors();
  }

  getArmors(): void {
    this.armorService.getArmors()
      .subscribe(armors => this.armors = armors);
  }

}
