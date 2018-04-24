package projet.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Station implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idStation;
	private int num_arret;
	private String nom;
	private int klm;

	public Station() {
		super();
	}

	public Station(int num_arret, String nom, int klm) {
		super();
		this.num_arret = num_arret;
		this.nom = nom;
		this.klm = klm;
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

	public int getKlm() {
		return klm;
	}

	public void setKlm(int klm) {
		this.klm = klm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + klm;
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
		Station other = (Station) obj;
		if (klm != other.klm) {
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
