package nl.qien.uren.urenregistratie.api;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import nl.qien.uren.urenregistratie.domein.Medewerker;
import nl.qien.uren.urenregistratie.domein.Opdracht;
import nl.qien.uren.urenregistratie.service.OpdrachtgeverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import nl.qien.uren.urenregistratie.domein.Gebruiker;
import nl.qien.uren.urenregistratie.domein.Opdrachtgever;
import nl.qien.uren.urenregistratie.service.GebruikerService;

@RestController
public class GebruikerEndpoint {
	@Autowired
	private GebruikerService gebruikerService;

	@Autowired
	private OpdrachtgeverService opdrachtgeverService;

	//Gebruiker
	
	@GetMapping("/get")
	public Iterable <Gebruiker> getGebruikerAll() {
	  return gebruikerService.findAll();
	}
	@GetMapping("/get/{id}")
	public Optional <Gebruiker> getGebruikerById(Gebruiker gebruiker) {
		long id = gebruiker.getId();
		return gebruikerService.findById(id);
	}
	@PostMapping("/post")
	public void addGebruiker(@RequestBody Gebruiker gebruiker) {
		System.out.println("hallo");
		gebruikerService.addGebruiker(gebruiker);
	}
	
	@PutMapping("update/{id}")
	public void updatePersoon(@PathVariable(value = "id") Long id,
			  @Valid @RequestBody Gebruiker gebruiker) {
		gebruiker.setId(id);
		gebruikerService.addGebruiker(gebruiker);
	}

	@DeleteMapping("/delete/{id}")
		public void deleteGebruiker(@PathVariable(value = "id") String gebruikerId) {
		gebruikerService.deleteGebruiker(Long.parseLong(gebruikerId));
}
	@GetMapping("/search/{achternaam}")
	public List<Gebruiker> findByLastname(@PathVariable String achternaam) {
		List<Gebruiker> a = gebruikerService.findByAchternaam(achternaam);
		System.out.println("terminal:" + achternaam);
		return a;
	}
	
	//Opdrachtgever
	
	@GetMapping("/getbyidOpdrachtgever/{id}")
	public Optional<Opdrachtgever> getOpdrachtgeverById(Opdrachtgever opdrachtgever) {
		long id = opdrachtgever.getOpdrachtgeverID();
		return gebruikerService.findById1(id);
	}
	
	@PostMapping("/postopdrachtgever")
	public void addOpdrachtgever(@RequestBody Opdrachtgever opdrachtgever) {
		System.out.println("iets anders");
		gebruikerService.addOpdrachtgever(opdrachtgever);
	}
	
	@DeleteMapping("/deleteopdrachtgever/{id}") //nog niet getest
	public void deleteOpdrachtgever(@PathVariable(value = "id") Long id,
			  @Valid @RequestBody Opdrachtgever opdrachtgever) {
		//gebruikerService.deleteOpdrachtgever(opdrachtgever);
	}

	@PutMapping("/api/medewerkers/{id}")
	public void updateMedewerker(@PathVariable Long id,@RequestBody Medewerker medewerker) {

	}

	/* === VOORBEELD ===
	 * Gesuggereerde endpoints voor omgaan met opdrachtgever van een specifieke
	 * medewerker
	 *
	 * === WAARSCHUWING ===
	 * ClassCasten van Gebruiker naar Medewerker hier is NIET goed -
	 * dit kan beter worden aangepakt door de aparte services (verder leeg)
	 * van Medewerker aan te spreken
	 */

	@GetMapping("/api/medewerkers/{id}/opdrachtgever")
	public Opdrachtgever getOpdrachtgeverVanMedewerker(@PathVariable Long id) {
		Medewerker medewerker = (Medewerker) this.gebruikerService.findById(id).get();
		return medewerker.getOpdrachtgever();
	}

	@PutMapping("/api/medewerkers/{id}/opdrachtgever") //
	public void toevoegenOpdrachtgever(@PathVariable Long id,  @RequestParam Long opdrachtgeverId) {
		Medewerker medewerker = (Medewerker) this.gebruikerService.findById(id).get();
		Opdrachtgever opdrachtgever = this.opdrachtgeverService.findById(opdrachtgeverId).get();
		medewerker.setOpdrachtgever(opdrachtgever);
		this.gebruikerService.addGebruiker(medewerker); // Wel even checken of hierbij geen specificiteit verloren gaat
	}
	// Ziet er zo uit:
	// PUT "http://server/api/medewerks/{id}/opdrachtgever?opdrachtgeverId=1234"

	/* === EINDE VOORBEELD ===
	 *
	 */
}
