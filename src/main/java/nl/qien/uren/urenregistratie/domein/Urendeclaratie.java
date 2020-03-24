package nl.qien.uren.urenregistratie.domein;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
public class Urendeclaratie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idUrendeclaratie;
	
	
	
	@ManyToOne
	private Medewerker medewerker;
		
	@JsonFormat(shape = Shape.STRING, pattern = "MM")
	private Date maand;
	
	private ArrayList<GewerkteDag> gewerkteDag;
	
	@ManyToOne
	private Opdrachtgever opdrachtgever;
	
	private boolean goedKeuring;
	private String notitie;
	private LocalDate verzendTijd;	

	
	
	protected Urendeclaratie() {
	}
	

	// GETTERS SETTERS
	public long getIdUrendeclaratie() {
		return idUrendeclaratie;
	}
	public void setIdUrendeclaratie(long idUrendeclaratie) {
		this.idUrendeclaratie = idUrendeclaratie;
	}
	public Date getMaand() {
		return maand;
	}
	public void setMaand(Date maand) {
		this.maand = maand;
	}
	public ArrayList<GewerkteDag> getGewerkteDag() {
		return gewerkteDag;
	}
	public void setGewerkteDag(ArrayList<GewerkteDag> gewerkteDag) {
		this.gewerkteDag = gewerkteDag;
	}
	public boolean isGoedKeuring() {
		return goedKeuring;
	}
	public void setGoedKeuring(boolean goedKeuring) {
		this.goedKeuring = goedKeuring;
	}
	public String getNotitie() {
		return notitie;
	}
	public void setNotitie(String notitie) {
		this.notitie = notitie;
	}
	public LocalDate getVerzendTijd() {
		return verzendTijd;
	}
	public void setVerzendTijd(LocalDate verzendTijd) {
		this.verzendTijd = verzendTijd;
	}


	public Medewerker getMedewerker() {
		return medewerker;
	}


	public void setMedewerker(Medewerker medewerker) {
		this.medewerker = medewerker;
	}


	public Opdrachtgever getOpdrachtgever() {
		return opdrachtgever;
	}


	public void setOpdrachtgever(Opdrachtgever opdrachtgever) {
		this.opdrachtgever = opdrachtgever;
	}


	
	
	
	
	
	
}
