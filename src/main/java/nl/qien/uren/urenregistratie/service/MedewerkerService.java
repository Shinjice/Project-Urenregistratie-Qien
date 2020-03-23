package nl.qien.uren.urenregistratie.service;

import javax.transaction.Transactional;

import nl.qien.uren.urenregistratie.domein.Medewerker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.qien.uren.urenregistratie.repository.MedewerkerRepository;

@Service
@Transactional
public class MedewerkerService {
	@Autowired
	MedewerkerRepository medewerkerRepository;

	public Iterable<Medewerker> findAllByOpdrachtgever(Long opdrachtgeverID) {
		return this.medewerkerRepository.findAllByOpdrachtgever(opdrachtgeverID);
	}
}
