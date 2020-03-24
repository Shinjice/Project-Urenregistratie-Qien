package nl.qien.uren.urenregistratie.domein;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

import javax.persistence.*;

@Entity
public class Urendeclaratie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idUrendeclaratie;
//tam: uitgecomment, anders loopt springboot niet

	@ManyToOne
	private Medewerker medewerker;

	//@OneToOne
	//private Opdracht opdracht;

	private LocalDate maand;
	
	//private gemaakt en identifier gewerkteDagen van gemaakt
	@OneToMany
	private Collection<GewerkteDag> gewerkteDagen;
//tam: uitgecomment, anders loopt springboot niet
	@ManyToOne
	private Opdrachtgever opdrachtgever;
	private boolean goedKeuring;
	String notitie;
	//changed to localdatetime
	LocalDateTime verzendTijd;	
	
// 	Extra methode zodat er een gewerktedag kan toegevoegd worden
	public void addGewerkteDag(GewerkteDag gewerkteDag) {
		this.gewerkteDagen.add(gewerkteDag);
	}
	
	
	
	public Long getIdUrendeclaratie() {
		return idUrendeclaratie;
	}
	public void setIdUrendeclaratie(Long idUrendeclaratie) {
		this.idUrendeclaratie = idUrendeclaratie;
	}
//	public Medewerker getMedewerker() {
//		return medewerker;
//	}
//	public void setMedewerker(Medewerker medewerker) {
//		this.medewerker = medewerker;
//	}
	public LocalDate getMaand() {
		return maand;
	}
	public void setMaand(LocalDate maand) {
		this.maand = maand;
	}
	public Collection<GewerkteDag> getGewerkteDagen() {
		return gewerkteDagen;
	}
	public void setGewerkteDagen(Collection<GewerkteDag> gewerkteDagen) {
		this.gewerkteDagen = gewerkteDagen;
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
