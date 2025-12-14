package tn.esprit.tp_foyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entity.Bloc;
import tn.esprit.tp_foyer.entity.Chambre;
import tn.esprit.tp_foyer.repository.IBlocRepository;
import tn.esprit.tp_foyer.repository.IChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService{
    public IChambreRepository chambreRepository;
    public IBlocRepository blocRepository;

    @Override
    public Chambre createChambre(Chambre chambre){
        return chambreRepository.save(chambre);
    }

    @Override
    public void updateChambre(Chambre chambre) {
        chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public Chambre getChambre(long id) {
        return chambreRepository.findById(id).get();
    }

    @Override
    public List<Chambre> getAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Bloc getBlocByChambreId(long idChambre) {
        Bloc bloc = chambreRepository.findBlocByChambreId(idChambre);
        return bloc;
    }
}
