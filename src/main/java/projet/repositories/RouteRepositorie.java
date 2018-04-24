package projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projet.entities.Route;

@Repository
public interface RouteRepositorie extends JpaRepository<Route, Long> {

}
