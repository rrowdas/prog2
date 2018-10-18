package Padaria;

public abstract class Vendas extends Estoque { // Estoque

	protected String dataVenda;
	protected String cpfVendedor;
	protected String formaPagamento;
	protected String cpfCliente;
	protected double[] carrinhoPrecos;

	public Vendas(String dataVenda, String cpfVendedor, String formaPagamento, String cpfCliente) {

		this.dataVenda = dataVenda;
		this.cpfVendedor = cpfVendedor;
		this.formaPagamento = null;
		this.carrinhoPrecos = new double[20];
		setCpfCliente(cpfCliente);
	}

	public String getCpfCliente() {
		return this.cpfCliente;
	}

	public void setCpfCliente(String novoCpf) {

		boolean clienteEncontrado = false;

		for (int i = 0; i < cliente.length; i++) {
			if (cliente[i].getCpf.equalsIgnoreCase(novoCpf)) {
				System.out.println("Cliente esta cadastrado.");
				clienteEncontrado = true;
			}
		}

		if (clienteEncontrado == false)
			System.out.println("Cliente nao esta cadastrado.");
	}

	public String getDataVenda() {
		return this.dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	public String getCpfVendedor() {
		return this.cpfVendedor;
	}

	public void setCpfVendedor() {
		this.dataVenda = dataVenda;
	}

	public String getFormaPagamento() {
		return this.formaPagamento;
	}//ARRUMAR

	public void setFormaPagamento(String novaFormaPagamento) {
		if (novaFormaPagamento.equalsIgnoreCase("dinheiro") || novaFormaPagamento.equalsIgnoreCase("debito") || novaFormaPagamento.equalsIgnoreCase("credito"))
			this.formaPagamento = formaPagamento;

		else
			while (novaFormaPagamento.equalsIgnoreCase("dinheiro") == false || novaFormaPagamento.equalsIgnoreCase("debito") == false || novaFormaPagamento.equalsIgnoreCase("credito") == false)
				System.out.println("Voce deve colocar debito, credito ou dinheiro. Digite novamente.");
	}

	public void carrinhoPrecos(String codigo) {

		int guardarPosicaoProduto = -1; // Esse guarda a posição em que o produto se encontra no vetor
		boolean encontrou = false; // caso encontre o produto
		boolean cadastradoNoCarrinho = false; // caso seja cadastrado o produto

		for (int i = 0; i < super.produto.length && !encontrou; i++) { // Esse for serve para encontrar o código do
																		// produto no estoque, caso ele não encontre,
																		// esse código é inválido.
			if (super.produto[i] != null && super.produto[i].equals(codigo)) {
				guardarPosicaoProduto = i;
				encontrou = true;
			} else
				System.out.println("Código não encontrado");
		}

		for (int i = 0; i < carrinhoPrecos.length && encontrou; i++) { // Caso o produto seja encontrado no for acima,
																			// ele poderá ser colocado no carrinho de
																			// vendas para efetuar a compra.
			if (carrinhoPrecos[19] != 0)
				System.out.println("O carrinho está cheio, favor abrir nova venda.");

			else if (carrinhoPrecos[i] == 0 && !cadastradoNoCarrinho) {

				carrinhoPrecos[i] = super.produto[guardarPosicaoProduto].getPrecoFinal(); // TESTAR GETPRECOFINAL,
																							// POIS NÃO SE ENCONTRA COMO
																							// SUGESTÃO DO TAB

				super.produto[i].setQuantidade(super.produto[i].getQuantidade() - 1);

				cadastradoNoCarrinho = true;
				System.out.println("Numeros de produtos no carrinho: " + i);

				if (super.produto[i].getQuantidade() == 1)
					System.out.println("Possui apenas 1 produto, favor reabastecer. ");
			}
		}
	}

	/*public double carrinhoTotal(){

        double valorTotalCompra = 0;

        for(int i = 0; i < carrinhoPrecos.length && carrinhoPrecos[i] != 0; i++){
                valorTotalCompra += carrinhoPrecos[i];
        }

        cliente.setAcumulado

        return valorTotalCompra;
    }*/ //COLOCAR NO VISTA E PRAZO
}