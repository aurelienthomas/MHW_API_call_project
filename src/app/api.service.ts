import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  apiArmor: string = 'https://mhw-db.com/armor';
  apiWeapon: string = 'https://mhw-db.com/weapons';
  apiCharm: string = 'https://mhw-db.com/charms';
  apiDecoration: string = 'https://mhw-db.com/decorations';

  constructor(private httpClient: HttpClient) {}
}