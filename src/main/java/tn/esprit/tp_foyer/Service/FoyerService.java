package tn.esprit.tp_foyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entity.Foyer;
import tn.esprit.tp_foyer.repository.IFoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService {
    IFoyerRepository foyerRepository;

    @Override
    public void createFoyer(Foyer foyer) {
        foyerRepository.save(foyer);
    }

    @Override
    public void updateFoyer(Foyer foyer) {
        foyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyer(Long id) {
        foyerRepository.deleteById(id);
    }

    @Override
    public Foyer getFoyer(long id) {
        return foyerRepository.findById(id).get();
    }

    @Override
    public List<Foyer> getAllFoyers() {
        return foyerRepository.findAll();
    }
}
