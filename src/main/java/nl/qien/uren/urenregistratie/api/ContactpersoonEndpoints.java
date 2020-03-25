package nl.qien.uren.urenregistratie.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import nl.qien.uren.urenregistratie.domein.Contactpersoon;
import nl.qien.uren.urenregistratie.domein.Medewerker;
import nl.qien.uren.urenregistratie.service.ContactpersoonService;
import nl.qien.uren.urenregistratie.service.OpdrachtgeverService;

public class ContactpersoonEndpoints {
	@Autowired
	ContactpersoonService contactpersoonService;
	@Autowired
	OpdrachtgeverService opdrachtgeverService;
	
	@GetMapping("/1/get")
	public Iterable <Contactpersoon> getGebruikerAll() {
	  return contactpersoonService.findAll();
	}
	
	@PostMapping("/1/post")
	public void addGebruiker(@RequestBody Contactpersoon contactpersoon) {
		System.out.println("hallo");
		contactpersoonService.addGebruiker(contactpersoon);
	}
	
	@DeleteMapping("/1/{id}")
	public void deleteGebruiker(@PathVariable(value = "id") String gebruikerId) {
		contactpersoonService.deleteGebruiker(Long.parseLong(gebruikerId));
	}
	
	@PutMapping("/1/{id}")
	public void updateMedewerker(@PathVariable Long id,@RequestBody Contactpersoon contactpersoon) {

	}
	//tam bezig
//	@PutMapping("/api/medewerkers/{id}/opdrachtgever") //
//	public void toevoegenOpdrachtgever(@PathVariable Long id,  @RequestParam Long opdrachtgeverId) {
//		Contactpersoon contactpersoon = (Medewerker) this.contactpersoonService.findById(id).get();
//		Medewerker medewerker = this.medewerkergeverService.findById(opdrachtgeverId).get();
//		medewerker.setOpdrachtgever(opdrachtgever);
//		this.contactpersoonService.addGebruiker(medewerker); // Wel even checken of hierbij geen specificiteit verloren gaat
//	}
	// Ziet er zo uit:
	// PUT "http://server/api/medewerks/{id}/opdrachtgever?opdrachtgeverId=1234"
	

}
