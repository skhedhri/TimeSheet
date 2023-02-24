package com.pi.timesheet.entities;

import lombok.Data;

import java.sql.Time;
import java.util.Collection;
import java.util.Date;

@Data
public class Projet {
    private Long idP;
    private String nomP;
    //private Category category;
    private String descriptionP;
    private Date dateDebut;
    private Date dateFin;
    private double budget;
    private Collection<TimeSheet> timeSheets;
    private Collection<Team> teams;


}
