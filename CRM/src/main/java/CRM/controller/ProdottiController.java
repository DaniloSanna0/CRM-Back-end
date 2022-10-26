package CRM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CRM.entity.Prodotti;
import CRM.service.ProdottiService;

@RestController
@RequestMapping("/prodotti")
@CrossOrigin(origins = "http://localhost:4200")
public class ProdottiController {
	@Autowired
	private ProdottiService prodottiService;
	
	@GetMapping
	public List<Prodotti> trovaTutti() {
		return prodottiService.trovaTutti();
	}
	
	@GetMapping("/{id}")
	public Prodotti trovaPerId(@PathVariable Long id) {
		return prodottiService.trovaPerId(id);
	}
	
	@GetMapping("/bynome/{idNome}")
	public  List<Prodotti> trovaPerNome(@PathVariable Long idNome) {
		return prodottiService.trovaTutti();
	}
	
	@DeleteMapping("/{id}")
	public void cancella(@PathVariable Long id) {
		prodottiService.cancella(id);
	}
	
	@PostMapping
	public void crea(@RequestBody Prodotti prodotto) {
		prodottiService.crea(prodotto);
	}
	
	@PutMapping
	public void modifica(@RequestBody Prodotti prodotto) {
		prodottiService.modifica(prodotto);
	}

}
