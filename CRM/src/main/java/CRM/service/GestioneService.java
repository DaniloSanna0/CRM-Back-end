package CRM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import CRM.repository.AppuntamentiRepository;
import CRM.entity.Appuntamenti;

public interface GestioneService{
	
	
	List<Appuntamenti> trovaTutti();

	Appuntamenti trovaPerId(Long id);

	void cancella(Long id);

	void crea(Appuntamenti appuntamenti);

	void modifica(Appuntamenti appuntamenti);
	

}
