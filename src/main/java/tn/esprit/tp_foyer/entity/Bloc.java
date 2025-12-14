package tn.esprit.tp_foyer.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;
import jakarta.persistence.*;

import lombok.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode

//@Table(name = "Bloc")

public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private long capaciteBloc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    private Set<Chambre> Chambre;
    @ManyToOne
    Foyer foyer;
}
