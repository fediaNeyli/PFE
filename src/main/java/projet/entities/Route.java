package projet.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Route implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRoute;
	private int num_arret;
	private String nom;
	private int klmStation;

	public Route(Long idRoute, int num_arret, String nom, int klmStation) {
		super();
		this.idRoute = idRoute;
		this.num_arret = num_arret;
		this.nom = nom;
		this.klmStation = klmStation;
	}

	public Route() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdRoute() {
		return idRoute;
	}

	public void setIdRoute(Long idRoute) {
		this.idRoute = idRoute;
	}

	public int getNum_arret() {
		return num_arret;
	}

	public void setNum_arret(int num_arret) {
		this.num_arret = num_arret;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getKlmStation() {
		return klmStation;
	}

	public void setKlmStation(int klmStation) {
		this.klmStation = klmStation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idRoute == null) ? 0 : idRoute.hashCode());
		result = prime * result + klmStation;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + num_arret;
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
		Route other = (Route) obj;
		if (idRoute == null) {
			if (other.idRoute != null) {
				return false;
			}
		} else if (!idRoute.equals(other.idRoute)) {
			return false;
		}
		if (klmStation != other.klmStation) {
			return false;
		}
		if (nom == null) {
			if (other.nom != null) {
				return false;
			}
		} else if (!nom.equals(other.nom)) {
			return false;
		}
		if (num_arret != other.num_arret) {
			return false;
		}
		return true;
	}

}
