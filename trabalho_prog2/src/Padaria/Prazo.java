package Padaria;

public class Prazo extends Vendas {
	protected double acrescimo = 0.2;

	public Prazo(String dataVenda, String nomeVendedor, String formaPagamento, String cpfCliente) {
		super(dataVenda, nomeVendedor, formaPagamento, cpfCliente);
	}
	

	public double carrinhoTotal() {

		boolean encontrado = false;
		
		
		for(int i = 0; i < padaria.getCliente().length && !encontrado; i++) // Adicionar esse valor no cartao fidelidade do cliente
			if(padaria.getCliente()[i].getCpf().equalsIgnoreCase(cpfCliente)) {
				encontrado = true;
				padaria.getCliente()[i].setAcumuladoCompras(valorTotalDoCarrinho);
			}

		
		return valorTotalDoCarrinho * 1.02;
	}
}
