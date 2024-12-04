package ru.chavkin.gp.managerservice.security;


import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.chavkin.gp.managerservice.entity.Authority;
import ru.chavkin.gp.managerservice.repository.CatalogueUserRepository;

/**
 * @author Vladimir Chavkin (vladimirchavkinwork@gmail.com)
 */

@Service
@RequiredArgsConstructor
public class CatalogueUserDetailService implements UserDetailsService {

    private final CatalogueUserRepository catalogueUserRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.catalogueUserRepository.findByUsername(username)
                .map(user -> User.builder()
                        .username(user.getUsername())
                        .password(user.getPassword())
                        .authorities(user.getAuthorities().stream()
                                .map(Authority::getAuthority)
                                .map(SimpleGrantedAuthority::new)
                                .toList())
                        .build())
                .orElseThrow(() -> new UsernameNotFoundException("User %s not found.".formatted(username)));
    }

}
