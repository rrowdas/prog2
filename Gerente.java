public class Gerente extends Funcionarios{
    public Gerente(String nome, String endereco, String cpf, String telefone, double salarioBase){
        super(nome, endereco, cpf, telefone, salarioBase);
    }
    public double salarioGratificacao(){
        //Precisa saber a horas trabalhadas?
        
        double somaTotal = 0;
        
        somaTotal = salarioBase + (salarioBase * 0.20); 

        return somaTotal;
    }
    public void imprimeDadosPessoais(){
        System.out.println("GERENTE");
        
        super.imprimeDadosPessoais();
        System.out.printf("Salario: R$%.2f\n", salarioGratificacao());
    }
}

