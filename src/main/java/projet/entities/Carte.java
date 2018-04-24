package projet.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carte implements Serializable {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCarte == null) ? 0 : idCarte.hashCode());
		result = prime * result + montant;
		result = prime * result + ((numCarte == null) ? 0 : numCarte.hashCode());
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
		Carte other = (Carte) obj;
		if (idCarte == null) {
			if (other.idCarte != null) {
				return false;
			}
		} else if (!idCarte.equals(other.idCarte)) {
			return false;
		}
		if (montant != other.montant) {
			return false;
		}
		if (numCarte == null) {
			if (other.numCarte != null) {
				return false;
			}
		} else if (!numCarte.equals(other.numCarte)) {
			return false;
		}
		return true;
	}

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCarte;
	private Long numCarte;
	private int montant;

	public Carte() {
		super();
	}

	public Carte(Long idCarte, Long numCarte, int montant) {
		super();
		this.idCarte = idCarte;
		this.numCarte = numCarte;
		this.montant = montant;
	}

	public Long getIdCarte() {
		return idCarte;
	}

	public void setIdCarte(Long idCarte) {
		this.idCarte = idCarte;
	}

	public Long getNumCarte() {
		return numCarte;
	}

	public void setNumCarte(Long numCarte) {
		this.numCarte = numCarte;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

}
