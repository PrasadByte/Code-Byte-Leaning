import { Routes } from '@angular/router';
import { Home } from './component/home/home';
import { HeaderComponent } from './component/header/header';
import { Login } from './component/login/login';

export const routes: Routes = [
    {
        path: 'home',component:Home
    },
    {
        path: '',
        component: HeaderComponent
    },
    {path:'login', component:Login}
  
];
