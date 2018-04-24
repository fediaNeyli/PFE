package projet.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ligne implements Serializable {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bus == null) ? 0 : bus.hashCode());
		result = prime * result + ((idLigne == null) ? 0 : idLigne.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Ligne other = (Ligne) obj;
		if (bus == null) {
			if (other.bus != null) {
				return false;
			}
		} else if (!bus.equals(other.bus)) {
			return false;
		}
		if (idLigne == null) {
			if (other.idLigne != null) {
				return false;
			}
		} else if (!idLigne.equals(other.idLigne)) {
			return false;
		}
		return true;
	}
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLigne;
	@ManyToOne(cascade = CascadeType.ALL)
	private Bus bus;

}
