package Armas;

public class ProdutoA extends Acess�rios.Produto {
	protected String calibre;
	protected int capacidade;	
	protected String a�ao;
	protected String categoria;
	
	public ProdutoA(String nome,double estrelas,double pre�o,String descri�ao,String marca,String calibre,int capacidade,String a�ao,String categoria) {
		
		super(nome,estrelas,pre�o,descri�ao,marca);
		this.calibre = calibre;
		this.capacidade = capacidade; 
		this.a�ao = a�ao;
		this.categoria = categoria;
		
	}
	public String getA�ao() {
		return a�ao;
	}
	public void setA�ao(String a�ao) {
		this.a�ao = a�ao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCalibre() {
		return calibre;
	}
	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
}
