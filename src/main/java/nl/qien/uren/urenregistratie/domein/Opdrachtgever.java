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
	private long werkGeverId;
	
	@OneToMany(mappedBy = "owner")
	private List<Gebruiker> id;
	
}
