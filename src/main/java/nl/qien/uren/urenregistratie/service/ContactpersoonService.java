package nl.qien.uren.urenregistratie.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.qien.uren.urenregistratie.domein.Contactpersoon;
import nl.qien.uren.urenregistratie.domein.Gebruiker;
import nl.qien.uren.urenregistratie.domein.Medewerker;
import nl.qien.uren.urenregistratie.domein.Opdrachtgever;
import nl.qien.uren.urenregistratie.repository.ContactpersoonRepository;
import nl.qien.uren.urenregistratie.repository.MedewerkerRepository;

@Service
public class ContactpersoonService {
	@Autowired
	ContactpersoonRepository contactpersoonRepository;
	@Autowired
	MedewerkerRepository medewerkerRepository;


	//	Tam Bezig
		
	//	public void addContactpersoonGebruiker(Long medewerkerId, Long opdrachtgeverId) {
//		Gebruiker gebruiker = contactpersoonRepository.findById(medewerkerId).get();
//		Opdrachtgever opdrachtgever = contactpersoonRepository.findById(opdrachtgeverId).get();
//		gebruiker.setOwner(opdrachtgever);
//		contactpersoonRepository.save(gebruiker);
//		System.out.println("Opdrachtgever toegevoegd aan werknemer.");
//	}
	
	public void deleteGebruiker(Long userId){
		contactpersoonRepository.deleteById(userId);
	}
	
	public void addGebruiker(Contactpersoon contactpersoon) {
		contactpersoonRepository.save(contactpersoon);
	}
	
	public Optional<Medewerker> findById(Long id){
		Optional<Medewerker> result = medewerkerRepository.findById(id);
		return result;
	}
	public Iterable <Contactpersoon> findAll(){
		Iterable <Contactpersoon> result = contactpersoonRepository.findAll();
		return result;
	}
}
