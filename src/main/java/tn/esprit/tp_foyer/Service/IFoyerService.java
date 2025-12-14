package tn.esprit.tp_foyer.Service;

import tn.esprit.tp_foyer.entity.Foyer;

import java.util.List;

public interface IFoyerService {
    public void createFoyer(Foyer foyer);
    public void updateFoyer(Foyer foyer);
    public void deleteFoyer(Long id);
    public Foyer getFoyer(long id);
    public List<Foyer> getAllFoyers();

}
