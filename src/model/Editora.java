package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Editora implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "seq_Editora" )
	@SequenceGenerator( name = "seq_editora", sequenceName = "idEditora", allocationSize = 1 )
	private Long id;
	@Column( length = 50, nullable = false )
	private String nome;
	@Column( length = 50, nullable = false )
	private String sede;
	
	public Editora( String nome, String sede ) {
		this.nome = nome;
		this.sede = sede;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}
	
	public String toString() {
		return "Nome: " + getNome() +
				"\nSede: " + getSede();
	}
}
