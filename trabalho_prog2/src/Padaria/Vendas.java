package Padaria;

public abstract class Vendas{ // Estoque

	protected String dataVenda;
	protected String cpfVendedor;
	protected String formaPagamento;
	protected String cpfCliente;
	protected Produtos [] carrinhoCompras = new Produtos [20];
	protected double valorTotalDoCarrinho = 0;
	protected int tamanhoDoCarrinho = 0;

	public Vendas(String dataVenda, String cpfVendedor, String formaPagamento, String cpfCliente) {

		this.dataVenda = dataVenda;
		this.cpfVendedor = cpfVendedor;
		this.formaPagamento = null;
		//this.carrinhoPrecos = new double[20];
		//setCpfCliente(cpfCliente);
	}

	public String getCpfCliente() {
		return this.cpfCliente;
	}

	/*public void setCpfCliente(String novoCpf) {

		boolean clienteEncontrado = false;

		for (int i = 0; i < padaria.getCliente().length; i++) {
			if (padaria.getCliente()[i].getCpf().equalsIgnoreCase(novoCpf)) {
				System.out.println("Cliente esta cadastrado.");
				clienteEncontrado = true;
			}
		}

		if (clienteEncontrado == false)
			System.out.println("Cliente nao esta cadastrado.");
	}*/

	public String getDataVenda() {
		return this.dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	public String getCpfVendedor() {
		return this.cpfVendedor;
	}

	public void setCpfVendedor(String novoCpf) {
		this.cpfVendedor = novoCpf;
	}

	public String getFormaPagamento() {
		return this.formaPagamento;
	}

	public void setFormaPagamento(String novaFormaPagamento) {
		if (novaFormaPagamento.equalsIgnoreCase("dinheiro") || novaFormaPagamento.equalsIgnoreCase("debito")
				|| novaFormaPagamento.equalsIgnoreCase("credito"))
			this.formaPagamento = novaFormaPagamento;

		else
			while (novaFormaPagamento.equalsIgnoreCase("dinheiro") == false
					|| novaFormaPagamento.equalsIgnoreCase("debito") == false
					|| novaFormaPagamento.equalsIgnoreCase("credito") == false)
				System.out.println("Voce deve colocar debito, credito ou dinheiro. Digite novamente.");
	}

	public double getValorTotalDoCarrinho() {
		return valorTotalDoCarrinho;
	}

	public void setValorTotalDoCarrinho(double valorTotalDoCarrinho) {
		this.valorTotalDoCarrinho = valorTotalDoCarrinho;
	}

	public int getTamanhoDoCarrinho() {
		return tamanhoDoCarrinho;
	}

	public void setTamanhoDoCarrinho(int tamanhoDoCarrinho) {
		this.tamanhoDoCarrinho = tamanhoDoCarrinho;
	}

	public void adicionarProdutoCarrinho(String codigoProduto) {

		boolean encontrouProduto = false; // caso encontre o produto
		boolean carrinhoCheio = false;
		
		for(int i = 0; i < super.produto.length && !encontrouProduto && !carrinhoCheio; i++) {
			
			if(tamanhoDoCarrinho == 20) {
				System.out.println("Abra uma nova venda,o carrinho esta cheio");
				carrinhoCheio = true;
			}
			
			else
				if(super.produto[i].getCodigo().equalsIgnoreCase(codigoProduto)){		
					
					valorTotalDoCarrinho += super.produto[i].getPrecoFinal(); //Adiciona no carrinho o valor do produto
					
					super.produto[i].setQuantidade(super.produto[i].getQuantidade() - 1); //Retira uma unidade do produto
					
					tamanhoDoCarrinho++; // adiciona um novo produto no carrinho, ele nao pode ultrapassar 20 produtos
					
					encontrouProduto = true; // produto foi encontrado
					
					if (super.produto[i].getQuantidade() == 1) // Se caso, a quantidade total do produto for igual a 1, enviar mensagem.
						System.out.println("Possui apenas 1 produto, favor reabastecer. ");
				}
		}
		
	}

	public abstract double carrinhoTotal();
}