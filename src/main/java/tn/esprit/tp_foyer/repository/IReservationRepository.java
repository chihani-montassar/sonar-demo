package tn.esprit.tp_foyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp_foyer.entity.Reservation;

import java.util.Set;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation,String> {
    Set<Reservation> findByChambre_IdChambre(long idChambre);
}
