package Padaria;

public class PadTremBao {
    public Fornecedores[] fornecedor;
 
    public PadTremBao(int numForn) {
        this.fornecedor = new Fornecedores[numForn];
    }
 
    public void cadastrarFornecedor(Fornecedores novoFornecedor) {
    	
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
     
}