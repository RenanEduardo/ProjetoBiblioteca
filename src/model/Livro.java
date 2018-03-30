package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;


public class Livro implements Serializable{

	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "seq_Livro" )
	@SequenceGenerator( name = "seq_livro", sequenceName = "idLivro", allocationSize = 1 )
	private Long id;
	@Column( length = 50, nullable = false )
	private String titulo;
	@Column
	private Date dataPublicacao;
	@Column 
	private String genero;
	
	@ManyToOne( optional = false )
	@JoinColumn( name="Editora", foreignKey = @ForeignKey(name="fk_editora") )
	private Editora editora;
	
	@ManyToMany
	@JoinColumn( name="Autor", foreignKey = @ForeignKey( name="fk_autor" ) )
	private Autor autor;
	
	@ManyToMany
	@JoinColumn( name="Leitor", foreignKey = @ForeignKey( name="fk_leitor" ) )
	private Leitor leitor;

	public Livro( String titulo, 
			Date dataPublicacao, 
			String genero, 
			Editora editora, 
			Autor autor, 
			Leitor leitor ) {
		this.titulo = titulo;
		this.dataPublicacao = dataPublicacao;
		this.genero = genero;
		this.editora = editora;
		this.autor = autor;
		this.leitor = leitor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Leitor getLeitor() {
		return leitor;
	}

	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", dataPublicacao=" + dataPublicacao + ", genero=" + genero + ", editora="
				+ editora + ", autor=" + autor + ", leitor=" + leitor + "]";
	}
	
	
}
