package com.pi.timesheet.services;

import com.pi.timesheet.dao.TimeSheetDao;
import com.pi.timesheet.entities.TimeSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TimeSheetImpl implements TimeSheetService{

    @Autowired
    private TimeSheetDao timeSheetDao;
    @Override
    public TimeSheet saveTimeSheet(TimeSheet timeSheet) {
        return timeSheetDao.save(timeSheet);
    }

    @Override
    public TimeSheet updateTimeSheet(Long id, TimeSheet timeSheet) {
       timeSheet.setIdTimesheet(id);
       return timeSheetDao.save(timeSheet);
    }

    @Override
    public void deleteTimeSheet(Long id) {
        timeSheetDao.deleteById(id);
    }

    @Override
    public List<TimeSheet> timeSheets() {
        return timeSheetDao.findAll();
    }
}
