package nl.qien.uren.urenregistratie.repository;

import org.springframework.data.repository.CrudRepository;

import nl.qien.uren.urenregistratie.domein.Persoon;

public interface PersoonRepository extends CrudRepository<Persoon, Long>{
	
}
