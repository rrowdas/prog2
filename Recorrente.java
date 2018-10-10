public class Recorrente extends Fornecedores{
    private double taxaDesconto;
    
    public Recorrente(String nome, String endereco, String cnpj, double precoCobrado, double taxaDesconto){
        super(nome, endereco, cnpj, precoCobrado);
        this.taxaDesconto = taxaDesconto;
    }
    public double getTaxaDesconto(){
        return taxaDesconto;
    }

    public void setTaxaDesconto(double taxaDesconto){
        this.taxaDesconto = taxaDesconto;
    }

    public void valorFinal(){
        double desconto = 0.00;
        desconto = precoCobrado - (precoCobrado * taxaDesconto);

        System.out.println("Fornecedor: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço dos fornecedores: " + endereco);
        System.out.printf("O valor do produto é R$%.2f\n", precoCobrado);
        System.out.printf("A taxa de desconto do fornecedor é %.2f\n", taxaDesconto);
        System.out.printf("Valor Final: R$%.2f\n", desconto);
    }
}
