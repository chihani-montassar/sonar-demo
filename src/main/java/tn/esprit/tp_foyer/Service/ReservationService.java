package tn.esprit.tp_foyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entity.Etudiant;
import tn.esprit.tp_foyer.entity.Reservation;
import tn.esprit.tp_foyer.repository.IReservationRepository;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{
    IReservationRepository reservationRepository;

    @Override
    public void createReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    @Override
    public void updateReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(String id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public Reservation getReservation(String id) {
        return reservationRepository.findById(id).get();
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Set<Etudiant> getEtudiantsByReservationId(String idReservation) {
        Reservation reservation = getReservation(idReservation);
        return reservation.getEtudiants();
    }

    @Override
    public Set<Reservation> getReservationsByChambreId(long idChambre) {
        return reservationRepository.findByChambre_IdChambre(idChambre);
    }
}
