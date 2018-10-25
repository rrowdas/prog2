package Vendas;

public class Prazo extends Vendas {

    protected int numeroParcelas;

    public Prazo(String dataVenda, String cpfVendedor, String formaPagamento, String cpfCliente, int numeroParcelas) {
        super(dataVenda, cpfVendedor, formaPagamento, cpfCliente);
        this.valorTotalDoCarrinho *= 1.02;
        this.numeroParcelas = numeroParcelas;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    @Override
    public double valorParcelas() {
        double parcela = valorTotalDoCarrinho / numeroParcelas;
        return parcela;
    }
}
