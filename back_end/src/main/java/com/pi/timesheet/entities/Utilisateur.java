package com.pi.timesheet.entities;

import lombok.Data;

import java.util.Collection;

@Data
public class Utilisateur {
    private Long idUtilisateur;
    private String nom;
    private String prenom;
    private String login;
    private String mdp;
    private String titre;
    private Collection<TimeSheet> timeSheets;
    private Collection<Team> teams;


}
