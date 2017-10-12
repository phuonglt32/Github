import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { UserService } from "app/services/user.service";
import { Issue1Service } from "app/services/issue1.service";
import { NewAppComponent } from './new-app/new-app.component';


@NgModule({
  declarations: [
    AppComponent,
    NewAppComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [Issue1Service],
  bootstrap: [AppComponent]
})
export class AppModule { }
