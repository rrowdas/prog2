package Produtos;

import Fornecedores.Fornecedores;
import PadTremBao.Informacoes;

public abstract class Produtos implements Informacoes {

    protected String nome;
    protected String codigo;
    protected Fornecedores fornecedor;
    protected double precoCusto, precoFinal;
    protected String apelido;
    protected int quantidade;

    public Produtos(String nome, String codigo, Fornecedores fornecedor, double precoCusto, double precoFinal, String apelido, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.fornecedor = fornecedor;
        setPrecoCusto(precoCusto);
        this.precoFinal = precoFinal;
        this.apelido = apelido;
        this.quantidade = quantidade;
    }

    public Produtos(String nome, String codigo, Fornecedores fornecedor, double precoCusto, double precoFinal, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.fornecedor = fornecedor;
        setPrecoCusto(precoCusto);
        this.precoFinal = precoFinal;
        this.apelido = "Sem apelido";
        this.quantidade = quantidade;
    }

    public Fornecedores getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedores fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int novaQuantidade) {

        this.quantidade = novaQuantidade;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto * (1 - fornecedor.getTaxaDesconto());
    }
    
    @Override
    public void imprimeDados() {
        System.out.println("------------------------------------------");
        System.out.println("PRODUTO:");
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.printf("Preço: R$%.2f\n", precoFinal);
        System.out.printf("Custo: R$%.2f\n", precoCusto);
        System.out.println("Apelido: " + apelido);
        System.out.println("Quantidade de " + nome + " é: " + quantidade + " unidades");

    }

}
