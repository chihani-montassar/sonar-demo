package tn.esprit.tp_foyer.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_foyer.Service.BlocService;
import tn.esprit.tp_foyer.entity.Bloc;

import java.util.List;

@Tag(name = "Gestion des blocs",description = "Les API pour gérer les blocs")
@RestController
@AllArgsConstructor
@RequestMapping("bloc")
public class BlocController {
    private BlocService blocService;

    @Operation(description = "Ajouter les blocs de la base de données",summary = "Ajouter des blocs")
    @PostMapping("add")
    public Bloc createBloc(@RequestBody Bloc bloc) {
        return blocService.createBloc(bloc);
    }

    @Operation(description = "Modifier les blocs dans la base de données",summary = "Modifier les blocs")
    @PutMapping("/update")
    public void updateBloc(@RequestBody Bloc bloc) {
        blocService.updateBloc(bloc);
    }

    @Operation(description = "Supprimer les bloc de la base de données",summary = "Supprimer les blocs")
    @DeleteMapping("/delete/{id}")
    public void deleteBloc(@PathVariable long id) {
        blocService.deleteBloc(id);
    }

    @Operation(description = "récupérer les bloc de la base de données par id",summary = "Afficher les blocs par id")
    @GetMapping("/get")
    public Bloc getBloc(@RequestParam long id) {
        return blocService.getBloc(id);
    }

    @Operation(description = "récupérer toutes les bloc de la base de données",summary = "Afficher les blocs")
    @GetMapping("/getAll")
    public List<Bloc> getAllBlocs() {
        return blocService.getAllBloc();
    }
}