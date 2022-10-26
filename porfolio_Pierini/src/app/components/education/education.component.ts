import { Component, OnInit } from '@angular/core';
import { Education } from 'src/app/model/education.model';
import { EducationService } from 'src/app/service/education.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-education',
  templateUrl: './education.component.html',
  styleUrls: ['./education.component.css']
})
export class EducationComponent implements OnInit {

  edu : Education[]= [];

  constructor(private eduService : EducationService, private tokenService: TokenService) { }
 
  isLogged =false;
  ngOnInit(): void {
    this.chargeEdu();
    if(this.tokenService.getToken()){
      this.isLogged=true;
    } else{
      this.isLogged=false;
      }
    }
chargeEdu():void{
  this.eduService.list().subscribe(data =>{ this.edu =data;})
  }
 delete(id? : number ){
  if(id != undefined){
  this.eduService.delete(id).subscribe(
    data => {
      this.chargeEdu();
  }, err =>{
    alert("can't delete education");
  }
  )}
 }
}
