package tn.esprit.mayarmnariarctic3.entities;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idfoyer ;
    private String nomFoyer ;
    private long capaciteFoyer ;
    @OneToOne(mappedBy = "idfoyer")
    private Universite iduniversite ;

    @OneToMany(mappedBy = "idfoyer")
    private Set<bloc> blocs ;
}
