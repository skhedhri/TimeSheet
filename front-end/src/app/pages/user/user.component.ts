import { Component, OnInit } from '@angular/core';
import {TimeSheetService} from "../../services/time-sheet.service";

@Component({
    selector: 'user-cmp',
    moduleId: module.id,
    templateUrl: 'user.component.html'
})

export class UserComponent implements OnInit{
  constructor(private timesheetService: TimeSheetService) {
  }
    ngOnInit(){
    }

  onSubmit(value) {
    this.timesheetService.saveTimeSheet(value).subscribe(data => {
      console.log(data);
    },
      error =>  {
      console.log(error);
      });
  }
}
