package tn.esprit.tp_foyer.Service;

import tn.esprit.tp_foyer.entity.Universite;

import java.util.List;

public interface IUniversiteService {
    public void createUniversite(Universite universite);
    public void updateUniversite(Universite universite);
    public void deleteUniversite(Long id);
    public Universite getUniversite(long id);
    public List<Universite> getAllUniversites();
}
