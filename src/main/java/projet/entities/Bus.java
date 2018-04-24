package projet.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bus implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBus;
	private int num_serie;
	private String depart;
	private String destination;
	private int nbre_place;
	@OneToMany
	private Collection<Ligne> lignes;

	public Bus(int num_serie, String depart, String destination, int nbre_place) {
		super();
		this.num_serie = num_serie;
		this.depart = depart;
		this.destination = destination;
		this.nbre_place = nbre_place;
	}

	public Bus() {
		super();
	}

	public int getNum_serie() {
		return num_serie;
	}

	public void setNum_serie(int num_serie) {
		this.num_serie = num_serie;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNbre_place() {
		return nbre_place;
	}

	public void setNbre_place(int nbre_place) {
		this.nbre_place = nbre_place;
	}

	public Collection<Ligne> getLignes() {
		return lignes;
	}

	public void setLignes(Collection<Ligne> lignes) {
		this.lignes = lignes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((depart == null) ? 0 : depart.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + nbre_place;
		result = prime * result + num_serie;
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
		Bus other = (Bus) obj;
		if (depart == null) {
			if (other.depart != null) {
				return false;
			}
		} else if (!depart.equals(other.depart)) {
			return false;
		}
		if (destination == null) {
			if (other.destination != null) {
				return false;
			}
		} else if (!destination.equals(other.destination)) {
			return false;
		}
		if (nbre_place != other.nbre_place) {
			return false;
		}
		if (num_serie != other.num_serie) {
			return false;
		}
		return true;
	}

}
