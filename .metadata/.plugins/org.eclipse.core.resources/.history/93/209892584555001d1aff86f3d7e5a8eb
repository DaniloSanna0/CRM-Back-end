package CRM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CRM.auth.users.User;
import CRM.auth.users.UserRepository;
@Service
public class UtentiService {
	
	@Autowired
	private UserRepository utentiRepository;

	public List<User> trovaTutti() {
		return (List<User>) utentiRepository.findAll();
	}

	
	public User trovaPerId(Long id) {
		return utentiRepository.findById(id).get();
	}

	
	public void cancella(Long id) {
		utentiRepository.deleteById(id);
		
	}

	
	public void crea(User utenti) {
		utentiRepository.save(utenti);
		
	}

	
	public void modifica(User utenti) {
		utentiRepository.save(utenti);
				
	}
	

}
