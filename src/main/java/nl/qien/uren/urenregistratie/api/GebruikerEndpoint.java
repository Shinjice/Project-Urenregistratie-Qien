package nl.qien.uren.urenregistratie.api;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.qien.uren.urenregistratie.domein.Gebruiker;
import nl.qien.uren.urenregistratie.domein.Opdrachtgever;
import nl.qien.uren.urenregistratie.service.GebruikerService;

@RestController
public class GebruikerEndpoint {
	@Autowired
	GebruikerService gebruikerService;

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
		long id = opdrachtgever.getId();
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
	
	// ERBIJ GEDAAN

	@GetMapping("/gebruikers/medewerkers/{mwid}/{wgid}") // 
	public void toevoegenOpdrachtgever(@PathVariable(value = "mwid") String medewerkerId, @PathVariable(value="wgid") String opdrachtgeverId) {
		gebruikerService.addOpdrachtgeverGebruiker(Long.parseLong(medewerkerId), Long.parseLong(opdrachtgeverId));
	}
	
}
