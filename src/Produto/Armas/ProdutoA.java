package Armas;

public class ProdutoA extends Acessórios.Produto {
	protected String calibre;
	protected int capacidade;	
	protected String açao;
	protected String categoria;
	
	public ProdutoA(String nome,double estrelas,double preço,String descriçao,String marca,String calibre,int capacidade,String açao,String categoria) {
		
		super(nome,estrelas,preço,descriçao,marca);
		this.calibre = calibre;
		this.capacidade = capacidade; 
		this.açao = açao;
		this.categoria = categoria;
		
	}
	public String getAçao() {
		return açao;
	}
	public void setAçao(String açao) {
		this.açao = açao;
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
