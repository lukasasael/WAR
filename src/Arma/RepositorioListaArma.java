package Arma;
import Produto.Produto;

public class RepositorioListaArma implements InterfaceRepositoriosArma {

	private Arma arma;
	private RepositorioListaArma proximo;
	
	public RepositorioListaArma() {}
	
	public void CadastrarCatalogo(Arma arma){
		if(this.arma.getNome()==null) {
			this.arma = arma;
			this.proximo = new RepositorioListaArma();
		}	
		else if(this.arma.getNome()==arma.getNome()) {
			System.out.println("ja existe otario");
		}
		else if(this.proximo!=null){
			this.proximo.CadastrarCatalogo(arma);
		}
	}
	
	public void RemoverCatalogo(String nome) {
		if(this.arma!=null) {
			if(this.arma.getNome().equals(nome)) {
				this.arma = this.proximo.arma;
				this.proximo = this.proximo.proximo;
			}
			else {
				this.proximo.RemoverCatalogo(nome);
			}
		}
		else {
			System.out.println("Nao existem produtos");
		}
	}
	
	public Produto Procurar(String nome) {
		Produto procurado = null;
		if(this.arma!=null) {
			if(this.arma.getNome().equals(nome)) {
				procurado = this.arma;
				return procurado;
			}
			else {
				this.proximo.Procurar(nome);
				return this.proximo.Procurar(nome);
			}
		}
		else {
			System.out.println("Nao existem produtos");
			return procurado;
		}
	}
	
	public boolean Existe(String nome) {
		if(this.arma!=null) {
			if(this.arma.getNome().equals(nome)) {
				return true;
			}
			else {
				return this.proximo.Existe(nome);
			}
		}
		else {
			System.out.println("Nao existem produtos");
			return false;
		}
	}
	
	public void Atualizarpreco(String nome, double novopreco) {
		if(this.arma!=null) {
			if(this.arma.getNome()==nome) {
				this.arma.setPreco(novopreco);
			}
			else if(this.proximo!=null){
				this.proximo.Atualizarpreco(nome, novopreco);
			}
		}
		else {
			System.out.println("Nao existem produtos");
		}
	}
	
	public void AtualizarEstrelas(String nome, double novavaliacao) {
		if(this.arma!=null) {
			if(this.arma.getNome()==nome) {
				double x = this.arma.getEstrelas();
				this.arma.setEstrelas((x + novavaliacao)/2);
			}
			else if(this.proximo!=null){
				this.proximo.Atualizarpreco(nome, novavaliacao);
			} 
		}
		else {
			System.out.println("Nao existem produtos");
		}
	}
	
	public void AtualizarDescricao(String nome, String novadescricao) {
		if(this.arma!=null) {
			if(this.arma.getNome()==nome) {
				this.arma.setDescricao(novadescricao);
			}
			else if(this.proximo!=null){
				this.proximo.AtualizarDescricao(nome, novadescricao);
			}
		}
		else {
			System.out.println("Nao existem produtos");
		}
	}
}
