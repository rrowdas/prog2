package Vendas;

public class Prazo extends Vendas {

    protected String numeroParcelas;

    public Prazo(String dataVenda, String nomeVendedor, String formaPagamento, String cpfCliente, String numeroParcelas) {
        super(dataVenda, nomeVendedor, formaPagamento, cpfCliente);
        this.valorTotalDoCarrinho *= 1.02;
        this.numeroParcelas = numeroParcelas;
    }

    public String getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(String numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    @Override
    public double valorParcelas() {
        double parcela = valorTotalDoCarrinho / Double.parseDouble(numeroParcelas);
        return parcela;
    }
}
