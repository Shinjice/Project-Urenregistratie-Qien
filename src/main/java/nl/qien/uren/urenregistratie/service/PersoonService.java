package nl.qien.uren.urenregistratie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.qien.uren.urenregistratie.domein.Persoon;
import nl.qien.uren.urenregistratie.repository.PersoonRepository;


@Service
@Transactional
public class PersoonService {
	@Autowired
	PersoonRepository persoonRepository;
	
	public void addPersoon(Persoon persoon) {
		persoonRepository.save(persoon);
	}

	public Iterable <Persoon> findAll(){
		Iterable <Persoon> result = persoonRepository.findAll();
		return result;
	}
	
}
