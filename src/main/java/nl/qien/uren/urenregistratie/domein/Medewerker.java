package nl.qien.uren.urenregistratie.domein;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Medewerker {
	private long medewerkerId;
	
	
	@ManyToOne
	private Opdrachtgever owner;


	public long getMedewerkerId() {
		return medewerkerId;
	}


	public void setMedewerkerId(long medewerkerId) {
		this.medewerkerId = medewerkerId;
	}


	public Opdrachtgever getOwner() {
		return owner;
	}


	public void setOwner(Opdrachtgever owner) {
		this.owner = owner;
	}
	
	
}
