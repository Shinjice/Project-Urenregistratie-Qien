package nl.qien.uren.urenregistratie.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import nl.qien.uren.urenregistratie.domein.Gebruiker;

public interface GebruikerRepository extends CrudRepository<Gebruiker, Long>{
	 List<Gebruiker> findByAchternaam(String achternaam);
}
