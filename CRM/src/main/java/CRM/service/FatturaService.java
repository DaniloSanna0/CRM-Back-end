package CRM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CRM.entity.Fattura;
import CRM.repository.FatturaRepository;

@Service
public class FatturaService {

	@Autowired
	private FatturaRepository fatturaRepository;

	public List<Fattura> trovaTutti() {
		return (List<Fattura>) fatturaRepository.findAll();
	}

	
	public Fattura trovaPerId(Long id) {
		return fatturaRepository.findById(id).get();
	}

	
	public void cancella(Long id) {
		fatturaRepository.deleteById(id);
		
	}

	
	public void crea(Fattura fattura) {
		fatturaRepository.save(fattura);
		
	}

	
	public void modifica(Fattura fattura) {
		fatturaRepository.save(fattura);
				
	}
	
}
