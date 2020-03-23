package nl.qien.uren.urenregistratie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.qien.uren.urenregistratie.repository.ContactpersoonRepository;

@Service
public class ContactpersoonService {
	@Autowired
	ContactpersoonRepository contactpersoonRepository;
}
