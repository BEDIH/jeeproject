import { Component } from '@angular/core';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-element-color',
  templateUrl: './element-color.component.html',
  styleUrls: ['./element-color.component.scss']
})
export class ElementColorComponent {
  medicaments: any[];

  constructor(private dataService: DataService) {
    this.medicaments = this.dataService.medicaments;
  }
}