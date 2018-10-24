package Estoque;

import Produtos.Produtos;

public class Estoque {

    protected Produtos[] produto = new Produtos[50];

    public Produtos[] getProdutos() {
        return produto;
    }

    public int consultaProduto(String infoProduto) {
        int posicao = -1;
        boolean existe = false;

        for (int i = 0; i < produto.length && !existe; i++) {
            if (produto[i] != null && produto[i].getCodigo().equalsIgnoreCase(infoProduto) || produto[i].getApelido().equalsIgnoreCase(infoProduto) || produto[i].getNome().equalsIgnoreCase(infoProduto))  {
                System.out.println("Esse produto já está cadastrado");
                existe = true;
                posicao = i;
            }
        }
        return posicao;
    }

    public void cadastrarProduto(Produtos novoProduto) {

        boolean cadastrado = false;
        if (consultaProduto(novoProduto.getCodigo()) != -1) {
            System.out.println("Esse produto já está cadastrado.");
        }
        else {
            for (int i = 0; i < produto.length && !cadastrado; i++) {
                if (produto[i] == null) {
                    System.out.println("Produto " + novoProduto.getNome() + " cadastrado");
                    produto[i] = novoProduto;
                    cadastrado = true;
                }
            }
            if (cadastrado == false) {
                System.out.println("Não é possível cadastrar mais produtos em nosso sistema (número máximo alcançado).");
            }
        }
    }

    public void removerProduto(String codigoProdutoExcluido) {

        boolean removido = false;
        int posicao = consultaProduto(codigoProdutoExcluido);

        if (posicao != -1) {
            produto[posicao] = null;
            System.out.println("O Produto " + produto[posicao].getNome() + " foi removido.");
        }
        else {
            System.out.println("Produto não encontrado. Tente novamente com um codigo válido.");
        }

    }

    public void controleProduto(Produtos produtoControlado) {
        if (produtoControlado.getQuantidade().equalsIgnoreCase("1")) {
            System.out.println("Alerta, resta apenas 1 produto no estoque, favor reabastecer");
        }
        else if (produtoControlado.getQuantidade().equalsIgnoreCase("0")) {
            System.out.println("Produto esgotado");
        }
    }

}
