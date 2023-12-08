package tiagoribeirosantos.sistemaprodutos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "products")
public class Produto {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="qtd")
	private int qtd;
	
	@Column(name="nomeProduto",length = 30)
	@NotBlank
	private String nome;

	@Column(name="preco")
	@Min(0)
	private double preco;
	
	@Column(name="desconto")
	@Min(0)
	@Max(1)
	private double desconto;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Produto(int qtd, String nome, double preco, double desconto) {
		super();
		this.qtd = qtd;
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	
	public Produto() {
		
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
}
