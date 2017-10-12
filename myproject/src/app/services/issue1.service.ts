import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Rx';
//import {Observable} from 'rxjs/Observable';
import { issue1 } from "app/models/issue1";

@Injectable()
export class Issue1Service {
   constructor(private http: Http) {
   }

   getIssue(): Observable<issue1[]> {
      return this.http.get("http://localhost:8080/SpringBootElasticsearch/api/issue1/")
         .map((res: Response) => res.json())
         .catch((error: any) => Observable.throw(error.json().error || 'Server error'));

   }
}
