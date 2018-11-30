package Produto;


public class RepositorioArrayProduto implements InterfaceRepositoriosProduto {
	private Produto[] arrayProduto = new Produto[1000];

	public void CadastrarCatalogo(Produto produto) {
		for(int c=0;c<arrayProduto.length;c++) {
			if(arrayProduto[c] == null) {
				this.arrayProduto[c] = produto;
				break;
			}
		}
	}
	
	public void RemoverCatalogo(String nome) {
		for(int c=0;c<arrayProduto.length;c++) {
			if(arrayProduto[c].getNome().equals(nome)) {
				for (int i = c; i < arrayProduto.length; i++) {
					if(arrayProduto[i]!=null)
					arrayProduto[i] = arrayProduto [i+1];
					else
					break;
				}
			}
			else if(arrayProduto[c]==null){
				System.out.println("Produto nao encontrado");
			}
		}
	}

	public Produto Procurar(String nome) {
		Produto a = null;
		for(int c=0;c<arrayProduto.length && a==null;c++) {
			if(arrayProduto[c].getNome().equals(nome)) {
				a = arrayProduto[c];
			}
			else if(arrayProduto[c]==null){
				System.out.println("Produto nao encontrado");
				a = null;
			}
		}
		return a;
	}

	public boolean Existe(String nome) {
		boolean a = false;
		for(int c=0;c<arrayProduto.length && a==false;c++) {
			if(arrayProduto[c].getNome().equals(nome)) {
				a = true;
			}
			else if(arrayProduto[c]==null){
				System.out.println("Produto nao encontrado");
				a = false;
			}
		}
		return a;
	}

	public void AtualizarDescricao(String nome, String novadescricao) {
		for(int c=0;c<arrayProduto.length;c++) {
			if(arrayProduto[c].getNome().equals(nome)) {
				arrayProduto[c].setDescricao(novadescricao);
			}
			else if(arrayProduto[c]==null){
				System.out.println("Produto nao encontrado");
			}
		}
	}

	public void AtualizarEstrelas(String nome, double novavaliacao) {
		for(int c=0;c<arrayProduto.length;c++) {
			if(arrayProduto[c].getNome().equals(nome)) {
				double x = arrayProduto[c].getEstrelas();
				arrayProduto[c].setEstrelas((x + novavaliacao)/2);
			}
			else if(arrayProduto[c]==null){
				System.out.println("Produto nao encontrado");
			}
		}	
	}

	public void Atualizarpreco(String nome, double novopreço) {
		for(int c=0;c<arrayProduto.length;c++) {
			if(arrayProduto[c].getNome().equals(nome)) {
				arrayProduto[c].setPreco(novopreço);
			}
			else if(arrayProduto[c]==null){
				System.out.println("Produto nao encontrado");
			}
		}	
		
	}
}
