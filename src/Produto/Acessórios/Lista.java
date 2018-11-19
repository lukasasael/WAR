package Acess�rios;

public class Lista {
	private Produto produto;
	private Lista proximo;
	
	public Lista() {}
	
	public void CadastrarCat�logo(Produto produto) {
		if(this.produto.getNome()==null) {
			this.produto = produto;
			this.proximo = new Lista();
		}	
		else if(this.produto.getNome()==produto.getNome()) {
			System.out.println("ja existe ot�rio");
		}
		else if(this.proximo!=null){
			this.proximo.CadastrarCat�logo(produto);
		}
	}
	
	
	public void RemoverCat�logo(Produto produto) {
		if(this.produto!=null) {
			if(this.produto.getNome()==produto.getNome()) {
				this.produto = this.proximo.produto;
				this.proximo = this.proximo.proximo;
			}
			else {
				this.proximo.RemoverCat�logo(produto);
			}
		}
		else {
			System.out.println("N�o existem produtos");
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
}



