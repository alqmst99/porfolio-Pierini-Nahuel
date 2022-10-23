import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Person } from 'src/app/model/person';
import { PersonService } from 'src/app/service/person.service';

@Component({
  selector: 'app-edit-about',
  templateUrl: './edit-about.component.html',
  styleUrls: ['./edit-about.component.css']
})
export class EditAboutComponent implements OnInit {

  per : Person =null;
  constructor(private perService: PersonService, private activatedRouter: ActivatedRoute , private router: Router) { }

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.perService.detail(id).subscribe(data => { 
      this.per=data;
    },err =>{
      alert("error in the modification");
      this.router.navigate(['']);
    } )
  }
onEdit():void{
  const id = this.activatedRouter.snapshot.params['id'];
this.perService.update(id, this.per).subscribe(data => {
  this.router.navigate(['']);
}, err => {
  alert("error in the edition");
  this.router.navigate(['']);
})
}
uploadImg($event:any){
  
}

}
