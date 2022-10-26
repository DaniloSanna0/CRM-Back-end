package CRM.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import CRM.entity.Prodotti;

@Repository
public interface ProdottiRepository extends CrudRepository<Prodotti, Long>   {
    public Prodotti findByNome(String nome);
	

	public boolean existsByNome(String nome);

}
