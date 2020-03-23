package nl.qien.uren.urenregistratie.service;

import nl.qien.uren.urenregistratie.domein.Opdrachtgever;
import nl.qien.uren.urenregistratie.repository.OpdrachtgeverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class OpdrachtgeverService {
    @Autowired
    private OpdrachtgeverRepository opdrachtgeverRepository;

    public Optional<Opdrachtgever> findById(Long opdrachtgeverID) {
        return this.opdrachtgeverRepository.findById(opdrachtgeverID);
    }
}
