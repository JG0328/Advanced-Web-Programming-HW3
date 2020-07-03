package com.pucmm.docker.Config;

import com.pucmm.docker.Services.CustomUserDetailsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private CustomUserDetailsServices customUserDetailsServices;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        auth
                .userDetailsService(customUserDetailsServices)
                .passwordEncoder(bCryptPasswordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/css/**", "/js/**", "/actuator/**").permitAll()
                .antMatchers("/dbconsole/**").permitAll()
                .antMatchers("/admin/**").hasAnyRole("ADMIN")
                .antMatchers("/barcamp/**").hasAnyRole("ADMIN", "USER")
                .antMatchers(HttpMethod.POST, "/**").permitAll()
                .antMatchers(HttpMethod.PUT, "/barcamp/**").permitAll()
                .antMatchers(HttpMethod.PATCH, "/barcamp/**").permitAll()
                .anyRequest().permitAll()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }
}
