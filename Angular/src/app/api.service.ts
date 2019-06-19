import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  apiArmor = 'https://mhw-db.com/armor';
  apiWeapon = 'https://mhw-db.com/weapons';
  apiCharm = 'https://mhw-db.com/charms';
  apiDecoration = 'https://mhw-db.com/decorations';
  apiUrl = 'localhost:9000';

  constructor(private http: HttpClient) { }

  sendText(corp: string) {
    console.log('test');
    this.http.get(this.apiUrl + '/').subscribe(res => {
      console.log(res);
    });
  }
}
