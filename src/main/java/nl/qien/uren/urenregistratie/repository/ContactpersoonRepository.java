package nl.qien.uren.urenregistratie.repository;

import org.springframework.data.repository.CrudRepository;

import nl.qien.uren.urenregistratie.domein.Contactpersoon;

public interface ContactpersoonRepository extends CrudRepository<Contactpersoon, Long> {

}
