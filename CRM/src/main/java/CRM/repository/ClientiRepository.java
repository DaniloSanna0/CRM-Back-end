package CRM.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import CRM.entity.Clienti;

@Repository
public interface ClientiRepository extends CrudRepository<Clienti, Long> {

	public Clienti findByNome(String nome);
	
	public Clienti findByNomeAndCognome(String nome, String cognome);
	

	public boolean existsByNome(String nome);
}
