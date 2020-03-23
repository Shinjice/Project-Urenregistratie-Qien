package nl.qien.uren.urenregistratie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.qien.uren.urenregistratie.domein.Contactpersoon;
import nl.qien.uren.urenregistratie.domein.Gebruiker;
import nl.qien.uren.urenregistratie.domein.Opdrachtgever;
import nl.qien.uren.urenregistratie.repository.ContactpersoonRepository;

@Service
public class ContactpersoonService {
	@Autowired
	ContactpersoonRepository contactpersoonRepository;
//	@Autowired
//	MedewerkerRepository medewerkerRepository;
//
//	public void addContactpersoon(Contactpersoon contactpersoon) {
//		contactpersoonRepository.save(contactpersoon);
//	}
//	
//	public void addContactpersoonGebruiker(Long medewerkerId, Long opdrachtgeverId) {
//		Gebruiker gebruiker = contactpersoonRepository.findById(medewerkerId).get();
//		Opdrachtgever opdrachtgever = contactpersoonRepository.findById(opdrachtgeverId).get();
//		gebruiker.setOwner(opdrachtgever);
//		contactpersoonRepository.save(gebruiker);
//		System.out.println("Opdrachtgever toegevoegd aan werknemer.");
//	}
	
	
}
