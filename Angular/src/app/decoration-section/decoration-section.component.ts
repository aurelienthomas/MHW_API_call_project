import { Component, OnInit } from '@angular/core';

import { Decoration } from './decoration';
import { DecorationService } from './decoration.service';

@Component({
  selector: 'app-decorator-section',
  templateUrl: './decoration-section.component.html',
  styleUrls: ['./decoration-section.component.css']
})
export class DecorationSectionComponent implements OnInit {
  decorators: Decoration[];

  constructor(private decoratorService: DecorationService) { }

  ngOnInit() {
    this.getDecorations();
  }

  getDecorations(): void {
    this.decoratorService.getDecorations()
      .subscribe(decorators => this.decorators = decorators);
  }

}
