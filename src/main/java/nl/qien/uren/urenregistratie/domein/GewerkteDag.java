package nl.qien.uren.urenregistratie.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GewerkteDag {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long dagNummer;
	private float opdracht;
	private float overwerk;
	private float verlof;
	private float ziek;
	private float training;
	private float overig;
	String verklaringOverleg;
	
	public long getDagNummer() {
		return dagNummer;
	}
	public void setDagNummer(long dagNummer) {
		this.dagNummer = dagNummer;
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
