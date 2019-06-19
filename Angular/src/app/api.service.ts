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
  apiUrl = 'http://localhost:9000';

  constructor(private http: HttpClient) { }

  sendText(corp: string) {
    console.log('test');
    const reponseObservable = new Observable(observer => {
      // this.http.get(environment.api_url + this.API_SKILL_BY_FAMILY + family + "/" + this.authService.getUserId()).subscribe(
      this.http.get(this.apiUrl + '/').subscribe(res => {
        observer.next(res);
      },
        err => {
          console.log(err);
        }
      );
    });
    return reponseObservable;
  }
}
