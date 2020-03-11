package nl.qien.uren.urenregistratie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.qien.uren.urenregistratie.repository.PersoonRepository;

@Service
@Transactional
public class PersoonService {
	@Autowired
	PersoonRepository d;
	
	
}
