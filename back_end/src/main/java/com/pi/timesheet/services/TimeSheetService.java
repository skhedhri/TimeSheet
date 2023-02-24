package com.pi.timesheet.services;

import com.pi.timesheet.entities.TimeSheet;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TimeSheetService {
    public TimeSheet saveTimeSheet(TimeSheet timeSheet);
    public TimeSheet updateTimeSheet(Long id , TimeSheet timeSheet);
    public void deleteTimeSheet(Long id);
    public List<TimeSheet> timeSheets();
}
