
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
			System.out.println("ja existe ot�rio");
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
			System.out.println("N�o existem produtos");
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
			System.out.println("N�o existem produtos");
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
			System.out.println("N�o existem produtos");
			return false;
		}
	}
	
	public void Atualizarpre�o(String nome, double novopre�o) {
		if(this.produto!=null) {
			if(this.produto.getNome()==nome) {
				this.produto.setPre�o(novopre�o);
			}
			else if(this.proximo!=null){
				this.proximo.Atualizarpre�o(nome, novopre�o);
			}
		}
		else {
			System.out.println("N�o existem produtos");
		}
	}
	
	public void AtualizarEstrelas(String nome, double novavalia��o) {
		if(this.produto!=null) {
			if(this.produto.getNome()==nome) {
				double x = this.produto.getEstrelas();
				this.produto.setEstrelas((x + novavalia��o)/2);
			}
			else if(this.proximo!=null){
				this.proximo.Atualizarpre�o(nome, novavalia��o);
			}
		}
		else {
			System.out.println("N�o existem produtos");
		}
	}
	
	public void AtualizarDescri�ao(String nome, String novadescri�ao) {
		if(this.produto!=null) {
			if(this.produto.getNome()==nome) {
				this.produto.setDescri�ao(novadescri�ao);
			}
			else if(this.proximo!=null){
				this.proximo.AtualizarDescri�ao(nome, novadescri�ao);
			}
		}
		else {
			System.out.println("N�o existem produtos");
		}
	}
}



