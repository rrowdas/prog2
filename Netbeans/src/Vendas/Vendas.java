package Vendas;

import Clientes.Clientes;
import Funcionarios.Funcionarios;
import Produtos.Produtos;

public abstract class Vendas { // Estoque

    protected String dataVenda;
    protected String cpfVendedor;
    protected String formaPagamento;
    protected String cpfCliente;
    protected Produtos[] carrinhoCompras = new Produtos[20];
    protected double valorTotalDoCarrinho = 0;

    public Vendas(String dataVenda, String cpfVendedor, String formaPagamento, String cpfCliente) {

        this.dataVenda = dataVenda;
        this.cpfVendedor = cpfVendedor;
        setFormaPagamento(formaPagamento);
        this.cpfCliente = cpfCliente;
    }

    public Produtos[] getCarrinhoCompras() {
        return carrinhoCompras;
    }

    public void setCarrinhoCompras(Produtos[] carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }

    public String getCpfCliente() {
        return this.cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getDataVenda() {
        return this.dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getCpfVendedor() {
        return this.cpfVendedor;
    }

    public void setCpfVendedor(String novoCpf) {
        this.cpfVendedor = novoCpf;
    }

    public String getFormaPagamento() {
        return this.formaPagamento;
    }

    public void setFormaPagamento(String novaFormaPagamento) {
        if (novaFormaPagamento.equalsIgnoreCase("dinheiro") || novaFormaPagamento.equalsIgnoreCase("debito")
                || novaFormaPagamento.equalsIgnoreCase("credito")) {
            this.formaPagamento = novaFormaPagamento;
        } else {
//           /* while (novaFormaPagamento.equalsIgnoreCase("dinheiro") == false
//                    || novaFormaPagamento.equalsIgnoreCase("debito") == false
//             */       || novaFormaPagamento.equalsIgnoreCase("credito") == false) {
            System.out.println("Voce deve colocar debito, credito ou dinheiro. Digite novamente.");
        }
    }

    public double getValorTotalDoCarrinho() {
        return valorTotalDoCarrinho;
    }

    public void setValorTotalDoCarrinho(double valorTotalDoCarrinho) {
        this.valorTotalDoCarrinho = valorTotalDoCarrinho;
    }

//    public int getTamanhoDoCarrinho() {
//        return tamanhoDoCarrinho;
//    }
//
//    public void setTamanhoDoCarrinho(int tamanhoDoCarrinho) {
//        this.tamanhoDoCarrinho = tamanhoDoCarrinho;
//    }
    public void adicionaProdutoCarrinho(Produtos[] produto, String codigoProduto) {

        boolean encontrouProduto = false; // caso encontre o produto
        boolean carrinhoCheio = false;

        for (int i = 0; i < produto.length && !encontrouProduto && !carrinhoCheio; i++) {

            if (carrinhoCompras[19] != null) {
                System.out.println("Abra uma nova venda,o carrinho está cheio");
                carrinhoCheio = true;
            } else if (produto[i].getCodigo().equalsIgnoreCase(codigoProduto)) {
                encontrouProduto = true; // produto foi encontrado
                if (produto[i].getQuantidade() == 0) {
                    System.out.println("Não existe produto no estoque");
                } else {

                    valorTotalDoCarrinho += produto[i].getPrecoFinal(); //Adiciona no carrinho o valor do produto

                    produto[i].setQuantidade(produto[i].getQuantidade() - 1); //Retira uma unidade do produto

                    if (produto[i].getQuantidade() == 1) // Se caso, a quantidade total do produto for igual a 1, enviar mensagem.
                    {
                        System.out.println("Possui apenas 1 produto, favor reabastecer. ");
                    }
                }
            }
        }

    }

    public double valorParcelas() {
        return valorTotalDoCarrinho;
    }

}
