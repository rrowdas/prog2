public class Padeiro extends Funcionarios
{
    protected int horasAlternativas;
    protected int horasNormal;
    
    public Padeiro(String nome, String endereco, String cpf, String telefone, double salarioBase, int horasAlternativas, int horasNormal){
        super(nome, endereco, cpf, telefone, salarioBase);
        this.horasAlternativas = horasAlternativas;
        this.horasNormal = horasNormal;
    }
    public double getHorasNormal() { 
        return horasNormal;
    }

    public void setHorasNormal(int horasNormal){
        this.horasNormal = horasNormal;
    }

    public double getHorasAlternativas(){
        return horasAlternativas;
    }

    public void setHorasAlternativas(int horasAlternativas){
        this.horasAlternativas = horasAlternativas;
    }

    public void somaSalarial(double salarioBase, int horasAlternativas, int horasNormal){
        double bonificacao, somaTotal, salarioHora;
        salarioHora = salarioBase / (horasNormal + horasAlternativas);  
        
        bonificacao = horasAlternativas * ((salarioHora * 0.25) + salarioHora);
        
        somaTotal = bonificacao + salarioBase;

        System.out.printf("Salário por hora: %.2f\n", salarioHora);

        System.out.printf("Acréscimo salarial: %.2f\n", bonificacao);
        
        System.out.printf("Soma total do salário do funcionário: %.2f\n", somaTotal);
    }
    
    public void imprimeDadosPessoais(){
        System.out.println("PADEIRO");
        super.imprimeDadosPessoais();
        somaSalarial(salarioBase, horasAlternativas, horasNormal);
    }

}