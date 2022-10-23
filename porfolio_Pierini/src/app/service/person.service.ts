import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Person } from '../model/person';

@Injectable({
  providedIn: 'root'
})
export class PersonService {
URL = 'http://localhost:8080/person/'
  
  constructor(private httpClient : HttpClient) {}
  
  public list(): Observable <Person[]>{
    return this.httpClient.get<Person[]>(this.URL + 'list')

  }
  public detail(id:number):Observable<Person>{
    return this.httpClient.get<Person>(this.URL + `detail/${id}`);
  }
 /* public save(edu:Person): Observable<any>{
return this.httpClient.post<any>(this.URL + 'create', edu);
  }*/
  public update(id:number, edu :Person):Observable<any>{ 
    return this.httpClient.put<any>(this.URL + `update/${id}`, edu);
  }
  /*public delete (id:number):Observable<any>{
    return this.httpClient.delete<any>(this.URL+`delete/${id}`);
  }*/
}
