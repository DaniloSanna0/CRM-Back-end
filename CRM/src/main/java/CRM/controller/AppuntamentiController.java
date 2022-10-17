package CRM.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import CRM.entity.Appuntamenti;
import CRM.service.GestioneService;


@RestController
@RequestMapping("/appuntamenti")
public class AppuntamentiController {
	
	@Autowired
	@Qualifier("AppuntamentiServiceV1")
	private GestioneService appuntamentiService;
	
	@GetMapping
	public List<Appuntamenti> trovaTutti() {
		return appuntamentiService.trovaTutti();
	}
	
	@GetMapping("/{id}")
	public Appuntamenti trovaPerId(@PathVariable Long id) {
		return appuntamentiService.trovaPerId(id);
	}
	
	@GetMapping("/bytitolo/{idTitolo}")
	public  List<Appuntamenti> trovaPerAutore(Long idTitolo) {
		return appuntamentiService.trovaTutti();
	}
	
	@DeleteMapping("/{id}")
	public void cancella(@PathVariable Long id) {
		appuntamentiService.cancella(id);
	}
	
	@PostMapping
	public void crea(@RequestBody Appuntamenti appuntamento) {
		appuntamentiService.crea(appuntamento);
	}
	
	@PutMapping
	public void modifica(@RequestBody Appuntamenti appuntamento) {
		appuntamentiService.modifica(appuntamento);
	}

}
