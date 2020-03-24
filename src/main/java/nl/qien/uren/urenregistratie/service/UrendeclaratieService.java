package nl.qien.uren.urenregistratie.service;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.qien.uren.urenregistratie.domein.Gebruiker;
import nl.qien.uren.urenregistratie.domein.Urendeclaratie;
import nl.qien.uren.urenregistratie.repository.UrendeclaratieRepository;


@Service
public class UrendeclaratieService {
	@Autowired
	private UrendeclaratieRepository urendeclaratieRepository;
	
	
//	public List<GewerkteDag> listAll(){
//		return repo.findAll();
//	}
	
	public void addUrendeclaratie(Urendeclaratie urendeclaratie) {
		urendeclaratieRepository.save(urendeclaratie);
	}
	
	public Urendeclaratie getId(Long idUrendeclaratie) {
		return urendeclaratieRepository.findById(idUrendeclaratie).get();
	}

	public void deleteUrendeclaratie(Long id) {
		urendeclaratieRepository.deleteById(id);
	}
	
//	
//	public Optional<Urendeclaratie> findById(long id){
//		Optional<Urendeclaratie> result = 
//	}
//
//		
//		public Optional<Gebruiker> findById(long id){
//			Optional<Gebruiker> result = gebruikerRepository.findById(id);
//			return result;
//		}
	
	
}




