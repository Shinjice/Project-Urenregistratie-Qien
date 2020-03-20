package nl.qien.uren.urenregistratie.api;

import nl.qien.uren.urenregistratie.service.GebruikerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
public class LoginEndpoints {
    @Autowired
    private GebruikerService gebruikerService;

    @PostMapping
    public String authenticate() {
        return null;
    }
}
