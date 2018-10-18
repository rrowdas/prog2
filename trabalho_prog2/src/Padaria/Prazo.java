package Padaria;

public class Prazo extends Vendas{
    protected double acrescimo = 2;
   public Prazo(String dataVenda, String nomeVendedor, String formaPagamento, String cpfCliente) {
        super(dataVenda, nomeVendedor, formaPagamento, cpfCliente);
    }
}
