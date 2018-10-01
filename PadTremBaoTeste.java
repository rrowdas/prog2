package Padaria;

public class PadTremBaoTeste {
    public static void main(String [] args){
        Fornecedores f1 = new Fornecedores("vivo", "rua sao jorge", "123123", "recorrente");
        Fornecedores f2 = new Fornecedores("tim", "rua brasil", "123456", "ocasional");
        Fornecedores f3 = new Fornecedores("claro", "rua errada", "123123", "ocasional");

        Funcionarios f1 = new Vendedor();
 
        PadTremBao teste = new PadTremBao(1);
        
        teste.cadastrarFornecedor(f1);
        teste.cadastrarFornecedor(f2);
        teste.cadastrarFornecedor(f3);
    }
}
