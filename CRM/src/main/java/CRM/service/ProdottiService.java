package CRM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CRM.entity.Prodotti;
import CRM.repository.ProdottiRepository;

@Service
public class ProdottiService {

	@Autowired
	private ProdottiRepository prodottiRepository;

	public List<Prodotti> trovaTutti() {
		return (List<Prodotti>) prodottiRepository.findAll();
	}

	
	public Prodotti trovaPerId(Long id) {
		return prodottiRepository.findById(id).get();
	}

	
	public void cancella(Long id) {
		prodottiRepository.deleteById(id);
		
	}

	
	public void crea(Prodotti prodotti) {
		prodottiRepository.save(prodotti);
		
	}

	
	public void modifica(Prodotti prodotti) {
		prodottiRepository.save(prodotti);
				
	}
	

}
