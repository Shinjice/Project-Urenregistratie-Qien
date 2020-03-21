package nl.qien.uren.urenregistratie.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.qien.uren.urenregistratie.repository.UrendeclaratieRepository;

@Service
@Transactional
public class UrendeclaratieService {
	@Autowired
	UrendeclaratieRepository urendeclaratieRepository;
}
