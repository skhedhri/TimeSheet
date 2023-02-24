package com.pi.timesheet.entities;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class Team {
    private Long idP;
    private Long idUtilisateur;
    @Enumerated(EnumType.STRING)
    private Role roles;
    private Projet projet ;
    private Utilisateur utilisateur ;

}
