package CRM.repository;

import org.springframework.data.repository.CrudRepository;

import CRM.entity.Utenti;

public interface UtentiRepository extends CrudRepository<Utenti, Long> {

public Utenti findByNome(String nome);
	
	public Utenti findByNomeAndCognome(String nome, String cognome);
	

	public boolean existsByNome(String nome);
}
