import { Injectable } from '@angular/core';

import { Observable, of } from 'rxjs';

import { Armor } from './armor';
import { ARMORS } from './mock-armors';

@Injectable({
  providedIn: 'root',
})
export class ArmorService {

  constructor() { }

  getArmors(): Observable<Armor[]> {
    console.log(of(ARMORS))
    return of(ARMORS);
  }

  private extractData(res: Response) {
    let body = res.json();
    return body || {}
  }
}
