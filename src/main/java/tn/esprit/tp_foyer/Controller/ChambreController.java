package tn.esprit.tp_foyer.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_foyer.Service.ChambreService;
import tn.esprit.tp_foyer.entity.Bloc;
import tn.esprit.tp_foyer.entity.Chambre;

import java.util.List;

@Tag(name = "Gestion des Chambres")
@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreController {
    private ChambreService  chambreService;

    @Operation(description = "Ajouter les chambres de la base de données",summary = "Ajouter les chambres")
    @PostMapping("/add")
    public Chambre createChambre(@RequestBody Chambre chambre) {
        return chambreService.createChambre(chambre);
    }

    @Operation(description = "Modifier les chambres dans la base de données",summary = "Modifier les chambres")
    @PutMapping("/update")
    public void updateChambre(@RequestBody Chambre chambre) {
        chambreService.updateChambre(chambre);
    }

    @Operation(description = "Supprimer les chambres de la base de données par id",summary = "Supperimer les chambres par id")
    @DeleteMapping("/delete/{id}")
    public void deleteChambre(@PathVariable long id) {
        chambreService.deleteChambre(id);
    }

    @Operation(description = "récupérer toutes les bloc de la base de données par id",summary = "Afficher les chambres par id")
    @GetMapping("/get/{id}")
    public Chambre getChambre(@PathVariable long id) {
        return chambreService.getChambre(id);
    }

    @Operation(description = "récupérer toutes les chambres de la base de données", summary = "Afficher les chambres")
    @GetMapping("/getAll")
    public List<Chambre> getAllChambres() {
        return chambreService.getAllChambre();
    }

    @Operation(description = "récupérer l'Appartenance de la Chambre à un Bloc de la base de données",summary = "L'Appartenance de la Chambre à un Bloc")
    @GetMapping("/{idChambre}/bloc")
    public Bloc getBlocByChambre(@PathVariable long idChambre) {
        return chambreService.getBlocByChambreId(idChambre);
    }
}
