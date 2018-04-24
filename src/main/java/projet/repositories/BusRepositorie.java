package projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projet.entities.Bus;

@Repository
public interface BusRepositorie extends JpaRepository<Bus, Long> {

}
