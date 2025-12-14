package tn.esprit.tp_foyer.Controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_foyer.Service.IFoyerService;
import tn.esprit.tp_foyer.entity.Foyer;

import java.util.List;

@Tag(name = "Gestion des foyers")
@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerController {
    IFoyerService foyerService;

    @Operation(description = "Ajouter les foyers de la base de données",summary = "Ajouter les foyer")
    @PostMapping("/add")
    public void createFoyer(@RequestBody Foyer foyer) {
        foyerService.createFoyer(foyer);
    }

    @Operation(description = "Modifier les foyers dans la base de données",summary = "Modifier les foyers")
    @PutMapping("/update")
    public void updateFoyer(@RequestBody Foyer foyer) {
        foyerService.updateFoyer(foyer);
    }

    @Operation(description = "Supprimer les foyers de la base de données par id",summary = "Supprimer les foyers par id")
    @DeleteMapping("/delete/{id}")
    public void deleteFoyer(@PathVariable long id) {
        foyerService.deleteFoyer(id);
    }

    @Operation(description = "Récupérer les foyers de la base de données par id",summary = "Récupérer les foyers par id")
    @GetMapping("/get/{id}")
    public Foyer getFoyer(@PathVariable long id) {
        return foyerService.getFoyer(id);
    }

    @Operation(description = "Récupérer toutes les foyers de la base de données", summary = "Afficher tous les foyers")
    @GetMapping("/getAll")
    public List<Foyer> getAllFoyers() {
        return foyerService.getAllFoyers();
    }
}
