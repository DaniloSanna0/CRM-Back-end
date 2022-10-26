package CRM.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import CRM.auth.users.User;


@Repository
public interface UtentiRepository extends CrudRepository<User, Long> {

public User findByUsername(String username);
	
	public User findByUsernameAndCognome(String username, String cognome);
	

	public boolean existsByUsername(String username);
}
