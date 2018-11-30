package Produto;


public interface InterfaceRepositoriosProduto {
	
	void CadastrarCatalogo(Produto produto);
	
	void RemoverCatalogo(String nome);
	
	Produto Procurar(String nome);
	
	boolean Existe(String nome);
	
	void Atualizarpreco(String nome, double novopre�o);
	
	void AtualizarDescricao(String nome, String novadescricao);
	
	void AtualizarEstrelas(String nome, double novavaliacao);
	
}
