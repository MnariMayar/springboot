package tn.esprit.mayarmnariarctic3.entities;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idBloc ;
    private String nomBloc ;
    private long capaciteBloc ;
    @ManyToOne
    private foyer idfoyer;
    @OneToMany(mappedBy = "idbloc")
    private Set<chambre> chambres;
}
