package nl.qien.uren.urenregistratie.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.qien.uren.urenregistratie.domein.GewerkteDag;
import nl.qien.uren.urenregistratie.service.GewerkteDagService;

@RestController
public class GewerkteDagEndpoints {
	@Autowired
	GewerkteDagService gewerkteDagService;

	//getdagen van gemaakt inplaats van get dag.
	@GetMapping("/getdagen")
	public Iterable<GewerkteDag> getDayAll() {
		System.out.println("alle dagen opgevraagd");
		return gewerkteDagService.findAll();
	}
	//added
	@GetMapping("/getdag/{idGewerkteDag}")
	public Optional<GewerkteDag> getDag(@PathVariable Long idGewerkteDag){
		System.out.println("dag opgevraagd");
		return gewerkteDagService.findById(idGewerkteDag);
	}

	@PostMapping("/postdag")
	public void addGebruiker(@RequestBody GewerkteDag gewerkteDag) {
		System.out.println("dag toegevoegd");
		gewerkteDagService.addDag(gewerkteDag);
	}

}
