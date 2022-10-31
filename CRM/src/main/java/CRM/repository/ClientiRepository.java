package CRM.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import CRM.entity.Clienti;

@Repository
public interface ClientiRepository extends CrudRepository<Clienti, Long> {

	public Clienti findByUserName(String userName);
	
	public Clienti findByUserNameAndCognome(String userName, String cognome);
	

	public boolean existsByUserName(String userName);
}
