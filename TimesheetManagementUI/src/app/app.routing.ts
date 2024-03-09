import { ModuleWithProviders, NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";

const APP_ROUTER: Routes = [
  // { path: '', component: WeatherComponent, resolve: { weather: ResolveLocationService } }
  {path :""}
];

@NgModule({
  imports: [RouterModule.forRoot(APP_ROUTER)],
  exports: [RouterModule],
})
export class AppRouting {}

// export const appRouting: ModuleWithProviders = RouterModule.forRoot(APP_ROUTER);
