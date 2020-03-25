package nl.qien.uren.urenregistratie.security.api;

import nl.qien.uren.urenregistratie.domein.Gebruiker;
import nl.qien.uren.urenregistratie.security.domain.GebruikerPrincipal;
import nl.qien.uren.urenregistratie.security.service.GebruikerDetailsService;

import nl.qien.uren.urenregistratie.service.GebruikerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth-examples")
public class AuthExamplesEndpoints {
    @Autowired
    private GebruikerDetailsService gebruikerDetailsService;

    @Autowired
    private GebruikerService gebruikerService;

    @GetMapping("/user/{id}")
    public GebruikerPrincipal getGebruikerPrincipal(@PathVariable Long id) {
        Gebruiker gebruiker = this.gebruikerService.findById(id).get();
        return (GebruikerPrincipal) this.gebruikerDetailsService.loadUserByUsername(gebruiker.getEmailAdres());
    }

    @PostMapping
    public String doNothingOnPost() {
        return null;
    }

}
