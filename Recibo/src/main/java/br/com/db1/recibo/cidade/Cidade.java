package br.com.db1.recibo.cidade;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "cidade")
public class Cidade {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome", length = 60, nullable = false )
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "uf", length = 2, nullable = false)
	private Uf uf;
	
	protected Cidade () {
		
	}
	
	public Cidade(String nome, Uf uf) {
		this.nome = nome;
		this.uf = uf;
	}
	
	public void alteraNome (String nome) {
		this.nome = nome;
	}
}
