package tn.esprit.tp_foyer.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_foyer.Service.IUniversiteService;
import tn.esprit.tp_foyer.entity.Universite;

import java.util.List;

@Tag(name = "Gestion des universites")
@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {
    IUniversiteService universiteService;

    @Operation(description = "Ajouter les universites de la base de données",summary = "Ajouter les universites")
    @PostMapping("/add")
    public void createUniversite(@RequestBody Universite universite) {
        universiteService.createUniversite(universite);
    }

    @Operation(description = "Modifier les universites dans la base de données",summary = "Modifier les universites")
    @PutMapping("/update")
    public void updateUniversite(@RequestBody Universite universite) {
        universiteService.updateUniversite(universite);
    }

    @Operation(description = "Supprimer les universites de la base de données par id",summary = "Supprimer les universites par id")
    @DeleteMapping("/delete/{id}")
    public void deleteUniversite(@PathVariable long id) {
        universiteService.deleteUniversite(id);
    }

    @Operation(description = "récupérer les universites de la base de données par id",summary = "Afficher les reservations par id")
    @GetMapping("/get/{id}")
    public Universite getUniversite(@PathVariable long id) {
        return universiteService.getUniversite(id);
    }

    @Operation(description = "récupérer toutes les universites de la base de données",summary = "Afficher tous les universites")
    @GetMapping("/getAll")
    public List<Universite> getAllUniversites() {
        return universiteService.getAllUniversites();
    }
}
