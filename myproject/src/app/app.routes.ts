import {Routes,RouterModule} from '@angular/router';
import {NewAppComponent} from 'app/new-app/new-app.component';
import {IssueComponent} from 'app/issue/issue.component';

const routing: Routes = [
  {path: '', component : NewAppComponent },
  {path: 'issue', component: IssueComponent}
]
export const appRoutes = RouterModule.forRoot(routing);

