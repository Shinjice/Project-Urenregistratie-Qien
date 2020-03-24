package nl.qien.uren.urenregistratie.domein;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
<<<<<<< Updated upstream
public class Gebruiker {
	private enum Titel{
		MR, MRS
=======
public abstract class Gebruiker {
	private enum Titel {
		Dhr, Mevr,
>>>>>>> Stashed changes
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
	private String adres;
	private String woonplaats;
	private String wachtwoordHash;
	
	@ManyToOne
	private Opdrachtgever owner;
	
	
	public Opdrachtgever getOwner() {
		return owner;
	}
	public void setOwner(Opdrachtgever owner) {
		this.owner = owner;
	}
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
<<<<<<< Updated upstream
	
=======

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getWoonplaats() {
		return woonplaats;
	}

	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
	}
>>>>>>> Stashed changes
}
