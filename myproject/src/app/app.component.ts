import { Component } from '@angular/core';
import { UserService } from "app/services/user.service";
import { Issue1Service } from "app/services/issue1.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'App works';
  users;
  issues;
  constructor(private issService: Issue1Service) {
      this.issues = issService.getIssue();
  }
}
