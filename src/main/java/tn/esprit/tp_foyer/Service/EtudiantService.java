package tn.esprit.tp_foyer.Service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entity.Etudiant;
import tn.esprit.tp_foyer.repository.IEtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{
    public IEtudiantRepository etudiantRepository;


    @Override
    public void createEtudiant(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
    }

    @Override
    public void updateEtudiant(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public Etudiant getEtudiant(long id) {
        return etudiantRepository.findById(id).get();
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }
}
