package projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projet.entities.Reservation;

@Repository
public interface ReservationRepositorie extends JpaRepository<Reservation, Long> {

}
