package projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projet.entities.User;

@Repository
public interface  userRepositorie  extends JpaRepository<User, Long> {

	 public User getUserByLogin(String login) ;
}
