

public interface InterfaceRepositoriosProduto {
	
	void CadastrarCatalogo(Produto produto);
	
	void RemoverCatalogo(String nome);
	
	Produto Procurar(String nome);
	
	boolean Existe(String nome);
	
	void Atualizarpreço(String nome, double novopreço);
	
	void AtualizarDescriçao(String nome, String novadescriçao);
	
	void AtualizarEstrelas(String nome, double novavaliação);
	
}
