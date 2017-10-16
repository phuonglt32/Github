import { Component, OnInit } from '@angular/core';
import { Issue1Service } from "app/services/issue1.service";

@Component({
  selector: 'app-issue',
  templateUrl: './issue.component.html',
  styleUrls: ['./issue.component.css']
})
export class IssueComponent implements OnInit {

  issues;
  constructor(private issService: Issue1Service) {
      this.issues = issService.getIssue();
  }

  ngOnInit() {
  }

}
