package br.com.db1.recibo.recibo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.db1.recibo.pessoa.Pessoa;

@Entity
@Table (name = "Recibo")
public class Recibo {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name ="valor", precision = 14, scale = 2, nullable = false)
	private Double valor;
	
	@Column(name = "dataEmissao", length = 8, nullable = false)
	private Date dataEmissao;
	
	@ManyToOne
	@JoinColumn(name="prestador_fk", referencedColumnName="id", nullable=false)
	private Pessoa pessoa;
	
	@ManyToOne
	@JoinColumn(name="emitente_fk", referencedColumnName="id", nullable=false)
	private Recibo recibo;
	
}
