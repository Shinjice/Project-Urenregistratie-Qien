package nl.qien.uren.urenregistratie.domein;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Opdrachtgever {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long opdrachtgeverID;

	private String naamOpdrachtgever;

	@OneToMany//(mappedBy = "owner")
	private List<Medewerker> medewerkers;


	public Long getOpdrachtgeverID() {
		return opdrachtgeverID;
	}


	public void setOpdrachtgeverID(Long opdrachtgeverID) {
		this.opdrachtgeverID = opdrachtgeverID;
	}


	public String getNaamOpdrachtgever() {
		return naamOpdrachtgever;
	}


	public void setNaamOpdrachtgever(String naamOpdrachtgever) {
		this.naamOpdrachtgever = naamOpdrachtgever;
	}


//	public long getId() {
//		return this.opdrachtgeverID;
//	}


//	public void setId(List<Medewerker> id) {
//		this.id = id;
//	}
	
	
	
}
