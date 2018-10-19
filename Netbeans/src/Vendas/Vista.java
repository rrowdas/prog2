package Vendas;

import Clientes.Clientes;
import Funcionarios.Funcionarios;

public class Vista extends Vendas {
	public Vista(String dataVenda, String nomeVendedor, String formaPagamento, String cpfCliente) {
		super(dataVenda, nomeVendedor, formaPagamento, cpfCliente);
	}

	public double carrinhoTotal() {

		double valorTotalCompra = 0;

		/*for (int i = 0; i < carrinhoPrecos.length && carrinhoPrecos[i] != 0; i++) {
			valorTotalCompra += carrinhoPrecos[i];
		}*/

		return valorTotalCompra;
	}

    @Override
    public double carrinhoTotal(Clientes[] cliente, Funcionarios[] funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
