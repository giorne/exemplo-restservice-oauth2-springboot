package app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import app.models.Role;
import app.models.User;
import app.repositories.RoleRepository;
import app.repositories.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Bean
	public CommandLineRunner demo(UserRepository repository, RoleRepository roleRepository) {
		return (args) -> {
			
			Role roleUser = new Role("USER");
			roleRepository.save(roleUser);
			List<Role> roles = new ArrayList<Role>(0);
			roles.add(roleUser);
			
			User user = new User("user", "user@email.com", "user", roles);
			repository.save(user);
			System.out.println(user.getRoles().get(0).getAuthority());
			
		};
	}

}
