import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class TimeSheetService {
  private host = "localhost:8081"
  private hostprojet = "localhost:8082"
  private hostutilisateur = "localhost:8083"
  constructor(private http: HttpClient) { }

  saveTimeSheet(data: any) {
    return this.http.post(this.host + '/timeSheet/saveTimeSheet',data);
  }
  timeSheets () {
    return this.http.get(this.host + '/timesheet/timesheets');
  }
  updateTimeSheet (id , data) {
    return this.http.put(this.host + '/timesheet/timesheets/'+id , data);
  }
  deleteTimeSheet (id) {
    return this.http.delete(this.host + '/timesheet/timesheets/'+id);
  }
  getProjets() {
    return this.http.get(this.hostprojet + '/projets');
  }
  getUtilisateurs() {
    return this.http.get(this.hostutilisateur + '/utilisateurs');
  }
}
