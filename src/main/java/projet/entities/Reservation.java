package projet.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRes;
	private int heure_depart;
	private int heure_arrivé;
	private String depart;
	private String destination;

	public Reservation(Long idRes, int heure_depart, int heure_arrivé, String depart, String destination) {
		super();
		this.idRes = idRes;
		this.heure_depart = heure_depart;
		this.heure_arrivé = heure_arrivé;
		this.depart = depart;
		this.destination = destination;
	}

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdRes() {
		return idRes;
	}

	public void setIdRes(Long idRes) {
		this.idRes = idRes;
	}

	public int getHeure_depart() {
		return heure_depart;
	}

	public void setHeure_depart(int heure_depart) {
		this.heure_depart = heure_depart;
	}

	public int getHeure_arrivé() {
		return heure_arrivé;
	}

	public void setHeure_arrivé(int heure_arrivé) {
		this.heure_arrivé = heure_arrivé;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((depart == null) ? 0 : depart.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + heure_arrivé;
		result = prime * result + heure_depart;
		result = prime * result + ((idRes == null) ? 0 : idRes.hashCode());
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
		Reservation other = (Reservation) obj;
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
		if (heure_arrivé != other.heure_arrivé) {
			return false;
		}
		if (heure_depart != other.heure_depart) {
			return false;
		}
		if (idRes == null) {
			if (other.idRes != null) {
				return false;
			}
		} else if (!idRes.equals(other.idRes)) {
			return false;
		}
		return true;
	}

}
