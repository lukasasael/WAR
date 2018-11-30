package Arma;
import Produto.Produto;

public interface InterfaceRepositoriosArma {

	void CadastrarCatalogo(Arma arma);

	void RemoverCatalogo(String nome);

	Produto Procurar(String nome);

	boolean Existe(String nome);

	void Atualizarpreco(String nome, double novopreço);

	void AtualizarDescricao(String nome, String novadescricao);

	void AtualizarEstrelas(String nome, double novavaliacao);

}
