package nl.qien.uren.urenregistratie.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Contactpersoon {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idContactpersoon;
	private String naam;
//	@ManyToOne
//	private Opdrachtgever owner;
	
	public long getIdContactpersoon() {
		return idContactpersoon;
	}
	public void setIdContactpersoon(long idContactpersoon) {
		this.idContactpersoon = idContactpersoon;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
//	public Opdrachtgever getOwner() {
//		return owner;
//	}
//	public void setOwner(Opdrachtgever owner) {
//		this.owner = owner;
//	}
	
	
}
