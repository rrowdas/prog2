package Vendas;

import Clientes.Clientes;
import Funcionarios.Funcionarios;

public class Prazo extends Vendas {

    public Prazo(String dataVenda, String nomeVendedor, String formaPagamento, String cpfCliente, int numeroParcelas) {
        super(dataVenda, nomeVendedor, formaPagamento, cpfCliente);
        this.valorTotalDoCarrinho *= 1.02;
        this.numeroParcelas = numeroParcelas;
    }
    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }
    protected int numeroParcelas;

    
    
    public double valorParcelas() {
        double parcela = valorTotalDoCarrinho /  numeroParcelas;
        return parcela;
    }
}
