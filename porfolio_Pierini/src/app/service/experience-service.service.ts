import { Injectable } from '@angular/core';
import{HttpClient} from '@angular/common/http';
import { Experience } from '../model/experience';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ExperienceServiceService {
expURL='http://localhosot:8080/experience'

 
 constructor(private httpClient:HttpClient) { }
  public lista(): Observable <Experience[]>{
    return this.httpClient.get<Experience[]>(this.expURL + 'list')

  }
  public detail(id:number):Observable<Experience>{
    return this.httpClient.get<Experience>(this.expURL + `detail/${id}`);
  }
  public save(exp:Experience): Observable<any>{
return this.httpClient.post<any>(this.expURL + 'create', exp);
  }
  public update(id:number, exp:Experience):Observable<any>{ 
    return this.httpClient.put<any>(this.expURL + `update/${id}`, exp);
  }
  public delete (id:number):Observable<any>{
    return this.httpClient.delete<any>(this.expURL+`delete/${id}`);
  }
 
}