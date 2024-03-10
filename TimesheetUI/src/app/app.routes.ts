import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TimesheetManagementComponent } from './timesheet-management/timesheet-management.component';

export const routes: Routes = [
 { path: 'time', component : TimesheetManagementComponent}
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
