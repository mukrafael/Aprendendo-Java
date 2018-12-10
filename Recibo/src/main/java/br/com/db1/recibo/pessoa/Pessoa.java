package br.com.db1.recibo.pessoa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "Pessoa")
public class Pessoa {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome", length = 50, nullable = false )
	private String nome;
	
	@Column(name = "documento", length = 14, nullable = false)
	private String documento;

}
