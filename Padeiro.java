public class Padeiro extends Funcionarios
{
    protected int horasAlternativas;
    protected int horasNormais;
    
    public Padeiro(String nome, String endereco, String cpf, String telefone, double salarioBase, int horasAlternativas, int horasNormais){
        super(nome, endereco, cpf, telefone, salarioBase);
        this.horasAlternativas = horasAlternativas;
        this.horasNormais = horasNormais;
    }
    public double getHorasNormais() { 
        return horasNormais;
    }

    public void sethorasNormais(int horasNormais){
        this.horasNormais = horasNormais;
    }

    public double getHorasAlternativas(){
        return horasAlternativas;
    }

    public void setHorasAlternativas(int horasAlternativas){
        this.horasAlternativas = horasAlternativas;
    }

    public void salarioFinal(){
        double bonificacao, somaTotal, salarioHora;
        salarioHora = salarioBase / (horasNormais + horasAlternativas);  
        
        bonificacao = horasAlternativas * ((salarioHora * 0.25) + salarioHora);
        
        somaTotal = bonificacao + salarioBase;

        System.out.printf("Salário por hora: %.2f\n", salarioHora);

        System.out.printf("Acréscimo salarial: %.2f\n", bonificacao);
        
        System.out.printf("Soma total do salário do funcionário: %.2f\n", somaTotal);
    }
    
    public void imprimeDadosPessoais(){
        System.out.println("PADEIRO");
        super.imprimeDadosPessoais();
        salarioFinal(salarioBase, horasAlternativas, horasNormais);
    }

}