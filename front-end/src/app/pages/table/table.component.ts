import { Component, OnInit } from '@angular/core';
import {TimeSheetService} from "../../services/time-sheet.service";
import {NgbModal} from "@ng-bootstrap/ng-bootstrap";
import {NotificationsComponent} from "../notifications/notifications.component";
import {UserComponent} from "../user/user.component";

declare interface TableData {
    headerRow: string[];
    dataRows: string[][];
}

@Component({
    selector: 'table-cmp',
    moduleId: module.id,
    templateUrl: 'table.component.html'
})

export class TableComponent implements OnInit{
  timeSheets: any ;

  constructor(private timeSheetService: TimeSheetService,
              private modalService: NgbModal) {
  }
    ngOnInit(){
    this.getTimeSheets();
    }

   getTimeSheets() {
    this.timeSheetService.timeSheets().subscribe(data => {
      this.timeSheets = data;
    },
      error => {
      console.log(error);
      })
  }

  edit(tc) {
    const modalRef = this.modalService.open(NotificationsComponent);
    modalRef.componentInstance.tc = tc;
   // this.modalService.open(NotificationsComponent);
  }
  delete(tc) {
    this.timeSheetService.deleteTimeSheet(tc.idTimesheet).subscribe(data => {
      console.log("deleted");
      this.getTimeSheets();
    })
  }
}
