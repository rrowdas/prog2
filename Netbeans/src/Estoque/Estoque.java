package Estoque;

public class Estoque {

	protected Produtos[] produto = new Produtos[50];

	public Produtos[] getTodosProdutos() {
		return produto;
	}

	public boolean consultaProduto(String codigoProduto) {
		boolean existe = false;

		for (int i = 0; i < produto.length && !existe; i++)
			if (produto[i] != null && produto[i].getCodigo().equalsIgnoreCase(codigoProduto)) {
				System.out.println("Esse código já foi cadastro");
				existe = true;
			}

		return existe;
	}
	
	
	public void cadastrarProduto(Produtos novoProduto) {
		boolean cadastrado = consultaProduto(novoProduto.getCodigo());

		for (int i = 0; i < produto.length && !cadastrado; i++) {
			if (produto[i] == null) {
				System.out.println("Foi cadastrado");
				produto[i] = novoProduto;
				cadastrado = true;
			}
		}
		if (cadastrado == false)
			System.out.println("Não foi possível cadastrar");
	}

	public void removerProduto(String codigoProduto) {

		
		boolean removido = false;

		for (int i = 0; i < produto.length && !removido; i++)
			if (produto[i] != null && produto[i].getCodigo().equalsIgnoreCase(codigoProduto)) {
				System.out.println("O Fornecedor " + produto[i].getNome() + " foi removido.");
				produto[i] = null;
				removido = true;
			}
		if(removido == false)
			System.out.println("O produto nao foi encontrado, codigo invalido");
			
	}

	public void controleProduto(Produtos produtoControlado) {
		if(produtoControlado.getQuantidade() == 1) 
			System.out.println("Alerta, resta apenas 1 produto no estoque, favor reabastecer");
		else if(produtoControlado.getQuantidade() == 0) {
			System.out.println("Produto esgotado");
		}
	}
}