package nl.qien.uren.urenregistratie.domein;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gebruiker {
	private enum Titel{
		MR, MRS
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	//private Titel;
	private String voornaam;
	private String achternaam;
	private LocalDate geboorteDatum;
	private String emailAdres;
	private String telefoonNummer;
	private String wachtwoordHash;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	public LocalDate getGeboorteDatum() {
		return geboorteDatum;
	}
	public void setGeboorteDatum(LocalDate geboorteDatum) {
		this.geboorteDatum = geboorteDatum;
	}
	public String getEmailAdres() {
		return emailAdres;
	}
	public void setEmailAdres(String emailAdres) {
		this.emailAdres = emailAdres;
	}
	public String getTelefoonNummer() {
		return telefoonNummer;
	}
	public void setTelefoonNummer(String telefoonNummer) {
		this.telefoonNummer = telefoonNummer;
	}
	public String getWachtwoordHash() {
		return wachtwoordHash;
	}
	public void setWachtwoordHash(String wachtwoordHash) {
		this.wachtwoordHash = wachtwoordHash;
	}
	
}
