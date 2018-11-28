

public class RepostitorioArrayProduto implements InterfaceListaProduto {
	private Produto[] arrayProduto = new Produto[1000];
	private int contador = 0;


	public void cadastrarCatalogo(Produto produto) {
		while(this.arrayProduto[contador] !=null) {
			if(this.contador != this.arrayProduto.length-1)
			contador++;
			else
			contador = -1;
		}
		if(contador != -1) {
			this.arrayProduto[contador] = produto;
			contador = 0;
		}else{
			System.out.println("Acabou o Array");
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

	@Override
	public Produto Procurar(String nome) {
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

	@Override
	public boolean Existe(String nome) {
		boolean resposta = false;
		for (int i = 0; i < this.contador && !resposta; i++) {
			if (this.arrayCliente[i].getCpf().equals(cpf)) {
				resposta = true;
			}
		}
		return resposta;
	}

	@Override
	public void AtualizarDescriçao(String nome, String novadescriçao) {
		int indice = this.getIndice(cliente.getCpf());
		arrayCliente[indice] = cliente;
		
	}

	@Override
	public void AtualizarEstrelas(String nome, double novavaliação) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CadastrarCatalogo(Produto produto) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
//	public int getIndice(String cpf) throws ClienteNaoEncontradoException {
//	int resposta = 0;
//	boolean jaAchou = false;
//	for (int i = 0; i < this.contador && !jaAchou; i++) {
//		if (this.arrayCliente[i].getCpf().equals(cpf)) {
//			resposta = i;
//			jaAchou = true;
//		}
//	}
//	if (jaAchou) {
//		return resposta;
//	} else {
//		ClienteNaoEncontradoException e;
//		e = new ClienteNaoEncontradoException();
//		throw e;
//	}
//}
}
