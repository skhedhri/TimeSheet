package com.pi.timesheet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class TimeSheet implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTimesheet;
    private int nbHeure;
    private Long FK_Project;
    private Long FK_utilisateur;
    @Transient
    private Projet projet;
    @Transient
    private Utilisateur utilisateur;
}
