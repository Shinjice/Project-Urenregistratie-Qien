package nl.qien.uren.urenregistratie.security.config;

import nl.qien.uren.urenregistratie.domein.Admin;
import nl.qien.uren.urenregistratie.domein.Gebruiker;
import nl.qien.uren.urenregistratie.service.GebruikerService;
import nl.qien.uren.urenregistratie.security.service.GebruikerDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/* Comprehensive guide on JWT-based authentication and authorisation
 * with Spring Security for RESTful APIs:
 * https://www.toptal.com/java/rest-security-with-jwt-spring-security-and-java
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private GebruikerDetailsService gebruikerDetailsService;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    /* Creates test user with default credentials
     * NOTE: remove in production
     */
    @Autowired
    public void configure(GebruikerService gebruikerService) {
        Gebruiker gebruiker = new Admin();
        gebruiker.setEmailAdres("banaan@eten.nl");
        gebruiker.setWachtwoordHash(passwordEncoder().encode("chiquita"));
        gebruikerService.addGebruiker(gebruiker);
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
                        .antMatchers("/auth-examples/**").hasRole("USER")
                );

        http
                .csrf().disable()
                .formLogin().disable();
    }

}
