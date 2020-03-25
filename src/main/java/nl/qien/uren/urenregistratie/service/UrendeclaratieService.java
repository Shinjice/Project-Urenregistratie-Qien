package nl.qien.uren.urenregistratie.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.qien.uren.urenregistratie.domein.GewerkteDag;
import nl.qien.uren.urenregistratie.domein.Urendeclaratie;
import nl.qien.uren.urenregistratie.repository.UrendeclaratieRepository;

@Service
@Transactional
public class UrendeclaratieService {
	@Autowired
	private UrendeclaratieRepository urendeclaratieRepository;
	
	// deze tegevoed om gewerkte dag findbyid bij te kunnen bij methode addBestaandeGewerktedagUrendeclaratie
	@Autowired
	private GewerkteDagService gewerkteDagService;
	
	//added
	public void addUrendeclaratie(Urendeclaratie urendeclaratie) {
	    for (GewerkteDag dag : urendeclaratie.getGewerkteDagen()) {
	    	this.gewerkteDagService.save(dag);
		}
		urendeclaratieRepository.save(urendeclaratie);
	}
	
	//added voegt een gewerktedag aan de lijst van urendeclaratie
	public void addNieuweGewerktedagUrendeclaratie(GewerkteDag gewerkteDag, Long idUrendeclaratie) {
		Urendeclaratie urendeclaratie = findById(idUrendeclaratie).get();
		urendeclaratie.addGewerkteDag(gewerkteDag);
		}
	
	//added
	public void addBestaandeGewerktedagUrendeclaratie(Long idGewerkteDag, Long idUrendeclaratie) {
		Urendeclaratie urendeclaratie = findById(idUrendeclaratie).get();
		GewerkteDag gewerktedag =gewerkteDagService.findById(idGewerkteDag).get();
		urendeclaratie.addGewerkteDag(gewerktedag);
		urendeclaratieRepository.save(urendeclaratie);
		}

	
	//gedeelte voorbeeld test 
	public void test(GewerkteDag gewerkteDag) {
		
	}
	
	//added
	public Optional<Urendeclaratie> findById(Long id){
		Optional<Urendeclaratie> result = urendeclaratieRepository.findById(id);
		return result;
	}
}

