package projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projet.entities.Station;

@Repository
public interface StationRepositorie extends JpaRepository<Station, Long> {

}
