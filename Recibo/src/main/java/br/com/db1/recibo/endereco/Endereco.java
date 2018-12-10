package br.com.db1.recibo.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.db1.recibo.cidade.Cidade;
import br.com.db1.recibo.pessoa.Pessoa;

@Entity
@Table (name = "endereco")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="cidade_id", referencedColumnName="id", nullable=false)
	private Cidade cidade;
	
	@Column(name="logradouro", length = 100, nullable = false)
	private String logradouro;
	
	@Column(name="numero", length = 10, nullable = false)
	private String numero;
	
	@Column(name="complemento", length = 10, nullable = false)
	private String complemento;
	
	
	@Column(name="cep", length = 8, nullable = false)
	private String cep;
	
	@ManyToOne
	@JoinColumn(name="pessoa_id", referencedColumnName="id", nullable=false)
	private Pessoa pessoa;
	
	
	
}
