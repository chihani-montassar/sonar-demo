package tn.esprit.tp_foyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entity.Bloc;
import tn.esprit.tp_foyer.repository.IBlocRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class BlocService implements IBlocService {
    IBlocRepository blocRepository;

    @Override
    public Bloc createBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void updateBloc(Bloc bloc) {
        blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(Long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public Bloc getBloc(long id)
    {
        //blocRepository.findById(id).orElse(new Bloc());
        //blocRepository.findById(id).get();
        return blocRepository.findById(id).get();
    }

    @Override
    public List<Bloc> getAllBloc() {
        return blocRepository.findAll();
    }

}



