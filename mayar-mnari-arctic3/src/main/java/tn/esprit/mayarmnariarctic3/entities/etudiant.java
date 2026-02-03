package tn.esprit.mayarmnariarctic3.entities;
import java.util.*;
import java.util.Date;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant ;
    private String nomEtudiant ;
    private String prenomEtudiant ;
    private int cin ;
    private String ecole ;
    private Date dateNaissance ;
    @ManyToMany(mappedBy = "etudiants")
    private Set<reservation> reservations ;
}
