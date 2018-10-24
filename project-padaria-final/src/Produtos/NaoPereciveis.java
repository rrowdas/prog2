package Produtos;

import Fornecedores.Fornecedores;

public class NaoPereciveis extends Produtos {

    public NaoPereciveis(String nome, String codigo, String fornecedor, String precoCusto, String precoFinal, String apelido, String quantidade) {
        super(nome, codigo, fornecedor, precoCusto, precoFinal, apelido, quantidade);
    }

    public NaoPereciveis(String nome, String codigo, String fornecedor, String precoCusto, String precoFinal, String quantidade) {
        super(nome, codigo, fornecedor, precoCusto, precoFinal, quantidade);
    }

    @Override
    public void imprimeDados() {
        System.out.println("*******PRODUTO NÃO PERECÍVEL*******");
        super.imprimeDados();
    }
}
