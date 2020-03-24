package nl.qien.uren.urenregistratie.domein;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idUrendeclaratie;
//tam: uitgecomment, anders loopt springboot niet
//	private Medewerker medewerker;
//	private Opdracht opdracht;
	@JsonFormat(shape = Shape.STRING, pattern = "MM")
	private Date maand;
	
	//private gemaakt en identifier gewerkteDagen van gemaakt
	private ArrayList<GewerkteDag> gewerkteDagen;
//tam: uitgecomment, anders loopt springboot niet
//	@ManyToOne
//	private Opdrachtgever opdrachtgever;
	private boolean goedKeuring;
	String notitie;
	//changed to localdatetime
	LocalDateTime verzendTijd;	
	
// 	Extra methode zodat er een gewerktedag kan toegevoegd worden
	public void addGewerkteDag(GewerkteDag gewerkteDag) {
		this.gewerkteDagen.add(gewerkteDag);
	}
	
	
	
	public long getIdUrendeclaratie() {
		return idUrendeclaratie;
	}
	public void setIdUrendeclaratie(long idUrendeclaratie) {
		this.idUrendeclaratie = idUrendeclaratie;
	}
//	public Medewerker getMedewerker() {
//		return medewerker;
//	}
//	public void setMedewerker(Medewerker medewerker) {
//		this.medewerker = medewerker;
//	}
	public Date getMaand() {
		return maand;
	}
	public void setMaand(Date maand) {
		this.maand = maand;
	}
	public ArrayList<GewerkteDag> getGewerkteDag() {
		return gewerkteDagen;
	}
	public void setGewerkteDag(ArrayList<GewerkteDag> gewerkteDag) {
		this.gewerkteDagen = gewerkteDag;
	}
//	public Opdrachtgever getOpdrachtgever() {
//		return opdrachtgever;
//	}
//	public void setOpdrachtgever(Opdrachtgever opdrachtgever) {
//		this.opdrachtgever = opdrachtgever;
//	}
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
	public LocalDateTime getVerzendTijd() {
		return verzendTijd;
	}
	public void setVerzendTijd(LocalDateTime verzendTijd) {
		this.verzendTijd = verzendTijd;
	}
	
	public void openzettenUrendeclaratie() {
	}
	public void sluitenUrendeclaratie() {
	}
}
