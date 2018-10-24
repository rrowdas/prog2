package Produtos;


public class NaoPereciveis extends Produtos {

    public NaoPereciveis(String nome, String codigo, String cnpjFornecedor, double precoCusto, double precoFinal, String apelido, int quantidade) {
        super(nome, codigo, cnpjFornecedor, precoCusto, precoFinal, apelido, quantidade);
    }

    public NaoPereciveis(String nome, String codigo, String cnpjFornecedor, double precoCusto, double precoFinal, int quantidade) {
        super(nome, codigo, cnpjFornecedor, precoCusto, precoFinal, quantidade);
    }

    @Override
    public void imprimeDados() {
        System.out.println("*******PRODUTO NÃO PERECÍVEL*******");
        super.imprimeDados();
    }
}
