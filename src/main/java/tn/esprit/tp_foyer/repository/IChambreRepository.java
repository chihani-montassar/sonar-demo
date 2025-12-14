package tn.esprit.tp_foyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.tp_foyer.entity.Bloc;
import tn.esprit.tp_foyer.entity.Chambre;

@Repository
public interface IChambreRepository extends JpaRepository<Chambre,Long> {
    @Query("SELECT c.bloc FROM Chambre c WHERE c.idChambre = :idChambre")
    Bloc findBlocByChambreId(@Param("idChambre") long idChambre);
}
