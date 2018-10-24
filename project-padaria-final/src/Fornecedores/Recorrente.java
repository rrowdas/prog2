package Fornecedores;

public class Recorrente extends Fornecedores {

    private String taxaDesconto; // Tem que ser em decimal

    public Recorrente(String nome, String endereco, String cnpj, String taxaDesconto) {
        super(nome, endereco, cnpj);
        this.taxaDesconto = taxaDesconto;
    }

    @Override
    public String getTaxaDesconto() {
        return taxaDesconto;
    }

    public void setTaxaDesconto(String taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }
}
