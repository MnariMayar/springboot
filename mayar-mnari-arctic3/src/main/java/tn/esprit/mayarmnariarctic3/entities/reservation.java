package tn.esprit.mayarmnariarctic3.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservation ;
    private Date anneeuniversitaire;
    private Boolean estValide;
    @ManyToMany
    private Set<etudiant> etudiants ;
}
