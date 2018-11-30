package Produto;


public class Produto {
	protected String nome;
	protected double estrelas; //avaliação
	protected double preco;
	protected String descricao;
	protected String marca; //fabricante 
	protected String numserie;
	
	public Produto(String nome, double estrelas, double preco, String descricao, String marca, String numserie) {
		this.nome = nome;
		this.estrelas = estrelas;
		this.preco = preco;
		this.descricao = descricao;
		this.marca = marca;
		this.numserie = numserie;
	}
	
	public String getNumserie() {
		return numserie;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getEstrelas() {
		return estrelas;
	}
	public void setEstrelas(double estrelas) {
		this.estrelas = estrelas;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
