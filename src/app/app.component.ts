import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SpinnerComponent } from './theme/shared/components/spinner/spinner.component';

import { CommonModule } from '@angular/common'; // Import pour *ngFor

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
  imports: [RouterOutlet, SpinnerComponent, CommonModule], // Ajoutez MatIconModule et CommonModule
})
export class AppComponent {
  title = 'Berry Angular Free Version';
}