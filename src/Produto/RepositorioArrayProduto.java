
public class RepositorioArrayProduto implements InterfaceRepositoriosProduto {
	private Produto[] arrayProduto = new Produto[1000];

	public void CadastrarCatalogo(Produto produto) {
		for(int c=0;c<arrayProduto.length;c++) {
			if(arrayProduto[c] == null) {
				this.arrayProduto[c] = produto;	
			}
		}
	}
	
	public void RemoverCatalogo(String nome) {
		for(int c=0;c<arrayProduto.length;c++) {
			if(arrayProduto[c].getNome().equals(nome)) {
				int b = c;
				for (int i = 1; i < (arrayProduto.length - b); i++) {
					arrayProduto[b] = arrayProduto [b + 1];
					b++;
				}
			}
			else {
				System.out.println("Produto não encontrado");
			}
		}
	}

	public Produto Procurar(String nome) {
		Produto a = null;
		for(int c=0;c<arrayProduto.length;c++) {
			if(arrayProduto[c].getNome().equals(nome)) {
				a = arrayProduto[c];
			}
			else {
				System.out.println("Produto não encontrado");
				a = null;
			}
		}
		return a;
	}

	public boolean Existe(String nome) {
		boolean a = false;
		for(int c=0;c<arrayProduto.length;c++) {
			if(arrayProduto[c].getNome().equals(nome)) {
				a = true;
			}
			else {
				System.out.println("Produto não encontrado");
				a = false;
			}
		}
		return a;
	}

	public void AtualizarDescriçao(String nome, String novadescriçao) {
		for(int c=0;c<arrayProduto.length;c++) {
			if(arrayProduto[c].getNome().equals(nome)) {
				arrayProduto[c].setDescriçao(novadescriçao);
			}
			else {
				System.out.println("Produto não encontrado");
			}
		}
	}

	public void AtualizarEstrelas(String nome, double novavaliação) {
		for(int c=0;c<arrayProduto.length;c++) {
			if(arrayProduto[c].getNome().equals(nome)) {
				double x = arrayProduto[c].getEstrelas();
				arrayProduto[c].setEstrelas((x + novavaliação)/2);
			}
			else {
				System.out.println("Produto não encontrado");
			}
		}	
	}

	public void Atualizarpreço(String nome, double novopreço) {
		for(int c=0;c<arrayProduto.length;c++) {
			if(arrayProduto[c].getNome().equals(nome)) {
				arrayProduto[c].setPreço(novopreço);
			}
			else {
				System.out.println("Produto não encontrado");
			}
		}	
		
	}
}
