package nl.qien.uren.urenregistratie.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.qien.uren.urenregistratie.domein.Gebruiker;
import nl.qien.uren.urenregistratie.repository.GebruikerRepository;


@Service
@Transactional
public class GebruikerService {
	@Autowired
	GebruikerRepository gebruikerRepository;
	
	public void addGebruiker(Gebruiker gebruiker) {
		gebruikerRepository.save(gebruiker);
	}
	public Optional<Gebruiker> findById(long id){
		Optional<Gebruiker> result = gebruikerRepository.findById(id);
		return result;
	}
	public Iterable <Gebruiker> findAll(){
		Iterable <Gebruiker> result = gebruikerRepository.findAll();
		return result;
	}
	public void deleteGebruiker(@Valid Gebruiker gebruiker) {
		gebruikerRepository.delete(gebruiker);
	}
	
	
}
