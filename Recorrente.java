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

    public void valorFinal(){ //Sobrescrita do metodo valorFinal em fornecedores
        double desconto = 0.00;
        desconto = precoCobrado - (precoCobrado * taxaDesconto);

        super.valorFinal();
        System.out.printf("A taxa de desconto do fornecedor é %.2f\n", taxaDesconto);
        System.out.printf("Valor Final: R$%.2f\n", desconto);
    }
}
