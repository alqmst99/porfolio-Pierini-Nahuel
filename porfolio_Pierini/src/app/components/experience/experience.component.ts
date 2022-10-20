import { Component, OnInit } from '@angular/core';
import { Experience } from 'src/app/model/experience';
import { ExperienceService } from 'src/app/service/experience.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-experience',
  templateUrl: './experience.component.html',
  styleUrls: ['./experience.component.css']
})
export class ExperienceComponent implements OnInit {

exp : Experience[]= [];

  constructor(private expService : ExperienceService, private tokenService: TokenService) { }
 
  isLogged =false;
  ngOnInit(): void {
    if(this.tokenService.getToken()){
      this.isLogged=true;
    } else{
      this.isLogged=false;
      }
    }
chargeExp():void{
  this.expService.list().subscribe(data => { this.exp =data;})
  }
 delete(id? : number ){
  if(id != undefined){
  this.expService.delete(id).subscribe(
    data => {
      this.chargeExp();
  }, err =>{
    alert("can't delete experience");
  }
  )}
 }
}
