package nl.qien.uren.urenregistratie.domein;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//verandering laszlo
@Entity
public class GewerkteDag {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idGewerkteDag;

	//changed pattern
	private LocalDate datum;
	private float opdracht;
	private float overwerk;
	private float verlof;
	private float ziek;
	private float training;
	private float overig;
	String verklaringOverleg;
	
	public Long getIdGewerkteDag() {
		return idGewerkteDag;
	}
	public void setIdGewerkteDag(Long idGewerkteDag) {
		this.idGewerkteDag = idGewerkteDag;
	}
	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}
	public float getOpdracht() {
		return opdracht;
	}
	public void setOpdracht(float opdracht) {
		this.opdracht = opdracht;
	}
	public float getOverwerk() {
		return overwerk;
	}
	public void setOverwerk(float overwerk) {
		this.overwerk = overwerk;
	}
	public float getVerlof() {
		return verlof;
	}
	public void setVerlof(float verlof) {
		this.verlof = verlof;
	}
	public float getZiek() {
		return ziek;
	}
	public void setZiek(float ziek) {
		this.ziek = ziek;
	}
	public float getTraining() {
		return training;
	}
	public void setTraining(float training) {
		this.training = training;
	}
	public float getOverig() {
		return overig;
	}
	public void setOverig(float overig) {
		this.overig = overig;
	}
	public String getVerklaringOverleg() {
		return verklaringOverleg;
	}
	public void setVerklaringOverleg(String verklaringOverleg) {
		this.verklaringOverleg = verklaringOverleg;
	}
	
	
}
