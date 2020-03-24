package nl.qien.uren.urenregistratie.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import nl.qien.uren.urenregistratie.domein.Contactpersoon;
import nl.qien.uren.urenregistratie.domein.Opdrachtgever;
import nl.qien.uren.urenregistratie.repository.ContactpersoonRepository;
import nl.qien.uren.urenregistratie.service.ContactpersoonService;

public class ContactpersoonEndpoints {
	@Autowired
	private ContactpersoonService contactpersoonService;

}
