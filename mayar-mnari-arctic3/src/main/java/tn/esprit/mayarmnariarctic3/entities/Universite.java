package tn.esprit.mayarmnariarctic3.entities;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite  ;
    private String nomUniversite ;
    private String adresse ;
    @OneToOne
    private foyer idfoyer ;

}
