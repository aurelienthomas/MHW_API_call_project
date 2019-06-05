import { Injectable } from '@angular/core';

import { Observable, of } from 'rxjs';

import { Weapon} from './weapon';
import { WEAPONS } from './mock-weapons';

@Injectable({
  providedIn: 'root',
})
export class WeaponService {

  constructor() { }

  getweapons(): Observable<Weapon[]> {
    console.log(of(WEAPONS))
    return of(WEAPONS);
  }

  private extractData(res: Response) {
    let body = res.json();
    return body || {}
  }
}
