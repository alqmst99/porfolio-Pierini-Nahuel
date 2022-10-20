import {  NgModule } from '@angular/core';
import { RouterModule,  Routes } from '@angular/router';
import { EditExperienceComponent } from './components/experience/edit-experience.component';
import { ExperienceComponent } from './components/experience/experience.component';
import { NewExperienceComponent } from './components/experience/new-experience.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';


const routes:Routes = [
  {path:'',component:HomeComponent},
  {path:'login',component:LoginComponent},
  {path:'newExperience', component:NewExperienceComponent},
  {path:'editExperience/:id', component:EditExperienceComponent}
];

@NgModule({
   
   imports: [RouterModule.forRoot(routes) ],
    exports:[RouterModule]
  
})
export class AppRoutingModule { }
