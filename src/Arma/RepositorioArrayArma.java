package Arma;
import Produto.Produto;

public class RepositorioArrayArma implements InterfaceRepositoriosArma {
	private Arma[] arrayArma = new Arma[1000];

	public void CadastrarCatalogo(Arma arma) {
		for(int c=0;c<arrayArma.length;c++) {
			if(arrayArma[c] == null) {
				this.arrayArma[c] = arma;
				break;
			}
		}
	}
	
	public void RemoverCatalogo(String nome) {
		for(int c=0;c<arrayArma.length;c++) {
			if(arrayArma[c].getNome().equals(nome)) {
				for (int i = c; i < arrayArma.length; i++) {
					if(arrayArma[i]!=null)
						arrayArma[i] = arrayArma [i+1];
					else
					break;
				}
			}
			else if(arrayArma[c]==null){
				System.out.println("Produto nao encontrado");
			}
		}
	}

	public Produto Procurar(String nome) {
		Produto a = null;
		for(int c=0;c<arrayArma.length && a==null;c++) {
			if(arrayArma[c].getNome().equals(nome)) {
				a = arrayArma[c];
			}
			else if(arrayArma[c]==null){
				System.out.println("Produto nao encontrado");
				a = null;
			}
		}
		return a;
	}

	public boolean Existe(String nome) {
		boolean a = false;
		for(int c=0;c<arrayArma.length && a==false;c++) {
			if(arrayArma[c].getNome().equals(nome)) {
				a = true;
			}
			else if(arrayArma[c]==null){
				System.out.println("Produto nao encontrado");
				a = false;
			}
		}
		return a;
	}

	public void AtualizarDescricao(String nome, String novadescricao) {
		for(int c=0;c<arrayArma.length;c++) {
			if(arrayArma[c].getNome().equals(nome)) {
				arrayArma[c].setDescricao(novadescricao);
			}
			else if(arrayArma[c]==null){
				System.out.println("Produto nao encontrado");
			}
		}
	}

	public void AtualizarEstrelas(String nome, double novavaliacao) {
		for(int c=0;c<arrayArma.length;c++) {
			if(arrayArma[c].getNome().equals(nome)) {
				double x = arrayArma[c].getEstrelas();
				arrayArma[c].setEstrelas((x + novavaliacao)/2);
			}
			else if(arrayArma[c]==null){
				System.out.println("Produto nao encontrado");
			}
		}	
	}

	public void Atualizarpreco(String nome, double novopreço) {
		for(int c=0;c<arrayArma.length;c++) {
			if(arrayArma[c].getNome().equals(nome)) {
				arrayArma[c].setPreco(novopreço);
			}
			else if(arrayArma[c]==null){
				System.out.println("Produto nao encontrado");
			}
		}	
		
	}
}