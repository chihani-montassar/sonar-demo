package tn.esprit.tp_foyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entity.Universite;
import tn.esprit.tp_foyer.repository.IUniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService{
    IUniversiteRepository universiteRepository;

    @Override
    public void createUniversite(Universite universite) {

        universiteRepository.save(universite);
    }

    @Override
    public void updateUniversite(Universite universite) {
        universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(Long id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public Universite getUniversite(long id) {
        return universiteRepository.findById(id).get();
    }

    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }
}
