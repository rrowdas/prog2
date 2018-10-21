package Funcionarios;

import PadTremBao.Informacoes;

public abstract class Funcionarios implements Informacoes, Salario {

    protected String nome;
    protected String endereco;
    protected String cpf;
    protected String telefone;
    protected double salarioBase;

    public Funcionarios(String nome, String endereco, String cpf, String telefone, double salarioBase) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public void imprimeDados() // INFORMAÇÕES DE UM(1) FUNCIONÁRIO
    {
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);

    }

}
