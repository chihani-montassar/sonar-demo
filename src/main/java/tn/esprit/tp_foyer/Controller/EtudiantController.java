package tn.esprit.tp_foyer.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_foyer.Service.IEtudiantService;
import tn.esprit.tp_foyer.entity.Etudiant;

import java.util.List;

@Tag(name = "Gestion des etudiants")
@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    private IEtudiantService etudiantService;

    @Operation(description = "Ajouter les etudiants de la base de données",summary = "Ajouter les etudiants")
    @PostMapping("/add")
    public void createEtudiant(@RequestBody Etudiant etudiant) {
        etudiantService.createEtudiant(etudiant);
    }

    @Operation(description = "Modifier les etudiants dans la base de données",summary = "Modifier les etudiants")
    @PutMapping("/update")
    public void updateEtudiant(@RequestBody Etudiant etudiant) {
        etudiantService.updateEtudiant(etudiant);
    }

    @Operation(description = "Supprimer les etudiants de la base de données par id",summary = "supprimer les etudiants par id")
    @DeleteMapping("/delete/{id}")
    public void deleteEtudiant(@PathVariable long id) {
        etudiantService.deleteEtudiant(id);
    }

    @Operation(description = "récupérer les etudiants de la base de données par id",summary = "Afficher les etudiants par id")
    @GetMapping("/get/{id}")
    public Etudiant getEtudiant(@PathVariable long id) {
        return etudiantService.getEtudiant(id);
    }

    @Operation(description = "récupérer toutes les etudiants de la base de données", summary = "Afficher les etudiants")
    @GetMapping("/getAll")
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }
}
