package CRM.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import CRM.entity.Utenti;

@Repository
public interface UtentiRepository extends CrudRepository<Utenti, Long> {

public Utenti findByNome(String nome);
	
	public Utenti findByNomeAndCognome(String nome, String cognome);
	

	public boolean existsByNome(String nome);
}
