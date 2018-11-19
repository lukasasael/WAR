package Acessórios;

public class Lista {
	private Produto produto;
	private Lista proximo;
	
	public Lista() {}
	
	public void CadastrarCatálogo(Produto produto) {
		if(this.produto.getNome()==null) {
			this.produto = produto;
			this.proximo = new Lista();
		}	
		else if(this.produto.getNome()==produto.getNome()) {
			System.out.println("ja existe otário");
		}
		else if(this.proximo!=null){
			this.proximo.CadastrarCatálogo(produto);
		}
	}
	
	
	public void RemoverCatálogo(Produto produto) {
		if(this.produto!=null) {
			if(this.produto.getNome()==produto.getNome()) {
				this.produto = this.proximo.produto;
				this.proximo = this.proximo.proximo;
			}
			else {
				this.proximo.RemoverCatálogo(produto);
			}
		}
		else {
			System.out.println("Não existem produtos");
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
}



