package Padaria;

public class PadTremBao {
  public Fornecedores [] fornecedor;
	public Funcionarios [] funcionario;
	public Clientes [] cliente;
	public String regiao; // PRECISA DA REGIAO????

  public PadTremBao(int numForm, int numFunc, int numCli) {
	    this.fornecedor = new Fornecedores[numForm];
		this.funcionario = new Funcionarios[numFunc];
		this.cliente = new Clientes[numCli];
  }

  public void cadastrarFornecedor(Fornecedores novoFornecedor){
  	
  	boolean cadastrado = false;
  	
  	for(int i = 0; i < fornecedor.length && !cadastrado; i++)
  		if(fornecedor[i] != null && fornecedor[i].getCnpj().equalsIgnoreCase(novoFornecedor.getCnpj())) {
  			System.out.println("Esse CNPJ já possui cadastro");
  			cadastrado = true;
  		}
  	
  	for(int i = 0; i < fornecedor.length && !cadastrado; i++) {
  		if(fornecedor[i] == null) {
  			System.out.println("Foi cadastrado");
  			fornecedor[i] = novoFornecedor;
  			cadastrado = true;
  		}
  	}
  	if(cadastrado == false)
  		System.out.println("Não foi possível cadastrar");
	}
	
	public void removerFornecedor(String cnpjFornecedor){

  	boolean removido = false;

		for(int i = 0; i < fornecedor.length && !removido; i++)
		if(fornecedor[i] != null && fornecedor[i].getCnpj().equalsIgnoreCase(cnpjFornecedor)) {
				System.out.println("O Fornecedor " + fornecedor[i].getNome() + " foi removido.");
				fornecedor[i] = null;
				removido = true;
  		}
	}

	public void cadastrarFuncionario(Funcionarios novoFuncionario){
		boolean cadastrado = false;
  	
  	for(int i = 0; i < funcionario.length && !cadastrado; i++)
  		if(funcionario[i] != null && funcionario[i].getCpf().equalsIgnoreCase(novoFuncionario.getCpf())) {
  			System.out.println("Esse CPF já possui cadastro");
  			cadastrado = true;
  		}
  	
  	for(int i = 0; i < funcionario.length && !cadastrado; i++) {
  		if(funcionario[i] == null) {
  			System.out.println("Foi cadastrado");
  			funcionario[i] = novoFuncionario;
  			cadastrado = true;
  		}
  	}
  	if(cadastrado == false)
  		System.out.println("Não foi possível cadastrar");
	}

	public void removerFuncionario(String cpfFuncionario){

		boolean removido = false;
  	
  	for(int i = 0; i < funcionario.length && !removido; i++)
  		if(funcionario[i] != null && funcionario[i].getCpf().equalsIgnoreCase(cpfFuncionario)) {				
				System.out.println("O funcionario " + funcionario[i].getNome() + " foi removido.");
				funcionario[i] = null;
				removido = true;
  		}
	}

	public void cadastrarCliente(Clientes novoCliente){
		boolean cadastrado = false;
  	
  	for(int i = 0; i < cliente.length && !cadastrado; i++)
  		if(cliente[i] != null && cliente[i].getCpf().equalsIgnoreCase(novoCliente.getCpf())) {
  			System.out.println("Esse código já foi cadastro");
  			cadastrado = true;
  		}
  	
  	for(int i = 0; i < cliente.length && !cadastrado; i++) {
  		if(cliente[i] == null) {
  			cliente[i] = novoCliente;
  			System.out.println("Foi cadastrado");
  		}
  	}
  	if(cadastrado == false)
  		System.out.println("Não foi possível cadastrar");
	}

	public void removerCliente(String cpfCliente){

		boolean removido = false;
  	
  	for(int i = 0; i < cliente.length && !removido; i++)
  		if(cliente[i] != null && cliente[i].getCpf().equalsIgnoreCase(cpfCliente)) {
				System.out.println("O cliente " + cliente[i].getNome() + " foi removido");
				cliente[i] = null;
				removido = true;
  		}
	}
}
