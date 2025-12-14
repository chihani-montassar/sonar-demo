package tn.esprit.tp_foyer.Service;


import tn.esprit.tp_foyer.entity.Etudiant;
import java.util.List;

public interface IEtudiantService {
    public void createEtudiant(Etudiant etudiant);
    public void updateEtudiant(Etudiant etudiant);
    public void deleteEtudiant(Long id);
    public Etudiant getEtudiant(long id);
    public List<Etudiant> getAllEtudiants();
}
