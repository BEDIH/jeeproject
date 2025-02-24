import { Component } from '@angular/core';
import { Router, RouterModule } from '@angular/router'; // Importez RouterModule ici
import { FormsModule } from '@angular/forms'; // Importez FormsModule pour ngModel

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [FormsModule, RouterModule], // Ajoutez RouterModule ici
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export default class RegisterComponent {
  
}