package Acessórios;

public class Produto {
	protected String nome;
	protected double estrelas; //avaliação
	protected double preço;
	protected String descriçao;
	protected String marca; //fabricante 
	
	
	
	public Produto(String nome, double estrelas, double preço, String descriçao, String marca) {
		this.nome = nome;
		this.estrelas = estrelas;
		this.preço = preço;
		this.descriçao = descriçao;
		this.marca = marca;
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
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescriçao() {
		return descriçao;
	}
	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}
}
