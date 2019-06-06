import { Component, OnInit } from '@angular/core';

import { Charm } from './charm';
import { CharmService } from './charm.service';

@Component({
  selector: 'app-charm-section',
  templateUrl: './charm-section.component.html',
  styleUrls: ['./charm-section.component.css']
})
export class CharmSectionComponent implements OnInit {
  charms: Charm[];

  constructor(private charmService: CharmService) { }

  ngOnInit() {
    this.getCharms();
  }

  getCharms(): void {
    this.charmService.getCharms()
      .subscribe(charms => this.charms = charms);
  }

}
