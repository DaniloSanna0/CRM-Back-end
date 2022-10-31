package CRM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CRM.auth.users.User;
import CRM.auth.users.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UtentiController {

	@Autowired
	private UserService utentiService;
	
	@GetMapping
	public List<User> trovaTutti() {
		return utentiService.trovaTutti();
	}
	
	@GetMapping("/{id}")
	public User trovaPerId(@PathVariable Long id) {
		return utentiService.trovaPerId(id);
	}
	
	@GetMapping("/byuserName/{idUserName}")
	public  List<User> trovaPerUserName(@PathVariable Long idUserName) {
		return utentiService.trovaTutti();
	}
	
	@DeleteMapping("/{id}")
	public void cancella(@PathVariable Long id) {
		utentiService.cancella(id);
	}
	
	@PostMapping
	public void crea(@RequestBody User utente) {
		utentiService.crea(utente);
	}
	
	@PutMapping
	public void modifica(@RequestBody User utente) {
		utentiService.modifica(utente);
	}
}
