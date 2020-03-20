package nl.qien.uren.urenregistratie.config;

import nl.qien.uren.urenregistratie.domein.Gebruiker;
import nl.qien.uren.urenregistratie.service.GebruikerService;
import nl.qien.uren.urenregistratie.service.GebruikerDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private GebruikerDetailsService gebruikerDetailsService;

    /* Creates test user with default credentials
     * NOTE: remove in production
     */
    @Autowired
    public void configure(GebruikerService gebruikerService) {
        Gebruiker gebruiker = new Gebruiker();
        gebruiker.setEmailAdres("banaan@eten.nl");
        gebruiker.setWachtwoordHash(passwordEncoder().encode("chiquita"));
        gebruikerService.addGebruiker(gebruiker);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        auth
                .userDetailsService(gebruikerDetailsService)
                .passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic()
                .and()
                .authorizeRequests(authorize -> authorize
                        .antMatchers("/css/**", "/index").permitAll()
                        .antMatchers("/user/**").hasRole("USER")
                );

        http
                .csrf().disable()
                .formLogin().disable();
    }

}
