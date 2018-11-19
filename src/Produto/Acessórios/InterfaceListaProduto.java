package Acessórios;

public interface InterfaceListaProduto {
	
	void CadastrarCatálogo(Produto produto);
	
	void AtualizarDescriçao(String nome, String novadescriçao);
	
	void AtualizarEstrelas(String nome, double novavaliação);
	
}
