package projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projet.entities.Ligne;

@Repository
public interface LigneRepositorie extends JpaRepository<Ligne, Long> {

}
