package tn.esprit.mayarmnariarctic3.entities;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idChambre ;
    private String nomChambre ;
    @Enumerated(EnumType.STRING)
    private typechambre typeC ;
    @ManyToOne(cascade = CascadeType.ALL)
    private bloc idbloc ;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<reservation> reservations ;
}
