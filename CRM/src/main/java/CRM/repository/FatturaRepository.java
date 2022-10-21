package CRM.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import CRM.entity.Fattura;

@Repository
public interface FatturaRepository extends CrudRepository<Fattura, Long> {
	
	public Fattura findByCliente(String cliente);
	
	public Optional<Fattura> findById(Long Id);
	

	public boolean existsByCliente(String cliente);

}
