package app.builder;

import org.springframework.security.core.userdetails.UserDetails;

import app.models.User;

public class UserDetailsBuilder {
	
	public static UserDetails build(User user){
		return new UserDetailsProxy(user);
	}

}
