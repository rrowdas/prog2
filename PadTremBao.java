package Padaria;

public class PadTremBao {
    public Fornecedores [] fornecedor;
	public Funcionario [] funcionario;
	public Produtos [] produto;
	public Clientes [] cliente;
	public String apelido;
	public String regiao;

	public PadTremBao(Fornecedores [] fornecedor, Funcionario [] fundionario, Produtos [] produto, Clientes [] cliente, String [] regiao){

	}
 
    public PadTremBao(int numForn) {
        this.fornecedor = new Fornecedores[numForn];
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

	public void cadastrarFuncionario(Funcionario novoFuncionario){
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

	public void cadastrarFuncionario(Produtos novoProduto){
		boolean cadastrado = false;
    	
    	for(int i = 0; i < produto.length && !cadastrado; i++)
    		if(produto[i] != null && produto[i].getCpf().equalsIgnoreCase(novoProduto.getCpf())) {
    			System.out.println("Esse código já foi cadastro");
    			cadastrado = true;
    		}
    	
    	for(int i = 0; i < produto.length && !cadastrado; i++) {
    		if(produto[i] == null) {
    			System.out.println("Foi cadastrado");
    			funcionario[i] = novoProduto;
    			cadastrado = true;
    		}
    	}
    	if(cadastrado == false)
    		System.out.println("Não foi possível cadastrar");
	}

	public boolean cadastrarCliente(){
        boolean cadastrado = false;
        if(getCpf() != null && getNome() != null &&  getEndereco() != null && getTelefone() != null){
            return !cadastrado;
        }               // If e Else para verificar se o cpf/nome/endereço/telefone está tudo cadastrado
        else
            return cadastrado;
	}
	
	

	
	/*imprimefuncionrio(String cpfEncontrar)
	{
		for(int i = 0; i < funcionario.length; i++)
			if(funcionario[i].cpf() == cpfEncontrar){
				funcionario[i].imprimeDados();
			}
		
	}*/
	
}