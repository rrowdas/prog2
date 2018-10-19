package PadTremBao;

public class PadTremBao {
	private Fornecedores[] fornecedor = new Fornecedores[10]; 
	private Funcionarios[] funcionario = new Funcionarios [10];
	private Clientes[] cliente = new Clientes [10];
	private Vendas [] venda = new Vendas [50];
	private Estoque estoque;
	
	public PadTremBao(Estoque estoque) {
		this.estoque = estoque;
	}
	
	public Fornecedores[] getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(Fornecedores[] fornecedor) {
		this.fornecedor = fornecedor;
	}


	public Funcionarios[] getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionarios[] funcionario) {
		this.funcionario = funcionario;
	}


	public Clientes[] getCliente() {
		return cliente;
	}


	public void setCliente(Clientes[] cliente) {
		this.cliente = cliente;
	}


	public boolean existeFornecedor(Fornecedores novoFornecedor) {

		boolean existe = false;

		for (int i = 0; i < fornecedor.length && !existe; i++)
			if (fornecedor[i] != null && fornecedor[i].getCnpj().equalsIgnoreCase(novoFornecedor.getCnpj())) {
				System.out.println("Esse CNPJ já possui cadastro");
				existe = true;
			}
		return existe;

	}
	

	public boolean existeFuncionario(Funcionarios novoFuncionario) {
		boolean existe = false;

		for (int i = 0; i < funcionario.length && !existe; i++)
			if (funcionario[i] != null && funcionario[i].getCpf().equalsIgnoreCase(novoFuncionario.getCpf())) {
				System.out.println("Esse CPF já possui cadastro");
				existe = true;
			}

		return existe;
	}

	public boolean existeFuncionario(String cpfFuncionario) {
		boolean existe = false;

		for (int i = 0; i < funcionario.length && !existe; i++)
			if (funcionario[i] != null && funcionario[i].getCpf().equalsIgnoreCase(cpfFuncionario)) {
				System.out.println("Esse CPF já possui cadastro");
				existe = true;
			}

		return existe;
	}
	
	public boolean existeCliente(Clientes novoCliente) {
		boolean existe = false;

		for (int i = 0; i < cliente.length && !existe; i++)
			if (cliente[i] != null && cliente[i].getCpf().equalsIgnoreCase(novoCliente.getCpf())) {
				System.out.println("Esse código já foi cadastro");
				existe = true;
			}
		
		return existe;
	}

	
	public void cadastrarFornecedor(Fornecedores novoFornecedor) {

		boolean cadastrado = existeFornecedor(novoFornecedor);

		for (int i = 0; i < fornecedor.length && !cadastrado; i++) {
			if (fornecedor[i] == null) {
				System.out.println("Foi cadastrado");
				fornecedor[i] = novoFornecedor;
				cadastrado = true;
			}
		}

		if (cadastrado == false)
			System.out.println("Não foi possível cadastrar");
	}

	
	public void adicionarVenda(Vendas novaVenda) {
		
		boolean vendaAdicionado = false;
		int guardarPosicao = -1;
		
		for(int i = 0; i < venda.length && !vendaAdicionado; i++) {
			if(venda[i] == null) {
				venda[i] = novaVenda;
				vendaAdicionado = true;
				guardarPosicao = i;
			}
		}
		
		/**
		 * Como faremos para o usuario ficar passando varios codigos??
		 * Pois, teriamos que chamar o vendas de novo ou sla
		 */
		for(int i = 0; i < venda[guardarPosicao].getCarrinhoCompras().length; i++) {
			venda[guardarPosicao].adicionarProdutoCarrinho(estoque.getTodosProdutos(), codigoProduto);
			
		}
		
		
		
		
		//NO FINAL DE TUDO, CHAMAMOS O CARRINHO TOTAL
		
		System.out.println(venda[guardarPosicao].carrinhoTotal(cliente, funcionario));
		
	}
	
	public void removerFornecedor(String fornecedorCnpjExcluido) {

		boolean removido = false;

		for (int i = 0; i < fornecedor.length && !removido; i++)
			if (fornecedor[i] != null && fornecedor[i].getCnpj().equalsIgnoreCase(fornecedorCnpjExcluido)) {
				System.out.println("O Fornecedor " + fornecedor[i].getNome() + " foi removido.");
				fornecedor[i] = null;
				removido = true;
			}
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void cadastrarFuncionario(Funcionarios novoFuncionario) {
		boolean cadastrado = existeFuncionario(novoFuncionario);

		for (int i = 0; i < funcionario.length && !cadastrado; i++) {
			if (funcionario[i] == null) {
				System.out.println("Foi cadastrado");
				funcionario[i] = novoFuncionario;
				cadastrado = true;
			}
		}
		if (cadastrado == false)
			System.out.println("Não foi possível cadastrar");
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void removerFuncionario(String funcionarioCpfExcluido) {

		boolean removido = false;

		for (int i = 0; i < funcionario.length && !removido; i++)
			if (funcionario[i] != null && funcionario[i].getCpf().equalsIgnoreCase(funcionarioCpfExcluido)) {
				System.out.println("O funcionario " + funcionario[i].getNome() + " foi removido.");
				funcionario[i] = null;
				removido = true;
			}
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void cadastrarCliente(Clientes novoCliente) {
		boolean cadastrado = existeCliente(novoCliente);

		for (int i = 0; i < cliente.length && !cadastrado; i++) {
			if (cliente[i] == null) {
				cliente[i] = novoCliente;
				System.out.println("Foi cadastrado");
			}
		}
		if (cadastrado == false)
			System.out.println("Não foi possível cadastrar");
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void removerCliente(String clienteCpfExcluido) {

		boolean removido = false;

		for (int i = 0; i < cliente.length && !removido; i++)
			if (cliente[i] != null && cliente[i].getCpf().equalsIgnoreCase(clienteCpfExcluido)) {
				System.out.println("O cliente " + cliente[i].getNome() + " foi removido");
				cliente[i] = null;
				removido = true;
			}
	}
}
