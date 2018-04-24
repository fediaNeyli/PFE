package projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projet.entities.Carte;

@Repository
public interface CarteRepositorie extends JpaRepository<Carte, Long> {

}
