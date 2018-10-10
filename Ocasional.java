public class Ocasional extends Fornecedores{
    
    public Ocasional(String nome, String endereco, String cnpj, double precoCobrado){
        super(nome, endereco, cnpj, precoCobrado);
    }
    public void valorFinal(){
        System.out.println("Fornecedor: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço dos fornecedores: " + endereco);
        System.out.printf("Valor Final: R$%.2f\n", precoCobrado);
    }

}