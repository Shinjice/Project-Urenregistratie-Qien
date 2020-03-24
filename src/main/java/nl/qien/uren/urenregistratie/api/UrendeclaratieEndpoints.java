package nl.qien.uren.urenregistratie.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import nl.qien.uren.urenregistratie.domein.Gebruiker;
import nl.qien.uren.urenregistratie.domein.Opdrachtgever;
//import nl.qien.uren.urenregistratie.domein.Gebruiker;
//import nl.qien.uren.urenregistratie.domein.Opdrachtgever;
import nl.qien.uren.urenregistratie.domein.Urendeclaratie;
import nl.qien.uren.urenregistratie.service.UrendeclaratieService;

@RestController
public class UrendeclaratieEndpoints {
	
	@Autowired
	UrendeclaratieService urendeclaratieService;
	
	
	@PostMapping("/addurendeclaratie")
	public void addUrendeclaratie(Urendeclaratie urendeclaratie) {
		System.out.println("uren toegevoegd");
		urendeclaratieService.addUrendeclaratie(urendeclaratie);
	}
//	
//	@GetMapping("/urendeclaratie/{id}")
//	public Optional <Gebruiker> getUrendeclaratieById(Urendeclaratie urendeclaratie) {
//		long id = urendeclaratie.getId();
//		return urendeclaratieService.findById(id);
//	}
//	
//	@GetMapping()
//	public void 
//	
//	
	
//	@GetMapping("/get/{id}")
//	public Optional <Gebruiker> getGebruikerById(Gebruiker gebruiker) {
//		long id = gebruiker.getId();
//		return gebruikerService.findById(id);
//	}
	
	
	

}



