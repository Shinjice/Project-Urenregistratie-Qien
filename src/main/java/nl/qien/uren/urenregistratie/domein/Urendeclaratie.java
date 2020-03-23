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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idUrendeclaratie;
//tam: uitgecomment, anders loopt springboot niet
//	private Medewerker medewerker;
//	private Opdracht opdracht;
	@JsonFormat(shape = Shape.STRING, pattern = "MM")
	private Date maand;
	ArrayList<GewerkteDag> gewerkteDag;
//tam: uitgecomment, anders loopt springboot niet
//	@ManyToOne
//	private Opdrachtgever opdrachtgever;
	private boolean goedKeuring;
	String notitie;
	LocalDate verzendTijd;	
	
	public void openzettenUrendeclaratie() {
	}
	public void sluitenUrendeclaratie() {
	}
}
