import { Component } from '@angular/core';
import { TimesheetManagementComponent } from './timesheet-management/timesheet-management.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    TimesheetManagementComponent

  ],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'Timesheet Management';
}
