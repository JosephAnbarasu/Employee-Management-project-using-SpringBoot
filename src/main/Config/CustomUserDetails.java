package com.employee.management.config;

	import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.employee.management.model.User;


	public class CustomUserDetails implements UserDetails {

	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private User user;

	    public CustomUserDetails(User user) {
	        super();
	        this.user = user;
	    }
//
//	    @Override
//	    public Collection<? extends GrantedAuthority> getAuthorities() {
//	        // Assuming the role is prefixed with "ROLE_" (standard Spring Security convention)
//	        return Collections.singleton(new SimpleGrantedAuthority("ROLE_" + user.getRole()));
//	    }

	    @Override
	    public Collection<? extends GrantedAuthority> getAuthorities() {
	        String role = user.getRole(); // Assuming getRole() returns the role as a String
	        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role);
	        
	        return Collections.singletonList(authority);
	    }

	    @Override
	    public String getPassword() {
	        return user.getPassword();
	    }

	    @Override
	    public String getUsername() {
	        return user.getUsername();
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

