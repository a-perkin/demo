import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})

export class AppService {

  constructor(private http: HttpClient) { }

  rootURL = '/api';

  getOrders() {
    return this.http.get(this.rootURL + '/orders');
  }
}
