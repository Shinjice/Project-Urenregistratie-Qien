package nl.qien.uren.urenregistratie.security.service;

import nl.qien.uren.urenregistratie.domein.Gebruiker;
import nl.qien.uren.urenregistratie.security.domain.GebruikerPrincipal;
import nl.qien.uren.urenregistratie.repository.GebruikerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/* Guide on Spring Security authentication with a
 * custom database-backed GebruikerDetailsService:
 * https://www.baeldung.com/spring-security-authentication-with-a-database
 */
@Service
public class GebruikerDetailsService implements UserDetailsService {

    @Autowired
    private GebruikerRepository gebruikerRepository;

    @Override
    public UserDetails loadUserByUsername(String emailAdres) {
        Optional<Gebruiker> gebruikerOptional = this
                .gebruikerRepository
                .findByEmailAdres(emailAdres);

        if (!gebruikerOptional.isPresent()){
            throw new UsernameNotFoundException(emailAdres);
        }
        Gebruiker gebruiker = gebruikerOptional.get();

        return new GebruikerPrincipal(gebruiker);
    }
}
