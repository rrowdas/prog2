package Padaria;

public class Gerente extends Funcionarios{
    public Gerente(String nome, String endereco, String cpf, String telefone, double salarioBase){
        super(nome, endereco, cpf, telefone, salarioBase);
    }
    public void salarioFinal(){
        
        double somaTotal = 0;
        
        somaTotal = salarioBase + (salarioBase * 0.20); 

        System.out.printf("Salario: R$%.2f\n", somaTotal);
    }
    
    public void imprimeDados(){
        System.out.println("GERENTE");
        System.out.println();
        
        super.imprimeDados();
        salarioFinal();
    }
}

