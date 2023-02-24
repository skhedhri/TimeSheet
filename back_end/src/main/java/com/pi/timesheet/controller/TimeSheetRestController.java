package com.pi.timesheet.controller;

import com.pi.timesheet.dao.TimeSheetDao;
import com.pi.timesheet.entities.TimeSheet;
import com.pi.timesheet.services.TimeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TimeSheetRestController {

    @Autowired
    private TimeSheetService timeSheetService;
    @Autowired
    private TimeSheetDao timeSheetDao;
    @RequestMapping(value = "/timeSheet/saveTimeSheet",method = RequestMethod.POST)
    public TimeSheet saveTimeSheet(@RequestBody TimeSheet timeSheet){
        return timeSheetService.saveTimeSheet(timeSheet);

    }
    @RequestMapping(value = "/timesheet/timesheets", method = RequestMethod.GET)
    public List<TimeSheet> timeSheets() {
        return timeSheetService.timeSheets();
    }
    @RequestMapping(value = "/timesheet/timesheets/{id}",method = RequestMethod.PUT)
    public TimeSheet updateTimeSheet(@PathVariable(name = "id") Long id, @RequestBody TimeSheet timeSheet){
        return timeSheetService.updateTimeSheet(id, timeSheet);
    }
    @RequestMapping(value = "/timesheet/timesheets/{id}",method = RequestMethod.DELETE)
    public void deleteTimeSheet(@PathVariable(name = "id") Long id){
        timeSheetService.deleteTimeSheet(id);
    }
    @RequestMapping(value = "/timesheet/timesheets/{id}",method = RequestMethod.GET)
    public TimeSheet timeSheet(@PathVariable(name = "id") Long id){
        return timeSheetDao.getTimeSheetByIdTimesheet(id);
    }
}
