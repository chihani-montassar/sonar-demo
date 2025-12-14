package tn.esprit.tp_foyer.Service;
import tn.esprit.tp_foyer.entity.Bloc;

import java.util.List;

public interface IBlocService {
    public Bloc createBloc(Bloc bloc);
    public void updateBloc(Bloc bloc);
    public void deleteBloc(Long id);
    public Bloc getBloc(long id);
    public List<Bloc> getAllBloc();
}
