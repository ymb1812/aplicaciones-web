import { Routes } from '@angular/router';
import { HomePageComponent } from './pages/home-page/home-page.component';
import { CounterPageComponent } from './pages/counter-page/counter-page.component';
import { StructuralDirectivesComponent } from './pages/structural-directives/structural-directives.component';
import { AttributeDirectivesPageComponent } from './pages/attribute-directives-page/attribute-directives-page.component';
import { DataBindingPageComponent } from './pages/data-binding-page/data-binding-page.component';

export const routes: Routes = [
    { path: 'home', component: HomePageComponent },
    {
        path: 'counter', component: CounterPageComponent
    },{
        path: 'structural-directives', component: StructuralDirectivesComponent
    },{
        path: 'attribute-directives-page', component: AttributeDirectivesPageComponent
    },{
        path: 'data-binding-page', component: DataBindingPageComponent
    },
    {
        path: '**', redirectTo: 'home', pathMatch: 'full'
    }

];
