import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { AppComponent } from "./app.component";
import { TimesheetManagementComponent } from "./timesheet-management/timesheet-management.component";
import {MatIconModule} from '@angular/material/icon';
import {MatFormFieldModule} from '@angular/material/form-field';


@NgModule({
  declarations: [
    AppComponent,
    TimesheetManagementComponent
  ],
  imports: [FormsModule,
    MatIconModule,
    MatFormFieldModule],
  exports: [FormsModule,
    MatIconModule,

    MatFormFieldModule],
  providers: [
    // ForecastService,
    // WeatherIconsService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
