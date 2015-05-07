package it.uniroma3.model;
	
import javax.persistence.*;

import java.util.*;

import java.util.Date;

@Entity
@Table(name = "Tabella_Ordini")
@NamedQuery(name = "findAllOrdini", query = "SELECT o FROM Ordine o")
public class Ordine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationTime;

	@ManyToOne
	private Cliente cliente;

	@OneToMany(mappedBy = "ordine", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private List<RigaOrdine> righeOrdine;

	public Ordine() {}

	// Getters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<RigaOrdine> getRigaOrdine() {
		return righeOrdine;
	}

	public void setRigheOrdini(List<RigaOrdine> righeOrdine) {
		this.righeOrdine = righeOrdine;
	}



}
