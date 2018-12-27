package com.example.demo.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;
@Component
public class CustomUserDetailsService implements UserDetailsService  {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		   Boolean accountNonExpired = true; 
		   Boolean credentialsNonExpired = true;
		   Boolean accountNonLocked = true;
		System.out.println("EXECUTED !");
		User user = userRepository.findByUsername(username);
		UserDetails userDetails = new  org.springframework.security.core.userdetails.User(username, 
																				   		  user.getPassword(), 
																				          user.getEnable(), 
																				          accountNonExpired, 
																				          credentialsNonExpired, 
																				          accountNonLocked, 
																				          getAuthorities(user.getRoles()));
		
		return userDetails;
	}
	
	private Collection<? extends GrantedAuthority> getAuthorities(List<Role> roles) {
		
		Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
		for (Role role : roles) {
			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getName());/* ROLE_USER, ROLE_ADMIN */
			grantedAuthorities.add(grantedAuthority);
		}
		return grantedAuthorities;
	}

}
