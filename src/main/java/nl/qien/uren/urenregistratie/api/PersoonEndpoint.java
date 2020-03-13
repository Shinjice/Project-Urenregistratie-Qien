package nl.qien.uren.urenregistratie.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.qien.uren.urenregistratie.domein.Persoon;
import nl.qien.uren.urenregistratie.service.PersoonService;

@RestController
public class PersoonEndpoint {
	@Autowired
	PersoonService persoonService;
	
	
	@GetMapping("/get")
	public Iterable <Persoon> getMembers() {
	  return persoonService.findAll(); 
	}
	
	@PostMapping("/post")
	public void axPersoon(@RequestBody Persoon persoon) {
		System.out.println("hallo");
		persoonService.addPersoon(persoon);
	}
	
	@PutMapping("update/{id}")
	public void updatePersoon(@PathVariable(value = "id") Long id,
			  @Valid @RequestBody Persoon persoon) {
		persoon.setId(id);
		persoonService.addPersoon(persoon);
	}
	
	
	
	
	
	
}
