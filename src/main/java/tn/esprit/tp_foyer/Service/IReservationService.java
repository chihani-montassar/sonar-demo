package tn.esprit.tp_foyer.Service;

import tn.esprit.tp_foyer.entity.Etudiant;
import tn.esprit.tp_foyer.entity.Reservation;

import java.util.List;
import java.util.Set;

public interface IReservationService {
    public void createReservation(Reservation reservation);
    public void updateReservation(Reservation reservation);
    public void deleteReservation(String id);
    public Reservation getReservation(String id);
    public List<Reservation> getAllReservations();

    public Set<Etudiant> getEtudiantsByReservationId(String idReservation);
    public Set<Reservation> getReservationsByChambreId(long idChambre);
}
