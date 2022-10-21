package CRM.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import CRM.entity.Appuntamenti;

@Repository
public interface AppuntamentiRepository extends CrudRepository<Appuntamenti, Long>  {

	public Appuntamenti findByTitolo(String titolo);
	
//	public Appuntamenti findByTitoloAndAutore(String titolo, String autore);
	
	public boolean existsByTitolo(String titolo);
}
