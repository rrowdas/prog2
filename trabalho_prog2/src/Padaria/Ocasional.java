package Padaria;

public class Ocasional extends Fornecedores{
    
    public Ocasional(String nome, String endereco, String cnpj, double precoCobrado){
        super(nome, endereco, cnpj, precoCobrado);
    }
    public void imprimeDados(){ //Sobrescrita do metodo valorFinal em fornecedores
        super.imprimeDados();
        System.out.printf("Valor cobrado: R$%.2f\n", precoCobrado);
    }

}