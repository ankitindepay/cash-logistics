package com.logistic.indepay.service;

import com.logistic.indepay.model.User;
import com.logistic.indepay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        if(user == null)
        {
            throw new UsernameNotFoundException("Email "+email+" not found");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),grantedAuthorities(user));
    }

    private Collection<GrantedAuthority> grantedAuthorities(User user)
    {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        if(user.getRole().getName().equalsIgnoreCase("admin"))
        {
            authorities.add(new SimpleGrantedAuthority("ROLE ADMIN"));
        }
        authorities.add(new SimpleGrantedAuthority("ROLE USER"));
        return authorities;
    }
}
