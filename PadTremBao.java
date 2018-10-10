//package Padaria;

public class PadTremBao {
    public Fornecedores [] fornecedor;
	public Funcionarios [] funcionario;
	public Clientes [] cliente;
	public String apelido;
	public String regiao;
 
    // public PadTremBao(int numForn, int numFunc) {
	//     this.fornecedor = new Fornecedores[numForn];
	// 	this.funcionario = new Funcionarios[numFunc];
    // }
 
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
	/*/
	public void cadastrarProduto(Produtos novoProduto){
		boolean cadastrado = false;
    	
    	for(int i = 0; i < produto.length && !cadastrado; i++)
    		if(produto[i] != null && produto[i].getCodigo().equalsIgnoreCase(novoProduto.getCodigo())) {
    			System.out.println("Esse código já foi cadastro");
    			cadastrado = true;
    		}
    	
    	for(int i = 0; i < produto.length && !cadastrado; i++) {
    		if(produto[i] == null) {
    			System.out.println("Foi cadastrado");
    			produto[i] = novoProduto;
    			cadastrado = true;
    		}
    	}
    	if(cadastrado == false)
    		System.out.println("Não foi possível cadastrar");
	}
	*/

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

	
	
	/*imprimefuncionrio(String cpfEncontrar)
	{
		for(int i = 0; i < funcionario.length; i++)
			if(funcionario[i].cpf() == cpfEncontrar){
				funcionario[i].imprimeDados();
			}
		
	}*/
	
}