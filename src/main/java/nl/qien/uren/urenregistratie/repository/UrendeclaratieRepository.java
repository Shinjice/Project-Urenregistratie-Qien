package nl.qien.uren.urenregistratie.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import nl.qien.uren.urenregistratie.domein.Gebruiker;
import nl.qien.uren.urenregistratie.domein.Urendeclaratie;


public interface UrendeclaratieRepository extends JpaRepository<Urendeclaratie, Long>{

	


}
