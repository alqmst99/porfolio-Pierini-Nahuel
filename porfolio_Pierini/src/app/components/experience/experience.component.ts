import { Component, OnInit } from '@angular/core';
import { ExperienceServiceService } from 'src/app/service/experience-service.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-experience',
  templateUrl: './experience.component.html',
  styleUrls: ['./experience.component.css']
})
export class ExperienceComponent implements OnInit {
exp: ExperienceComponent[]=[];

  constructor(expService: ExperienceServiceService, private tokenService: TokenService) { }
 
  isLogged =false;
  ngOnInit(): void {
    if(this.tokenService.getToken()){
      this.isLogged=true;
    } else{
      this.isLogged=false;
      }
    }
chargeExp():void{
    this.expService.list().subscribe(data =>{this.exp=data} )
  }

}
