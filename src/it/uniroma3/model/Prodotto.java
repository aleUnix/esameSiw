package it.uniroma3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Column;

@Entity
@NamedQuery(name = "findAllProdotti", query = "SELECT p FROM Prodotto p")
public class Prodotto {

	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String codice;
	
	@Column(length = 2000)
	private String descrizione;
	
	private Float prezzo;
	
	private Integer qtaMagazzino;

	public Prodotto() {}

	public Prodotto(String nome, String codice, String descrizione, Float prezzo, int qtaMagazzino) {
		this.nome = nome;
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.qtaMagazzino = qtaMagazzino;
	}


	/* Getters and Setters */

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodice() {
		return this.codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Float prezzo) {
		this.prezzo = prezzo;
	}

	public int getQtaMagazzino() {
		return qtaMagazzino;
	}

	public void setQtaMagazzino(int qtaMagazzino) {
		this.qtaMagazzino = qtaMagazzino;
	}

	public boolean equals(Object obj) {
		Prodotto prodotto = (Prodotto)obj;
		return this.getCodice().equals(prodotto.getCodice());
	}

	public int hashCode() {
		return this.codice.hashCode();
	}

	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Prodotto"); 
		sb.append(", nome='").append(nome); 
		sb.append(", codice='").append(codice);
		sb.append(", descrizione='").append(descrizione); 
		sb.append(", prezzo=").append(prezzo); 
		sb.append(", quantit� in Magazzino='").append(qtaMagazzino);

		sb.append("}\n");
		return sb.toString();
	}
}