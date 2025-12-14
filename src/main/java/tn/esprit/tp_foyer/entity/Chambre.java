package tn.esprit.tp_foyer.entity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
//@Table(name = "Chambre")

public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idChambre;
    private long numChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;
    @ManyToOne
    @JoinColumn(name = "idBloc")
    private Bloc bloc;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chambre")
    private Set<Reservation> Reservations;
}
