import { Component, OnInit } from '@angular/core';
import { Hys } from 'src/app/model/hys.model';
import { HysService } from 'src/app/service/hys.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-hys',
  templateUrl: './hys.component.html',
  styleUrls: ['./hys.component.css']
})
export class HYSComponent implements OnInit {

  skill : Hys[]= [];

  constructor(private hysService : HysService, private tokenService: TokenService) { }
 
  isLogged =false;
  ngOnInit(): void {
    this.chargeSkill();
    if(this.tokenService.getToken()){
      this.isLogged=true;
    } else{
      this.isLogged=false;
      }
    }
chargeSkill():void{
  this.hysService.list().subscribe(data => { this.skill = data;})
  }
 delete(id? : number ){
  if(id != undefined){
  this.hysService.delete(id).subscribe(
    data => {
      this.chargeSkill();
  }, err =>{
    alert("can't delete education");
  }
  )}
 }
}
