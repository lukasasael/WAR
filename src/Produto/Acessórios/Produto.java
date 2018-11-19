package Acess�rios;

public class Produto {
	protected String nome;
	protected double estrelas; //avalia��o
	protected double pre�o;
	protected String descri�ao;
	protected String marca; //fabricante 
	
	
	
	public Produto(String nome, double estrelas, double pre�o, String descri�ao, String marca) {
		this.nome = nome;
		this.estrelas = estrelas;
		this.pre�o = pre�o;
		this.descri�ao = descri�ao;
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
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescri�ao() {
		return descri�ao;
	}
	public void setDescri�ao(String descri�ao) {
		this.descri�ao = descri�ao;
	}
}
