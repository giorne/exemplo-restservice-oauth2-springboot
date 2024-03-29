package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findOneByEmail(String email);
	
}
