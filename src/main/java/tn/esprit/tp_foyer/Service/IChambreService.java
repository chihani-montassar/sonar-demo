package tn.esprit.tp_foyer.Service;

import tn.esprit.tp_foyer.entity.Bloc;
import tn.esprit.tp_foyer.entity.Chambre;

import java.util.List;

public interface IChambreService {
    public Chambre createChambre(Chambre chambre);
    public void updateChambre(Chambre chambre);
    public void deleteChambre(Long id);
    public Chambre getChambre(long id);
    public List<Chambre> getAllChambre();
    public Bloc getBlocByChambreId(long idChambre);
}
