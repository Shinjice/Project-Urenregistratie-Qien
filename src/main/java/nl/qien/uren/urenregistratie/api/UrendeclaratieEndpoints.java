package nl.qien.uren.urenregistratie.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.qien.uren.urenregistratie.domein.Gebruiker;
import nl.qien.uren.urenregistratie.domein.GewerkteDag;
import nl.qien.uren.urenregistratie.domein.Urendeclaratie;
import nl.qien.uren.urenregistratie.service.UrendeclaratieService;

@RestController
public class UrendeclaratieEndpoints {
	@Autowired
	UrendeclaratieService urendeclaratieService;
	
	//added werkt maar voor alleen de standaard fields
	@PostMapping("/posturendeclaratie")
	public void addUrendeclaratie(@RequestBody Urendeclaratie urendeclaratie) {
		System.out.println("posturendeclaratie");
		urendeclaratieService.addUrendeclaratie(urendeclaratie);
	}
	
	//voorbeeld dat het werkt
	@PutMapping("/showTest/")
	public void showTest(@RequestBody GewerkteDag gewerkteDag) {
		System.out.println("test");
		urendeclaratieService.test(gewerkteDag);
	}
	
	// 1) 
	@PutMapping("/addNieuwegewerktedagurendeclaratie/{idUrendeclaratie}")
	public void addGewerktedagUrendeclaratie(@RequestBody GewerkteDag gewerkteDag, @PathVariable String idUrendeclaratie) {
		System.out.println("putgewerktedagurendeclaratie");
		urendeclaratieService.addNieuweGewerktedagUrendeclaratie(gewerkteDag, Long.parseLong(idUrendeclaratie));
	}
	// 2)
	@PutMapping("/addbestaandegewerktedagurendeclaratie/{idGewerkteDag}/{idUrendeclaratie}")
	public void addBestaandeGewerktedagUrendeclaratie(@PathVariable String idGewerkteDag, @PathVariable String idUrendeclaratie) {
		System.out.println("putgewerktedagurendeclaratie");
		urendeclaratieService.addBestaandeGewerktedagUrendeclaratie(Long.parseLong(idUrendeclaratie), Long.parseLong(idUrendeclaratie));
	}
	//DEZE GETEST EN WERKT
	@GetMapping("/getUrendeclaratie/{id}")
	public Optional <Urendeclaratie> getUrendeclaratieById(@PathVariable String id){
		return urendeclaratieService.findById(Long.parseLong(id));
	}
	
//	VOORBEELD
//	@GetMapping("/get/{id}")
//	public Optional <Gebruiker> getGebruikerById(Gebruiker gebruiker) {
//		long id = gebruiker.getId();
//		return gebruikerService.findById(id);
//	}
}
