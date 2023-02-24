package com.pi.timesheet.dao;

import com.pi.timesheet.entities.TimeSheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TimeSheetDao  extends JpaRepository<TimeSheet , Long> {

    public TimeSheet getTimeSheetByIdTimesheet(Long id);
}
