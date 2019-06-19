import { Component, OnInit, Renderer2 } from '@angular/core';
import { ApiService } from '../api.service';



@Component({
  selector: 'app-home-section',
  templateUrl: './home-section.component.html',
  styleUrls: ['./home-section.component.css']
})
export class HomeSectionComponent implements OnInit {
  requete: string;
  constructor(public renderer: Renderer2, public apiService: ApiService) { }

  ngOnInit() {

  }

  submit() {
    this.apiService.sendText(this.requete);
  }


}


