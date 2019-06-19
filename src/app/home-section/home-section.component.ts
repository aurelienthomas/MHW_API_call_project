import { Component, OnInit, Renderer2 } from '@angular/core';
import { ApiService} from '../api.service';



@Component({
  selector: 'app-home-section',
  templateUrl: './home-section.component.html',
  styleUrls: ['./home-section.component.css']
})
export class HomeSectionComponent implements OnInit {
  request:String;
  constructor(public renderer: Renderer2) 
  { }

  ngOnInit() {

  }

  submit(){
    console.log(this.request);
    //let text = this.renderer.selectRootElement("#request").text();
    //this.apiService.sendText(text);
  }

  
}


