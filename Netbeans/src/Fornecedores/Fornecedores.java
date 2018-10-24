package Fornecedores;

import PadTremBao.Informacoes;

public abstract class Fornecedores implements Informacoes {

    protected String nome;
    protected String endereco;
    protected String cnpj;

    public Fornecedores(String nome, String endereco, String cnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getTaxaDesconto() {
        return 0;
    }
    
    public void imprimeDados() { // esse metodo está aqui para fazer sobrescrita
        System.out.println();
        System.out.println("Fornecedor: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço do fornecedor: " + endereco);
        System.out.println();
    }
}
