import {Component, Input, OnInit} from '@angular/core';
import { ToastrService } from "ngx-toastr";
import {TimeSheetService} from "../../services/time-sheet.service";


@Component({
    selector: 'notifications-cmp',
    moduleId: module.id,
    templateUrl: 'notifications.component.html'
})

export class NotificationsComponent implements OnInit{
  @Input() public tc;
  constructor(private toastr: ToastrService, private timeSheetService: TimeSheetService) {}

  ngOnInit(): void {
    console.log(this.tc);
  }
  onSubmit(value) {
    this.timeSheetService.updateTimeSheet(value.idTimesheet , value).subscribe(data => {
      console.log(data);
    });
  }
}
