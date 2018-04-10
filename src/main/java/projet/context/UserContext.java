package projet.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import projet.entities.User;
import projet.repositories.userRepositorie;

@Component
@SessionScope
public class UserContext {

	@Autowired
	private userRepositorie userRepositorie;

	private User userCourante;

	public User getPersonneCourante() {
		if (userCourante == null) {
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			userCourante = userRepositorie.getUserByLogin(auth.getName());
		}
		return userCourante;
	}
}
