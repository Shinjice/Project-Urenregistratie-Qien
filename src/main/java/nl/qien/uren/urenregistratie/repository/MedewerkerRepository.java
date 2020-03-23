package nl.qien.uren.urenregistratie.repository;

import org.springframework.data.repository.CrudRepository;

import nl.qien.uren.urenregistratie.domein.Contactpersoon;
import nl.qien.uren.urenregistratie.domein.Medewerker;

public interface MedewerkerRepository extends CrudRepository<Medewerker, Long>{

}
