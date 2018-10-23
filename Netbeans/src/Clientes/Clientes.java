package Clientes;

import PadTremBao.Informacoes;

public class Clientes implements Informacoes {

    private String nome;
    private String endereco;
    private String cpf;
    private String telefone;
    private double acumuladoCompras = 0.0;

    public Clientes(String nome, String endereco, String cpf, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
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

    public double getAcumuladoCompras() {
        return this.acumuladoCompras;
    }

    public void setAcumuladoCompras(double novaCompra) {
        this.acumuladoCompras += novaCompra;
    }

    public double cartaoFidelidade() {

        if (acumuladoCompras >= 200) {
            return 0.90;
        }
        else if (acumuladoCompras < 200 && acumuladoCompras >= 100) {
            return 0.95;
        }
        else {
            return 1;
        }

    }

    @Override
    public void imprimeDados() {
        // Basear-se no cadastrar cliente e caso nao esteja cadastrado, preencher info
        // do usuario
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);

        if (cartaoFidelidade() == 0.90) {
            System.out.println("Cliente Platinum");
        }
        else if (cartaoFidelidade() == 0.95) {
            System.out.println("Cliente Gold");
        }
        else {
            System.out.println("Cliente casual");
        }

    }
}
