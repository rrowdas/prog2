package Fornecedores;

public class Recorrente extends Fornecedores {

    private double taxaDesconto; // Tem que ser em decimal

    public Recorrente(String nome, String endereco, String cnpj, double taxaDesconto) {
        super(nome, endereco, cnpj);
        this.taxaDesconto = taxaDesconto;
    }

    @Override
    public double getTaxaDesconto() {
        return taxaDesconto;
    }

    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }
}
