package CRM.entity;

import java.time.LocalDate;

import javax.persistence.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fattura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDate dataEmissione;
	private LocalDate dataScadenza;
	private String numeroFattura;
	private String IVA;
	private boolean pagata;
	@ManyToOne
	private Clienti cliente;
	private Prodotti prodotti;
	
}
