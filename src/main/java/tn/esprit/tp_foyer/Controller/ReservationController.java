package tn.esprit.tp_foyer.Controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_foyer.Service.IReservationService;
import tn.esprit.tp_foyer.entity.Etudiant;
import tn.esprit.tp_foyer.entity.Reservation;

import java.util.List;
import java.util.Set;

@Tag(name = "Gestion des reservations")
@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {
    IReservationService reservationService;

    @Operation(description = "Ajouter les reservations de la base de données",summary = "Ajouter les reservations")
    @PostMapping("/add")
    public void createReservation(@RequestBody Reservation reservation) {
        reservationService.createReservation(reservation);
    }

    @Operation(description = "Modifier les reservations dans la base de données",summary = "Modifier les reservations")
    @PutMapping("/update")
    public void updateReservation(@RequestBody Reservation reservation) {
        reservationService.updateReservation(reservation);
    }

    @Operation(description = "Supprimer les reservations de la base de données par id",summary = "Supprimer les reservations par id")
    @DeleteMapping("/delete/{id}")
    public void deleteReservation(@PathVariable String id) {
        reservationService.deleteReservation(id);
    }

    @Operation(description = "Récupérer les reservations de la base de données par id",summary = "Afficher les reservations par id")
    @GetMapping("/get/{id}")
    public Reservation getReservation(@PathVariable String id) {
        return reservationService.getReservation(id);
    }

    @Operation(description = "récupérer toutes les reservations de la base de données", summary = "Afficher tous les reservations")
    @GetMapping("/getAll")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @Operation(description = "Récupérer les étudiants par ID de réservation de la base de données",summary = "Récupérer les étudiants par ID de réservation")
    @GetMapping("/{idReservation}/etudiants")
    public Set<Etudiant> getEtudiantsByReservation(@PathVariable String idReservation) {
        return reservationService.getEtudiantsByReservationId(idReservation);
    }

    @Operation(description = "Récupérer les réservations par ID de chambre de la base de données",summary = "Récupérer les réservations par ID de chambre.")
    @GetMapping("/chambre/{idChambre}")
    public Set<Reservation> getReservationsByChambre(@PathVariable long idChambre) {
        return reservationService.getReservationsByChambreId(idChambre);
    }
}
