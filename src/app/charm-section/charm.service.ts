import { Injectable } from '@angular/core';

import { Observable, of } from 'rxjs';

import { Charm } from './charm';
import { CHARMS } from './mock-charms';

@Injectable({
  providedIn: 'root',
})
export class CharmService {

  constructor() { }

  getCharms(): Observable<Charm[]> {
    console.log(of(CHARMS))
    return of(CHARMS);
  }

  private extractData(res: Response) {
    let body = res.json();
    return body || {}
  }
}
