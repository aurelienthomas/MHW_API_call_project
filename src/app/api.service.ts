import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export class ApiService {
  apiArmor: string = 'https://mhw-db.com/armor';
  apiWeapon: string = 'https://mhw-db.com/weapons';
  apiCharm: string = 'https://mhw-db.com/charms';
  apiDecoration: string = 'https://mhw-db.com/decorations';
  _baseUrl: string = 'localhost:9000';

  constructor(public http: HttpClient) {
    /*this.sendText("request").subscribe(res => {
      console.log(res);
    });*/
  }

  sendText(request: any) {
    console.log("Sending some stuff to the DSL")
    return this.http.post(this._baseUrl + '/sendRequest', request);

    /*public getArmor() {}
  
    public getWeapon() {}*/

    /*return this.httpClient.get<Armor[]>(this.apiArmor,
      { observe: 'response' }).pipe(tap(res => {
        this.retrieve_pagination_links(res); 
      }));*/

  }
}
