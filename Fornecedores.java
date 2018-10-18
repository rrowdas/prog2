//package Padaria;
import java.util.Scanner;
public abstract class Fornecedores {
    Scanner teclado = new Scanner(System.in);
    protected String nome;
    protected String endereco;
    protected String cnpj;
    protected double precoCobrado;
 
    public Fornecedores(String nome, String endereco, String cnpj, double precoCobrado) {
        this.nome = nome;
        this.endereco = endereco;
        while(cnpj.length() != 14){
            System.out.println("Número de código deve ter 14(QUATORZE) dígitos. Por favor, coloque o código corretamente, obrigado.");
            cnpj = teclado.next();                        //FALTA TIRAR O LOOOOOP DAQUI
        }
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

    public void valorFinal(){ // esse metodo está aqui para fazer sobrescrita
        System.out.println("Fornecedor: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço do fornecedor: " + endereco);
        System.out.printf("Valor do produto: R$%.2f\n", precoCobrado);
    }
}
