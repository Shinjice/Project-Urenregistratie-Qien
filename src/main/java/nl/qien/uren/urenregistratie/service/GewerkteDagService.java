package nl.qien.uren.urenregistratie.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.qien.uren.urenregistratie.domein.GewerkteDag;
import nl.qien.uren.urenregistratie.repository.GewerkteDagRepository;

@Service
@Transactional
public class GewerkteDagService {
	@Autowired
	GewerkteDagRepository gewerkteDagRepository;
	
	public void addDag(GewerkteDag gewerkteDag) {
		gewerkteDagRepository.save(gewerkteDag);
	}
	public Iterable <GewerkteDag> findAll(){
		Iterable <GewerkteDag> result = gewerkteDagRepository.findAll();
		return result;
	}

	
}
