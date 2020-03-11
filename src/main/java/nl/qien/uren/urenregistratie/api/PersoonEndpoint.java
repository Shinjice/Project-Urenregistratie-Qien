package nl.qien.uren.urenregistratie.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import nl.qien.uren.urenregistratie.service.PersoonService;

@RestController
public class PersoonEndpoint {
	@Autowired
	PersoonService s;
	
}
