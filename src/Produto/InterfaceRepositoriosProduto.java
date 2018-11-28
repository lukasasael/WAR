

public interface InterfaceRepositoriosProduto {
	
	void CadastrarCatalogo(Produto produto);
	
	void RemoverCatalogo(String nome);
	
	Produto Procurar(String nome);
	
	boolean Existe(String nome);
	
	void Atualizarpre�o(String nome, double novopre�o);
	
	void AtualizarDescri�ao(String nome, String novadescri�ao);
	
	void AtualizarEstrelas(String nome, double novavalia��o);
	
}
