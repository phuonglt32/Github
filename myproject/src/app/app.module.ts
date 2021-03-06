import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { UserService } from "app/services/user.service";
import { Issue1Service } from "app/services/issue1.service";
import { NewAppComponent } from './new-app/new-app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { AsideRightComponent } from './aside-right/aside-right.component';
import { IssueComponent } from './issue/issue.component';
import {appRoutes} from './app.routes';

@NgModule({
  declarations: [
    AppComponent,
    NewAppComponent,
    HeaderComponent,
    FooterComponent,
    AsideRightComponent,
    IssueComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    appRoutes
  ],
  providers: [Issue1Service],
  bootstrap: [AppComponent]
})
export class AppModule { }
