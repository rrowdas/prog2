package Estoque;

import Produtos.Pereciveis;
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
   // "Nome", "Código", "Cnpj Fornecedor", "Preco Custo", "Preco Final", "Apelido", "Quantidade", "Vencimento"}
    public String[][] dadosProdutos() {
        String[][] dataValues = new String[produto.length][8];
        for (int i = 0; i < produto.length; i++) {
            if (produto[i] != null) {
                dataValues[i][0] = produto[i].getNome();
                dataValues[i][1] = produto[i].getCodigo();
                dataValues[i][2] = produto[i].getFornecedor();
                dataValues[i][3] = produto[i].getPrecoCusto();
                dataValues[i][4] = produto[i].getPrecoFinal();
                dataValues[i][5] = produto[i].getApelido();
                dataValues[i][6] = produto[i].getQuantidade();
                if(produto[i] instanceof Pereciveis)
                    dataValues[i][7] = ((Pereciveis)produto[i]).getDiaValidade()+"/"+((Pereciveis)produto[i]).getMesValidade()+"/"+((Pereciveis)produto[i]).getAnoValidade();
                
            }
        }
        return dataValues;
    }

    public Produtos dadosProduto(String codigo) {
        Produtos p = null;
        if (consultaProduto(codigo) != -1) {
            //fornecedor[consultaFornecedor(cnpjFornecedor)].imprimeDados();
            p = produto[consultaProduto(codigo)];
        } else {
            System.out.println("Fornecedor inexistente");
            //f = null;
        }
        return p;
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

    public boolean removerProduto(String codigoProdutoExcluido) {

        boolean removido = false;
        int posicao = consultaProduto(codigoProdutoExcluido);

        if (posicao != -1) {
            System.out.println("O Produto " + produto[posicao].getNome() + " foi removido.");
            produto[posicao] = null;
            return true;
        }
        else {
            System.out.println("Produto não encontrado. Tente novamente com um codigo válido.");
            return false;
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
