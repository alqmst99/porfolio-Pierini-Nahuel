import {  NgModule } from '@angular/core';
import { RouterModule,  Routes } from '@angular/router';
import { EditEducationComponent } from './components/education/edit-education.component';
import { NewEducationComponent } from './components/education/new-education.component';
import { EditExperienceComponent } from './components/experience/edit-experience.component';
import { ExperienceComponent } from './components/experience/experience.component';
import { NewExperienceComponent } from './components/experience/new-experience.component';
import { HomeComponent } from './components/home/home.component';
import { EditHysComponent } from './components/hys/edit-hys.component';
import { NewHysComponent } from './components/hys/new-hys.component';
import { LoginComponent } from './components/login/login.component';


const routes:Routes = [
  {path:'',component:HomeComponent},
  {path:'login',component:LoginComponent},
  {path:'newExperience', component:NewExperienceComponent},
  {path:'editExperience/:id', component:EditExperienceComponent},
  {path:'newEducation', component:NewEducationComponent},
  {path:'editEducation/:id', component:EditEducationComponent},
  {path:'newSkill', component:NewHysComponent},
  {path:'editSkill', component:EditHysComponent},
];

@NgModule({
   
   imports: [RouterModule.forRoot(routes) ],
    exports:[RouterModule]
  
})
export class AppRoutingModule { }
