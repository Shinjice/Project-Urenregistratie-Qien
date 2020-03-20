package nl.qien.uren.urenregistratie;

import nl.qien.uren.urenregistratie.service.GebruikerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ApplicationSecurity extends WebSecurityConfigurerAdapter {
    @Autowired
    public void initialize(AuthenticationManagerBuilder builder, GebruikerDetailsService gebruikerDetailsService) {
        try {
            builder.userDetailsService(gebruikerDetailsService);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
