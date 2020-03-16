package nl.qien.uren.urenregistratie.api;

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
import nl.qien.uren.urenregistratie.repository.OpdrachtgeverRepository;
import nl.qien.uren.urenregistratie.service.GebruikerService;

@RestController
public class GebruikerEndpoint {
	@Autowired
	GebruikerService gebruikerService;

	
	
	@GetMapping("/get")
	public Iterable <Gebruiker> getGebruikerAll() {
	  return gebruikerService.findAll();
	}
	@GetMapping("/getbyid")
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
	
	@DeleteMapping("/delete/{id}") //nog niet getest
	public void deleteGebruiker(@PathVariable(value = "id") Long id,
			  @Valid @RequestBody Gebruiker gebruiker) {
		gebruikerService.deleteGebruiker(gebruiker);
	}
	@GetMapping("/getbyidOpdrachtgever/{id}")
	public Optional<Opdrachtgever> getOpdrachtgeverById(Opdrachtgever opdrachtgever) {
		long id = opdrachtgever.getId();
		return gebruikerService.findById1(id);
	}
	
	
	
	
}
