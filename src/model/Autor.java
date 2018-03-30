package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Autor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "seq_Autor" )
	@SequenceGenerator( name = "seq_autor", sequenceName = "idAutor", allocationSize = 1 )
	private Long id;
	@Column( length = 50, nullable = false )
	private String nome;
	@Column( nullable = false )
	private Date dataNascimento;
	@Column
	private String nacionalidade;
	
	public Autor( String nome, Date dataNascimento, String nacionalidade ) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.nacionalidade = nacionalidade;
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public String toString() {
		return "Nome: "+ getNome() +
			"\n Data Nascimento: " + getDataNascimento() +
			"\n Nacionalidade: " + getNacionalidade();
	}
	
	

}
