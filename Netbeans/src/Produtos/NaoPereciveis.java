package Produtos;

import Fornecedores.Fornecedores;

public class NaoPereciveis extends Produtos{

    public NaoPereciveis(String nome, String codigo,Fornecedores fornecedor, double precoCusto, double precoFinal, String apelido, int quantidade){
        super(nome, codigo, fornecedor, precoCusto, precoFinal, apelido, quantidade);
    }
    
    public NaoPereciveis(String nome, String codigo,Fornecedores fornecedor, double precoCusto, double precoFinal, int quantidade){
        super(nome, codigo, fornecedor, precoCusto, precoFinal, quantidade);
    }
    
    public void imprimeDados(){
    	System.out.println("*******PRODUTO NÃO PERECÍVEL*******");
        super.imprimeDados();
    }
}