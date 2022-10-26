package CRM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CRM.entity.Utenti;
import CRM.repository.UtentiRepository;
@Service
public class UtentiService {
	
	@Autowired
	private UtentiRepository utentiRepository;

	public List<Utenti> trovaTutti() {
		return (List<Utenti>) utentiRepository.findAll();
	}

	
	public Utenti trovaPerId(Long id) {
		return utentiRepository.findById(id).get();
	}

	
	public void cancella(Long id) {
		utentiRepository.deleteById(id);
		
	}

	
	public void crea(Utenti utenti) {
		utentiRepository.save(utenti);
		
	}

	
	public void modifica(Utenti utenti) {
		utentiRepository.save(utenti);
				
	}
	

}
