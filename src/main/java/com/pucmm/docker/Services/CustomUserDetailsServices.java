package com.pucmm.docker.Services;

import com.pucmm.docker.Entities.AppRole;
import com.pucmm.docker.Entities.AppUser;
import com.pucmm.docker.Repositories.AppRolesRepository;
import com.pucmm.docker.Repositories.AppUsersRepository;
import com.pucmm.docker.Repositories.FormsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CustomUserDetailsServices implements UserDetailsService {
    @Autowired
    private AppUsersRepository appUsersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = appUsersRepository.findByUsername(username);

        Set<GrantedAuthority> roles = new HashSet<>();
        for (AppRole appRole : appUser.getAppRoles()) {
            roles.add(new SimpleGrantedAuthority(appRole.getRole()));
        }

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>(roles);
        return new User(appUser.getUsername(), appUser.getPassword(), appUser.getActive(), true, true, true, grantedAuthorities);
    }
}
