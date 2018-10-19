package Vendas;

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
}
