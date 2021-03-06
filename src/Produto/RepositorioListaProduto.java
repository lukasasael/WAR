package Produto;

public class RepositorioListaProduto implements InterfaceRepositoriosProduto {
	private Produto produto;
	private RepositorioListaProduto proximo;
	
	public RepositorioListaProduto() {}
	
	public void CadastrarCatalogo(Produto produto){
		if(this.produto.getNome()==null) {
			this.produto = produto;
			this.proximo = new RepositorioListaProduto();
		}	
		else if(this.produto.getNome()==produto.getNome()) {
			System.out.println("ja existe otario");
		}
		else if(this.proximo!=null){
			this.proximo.CadastrarCatalogo(produto);
		}
	}
	
	public void RemoverCatalogo(String nome) {
		if(this.produto!=null) {
			if(this.produto.getNome().equals(nome)) {
				this.produto = this.proximo.produto;
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
		if(this.produto!=null) {
			if(this.produto.getNome().equals(nome)) {
				procurado = this.produto;
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
		if(this.produto!=null) {
			if(this.produto.getNome().equals(nome)) {
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
		if(this.produto!=null) {
			if(this.produto.getNome()==nome) {
				this.produto.setPreco(novopreco);
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
		if(this.produto!=null) {
			if(this.produto.getNome()==nome) {
				double x = this.produto.getEstrelas();
				this.produto.setEstrelas((x + novavaliacao)/2);
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
		if(this.produto!=null) {
			if(this.produto.getNome()==nome) {
				this.produto.setDescricao(novadescricao);
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



