import { Injectable } from '@angular/core';

import { Observable, of } from 'rxjs';

import { Decoration } from './decoration';
import { DECORATORS } from './mock-decorators';

@Injectable({
  providedIn: 'root',
})
export class DecorationService {

  constructor() { }

  getDecorations(): Observable<Decoration[]> {
    console.log(of(DECORATORS))
    return of(DECORATORS);
  }

  private extractData(res: Response) {
    let body = res.json();
    return body || {}
  }
}
