//package Padaria;

public class Fornecedores {
    protected String nome;
    protected String endereco;
    protected String cnpj;
    protected double precoCobrado;
 
    public Fornecedores(String nome, String endereco, String cnpj, double precoCobrado) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.precoCobrado = precoCobrado;
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

    public double getPrecoCobrado(){
        return precoCobrado;
    }

    public void setPrecoCobrado(double precoCobrado){
        this.precoCobrado = precoCobrado;
    }

}
