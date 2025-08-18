import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  imports: [CommonModule],
  templateUrl: './login.html',
  styleUrl: './login.css'
})
export class Login {
  isLoginActive: boolean = true;

  showRegister() {
    this.isLoginActive = false;
  }

  showLogin() {
    this.isLoginActive = true;
  }

}
