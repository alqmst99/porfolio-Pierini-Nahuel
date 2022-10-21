import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Experience } from 'src/app/model/experience';
import { Hys } from 'src/app/model/hys';
import { ExperienceService } from 'src/app/service/experience.service';

@Component({
  selector: 'app-edit-experience',
  templateUrl: './edit-experience.component.html',
  styleUrls: ['./edit-experience.component.css']
})
export class EditExperienceComponent implements OnInit {
exp : Experience;
  constructor(private expService: ExperienceService, private activatedRouter: ActivatedRoute , private router: Router) { }

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.expService.detail(id).subscribe(data => { 
      this.exp=data;
    },err =>{
      alert("error in the modifaication");
      this.router.navigate(['']);
    } )
  }
onEdit():void{
  const id = this.activatedRouter.snapshot.params['id'];
this.expService.update(id, this.exp).subscribe(data => {
  this.router.navigate(['']);
}, err => {
  alert("error in the modifaication");
  this.router.navigate(['']);
})
}
}
