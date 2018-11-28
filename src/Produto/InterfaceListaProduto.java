

public interface InterfaceListaProduto {
	
	void CadastrarCatalogo(Produto produto);
	
	void RemoverCatalogo(String nome);
	
	Produto Procurar(String nome);
	
	boolean Existe(String nome);
	
	void AtualizarDescriçao(String nome, String novadescriçao);
	
	void AtualizarEstrelas(String nome, double novavaliação);
	
}
