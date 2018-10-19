package Vendas;

public class Prazo extends Vendas {
	protected double acrescimo = 0.2;

	public Prazo(String dataVenda, String nomeVendedor, String formaPagamento, String cpfCliente) {
		super(dataVenda, nomeVendedor, formaPagamento, cpfCliente);
	}
	

	public double carrinhoTotal(Clientes [] cliente, Funcionarios [] funcionario) {

		boolean encontrado = false;
		
		
		for(int i = 0; i < cliente.length && !encontrado; i++) // Adicionar esse valor no cartao fidelidade do cliente
			if(cliente[i].getCpf().equalsIgnoreCase(cpfCliente)) {
				encontrado = true;
				cliente[i].setAcumuladoCompras(valorTotalDoCarrinho);
			}
		
		

		
		return valorTotalDoCarrinho * 1.02;
	}
}
