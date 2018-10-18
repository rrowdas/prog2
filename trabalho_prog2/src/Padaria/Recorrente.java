package Padaria;

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

    public void imprimeDados(){ //Sobrescrita do metodo valorFinal em fornecedores
        double precoDescontado = 0.00;
        
        precoDescontado = precoCobrado - (precoCobrado * taxaDesconto); // Em decimal

        super.imprimeDados();
        System.out.printf("Valor de custo: R$%.2f\n", precoCobrado);
        System.out.println("Taxa de desconto: " + (int)(taxaDesconto * 100) + "%");
        System.out.printf("Valor com desconto aplicado: R$%.2f\n", precoDescontado);
    }
}
