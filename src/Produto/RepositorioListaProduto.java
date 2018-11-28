
public class RepositorioListaProduto implements InterfaceListaProduto {
	private Produto produto;
	private RepositorioListaProduto proximo;
	
	public RepositorioListaProduto() {}
	
	public void CadastrarCatalogo(Produto produto){
		if(this.produto.getNome()==null) {
			this.produto = produto;
			this.proximo = new RepositorioListaProduto();
		}	
		else if(this.produto.getNome()==produto.getNome()) {
			System.out.println("ja existe otário");
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
			System.out.println("Não existem produtos");
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
			System.out.println("Não existem produtos");
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
			System.out.println("Não existem produtos");
			return false;
		}
	}
	
	public void Atualizarpreço(String nome, double novopreço) {
		if(this.produto!=null) {
			if(this.produto.getNome()==nome) {
				this.produto.setPreço(novopreço);
			}
			else if(this.proximo!=null){
				this.proximo.Atualizarpreço(nome, novopreço);
			}
		}
		else {
			System.out.println("Não existem produtos");
		}
	}
	
	public void AtualizarEstrelas(String nome, double novavaliação) {
		if(this.produto!=null) {
			if(this.produto.getNome()==nome) {
				double x = this.produto.getEstrelas();
				this.produto.setEstrelas((x + novavaliação)/2);
			}
			else if(this.proximo!=null){
				this.proximo.Atualizarpreço(nome, novavaliação);
			}
		}
		else {
			System.out.println("Não existem produtos");
		}
	}
	
	public void AtualizarDescriçao(String nome, String novadescriçao) {
		if(this.produto!=null) {
			if(this.produto.getNome()==nome) {
				this.produto.setDescriçao(novadescriçao);
			}
			else if(this.proximo!=null){
				this.proximo.AtualizarDescriçao(nome, novadescriçao);
			}
		}
		else {
			System.out.println("Não existem produtos");
		}
	}
}



