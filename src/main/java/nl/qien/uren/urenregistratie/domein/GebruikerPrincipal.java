package nl.qien.uren.urenregistratie.domein;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class GebruikerPrincipal implements UserDetails {
    private Gebruiker gebruiker;

    public GebruikerPrincipal(Gebruiker gebruiker) {
        this.gebruiker = gebruiker;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.gebruiker.getWachtwoordHash();
    }

    @Override
    public String getUsername() {
        return this.gebruiker.getEmailAdres();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
