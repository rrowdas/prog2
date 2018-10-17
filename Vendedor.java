public class Vendedor extends Funcionarios{
    
    protected double montanteVendas;
    protected double metaVendasMes;
    
    public Vendedor(String nome, String endereco, String cpf, String telefone, double salarioBase, double metaVendasMes){
        super(nome, endereco, cpf, telefone, salarioBase);
        this.metaVendasMes = metaVendasMes;
    }

    public void setMontanteVendas(double valorDaVenda){
        this.montanteVendas += valorDaVenda;
    }

    public void salarioFinal()
    {
        double somaTotal = 0;

        if(metaVendasMes <= montanteVendas){
            somaTotal = salarioBase + (salarioBase * 0.10);    
        }
        else
            somaTotal = salarioBase;

        System.out.printf("Salario: R$%.2f\n", somaTotal);
    }
    
    public void imprimeDadosPessoais()
    {
        System.out.println("VENDEDOR");
        super.imprimeDadosPessoais();
        salarioFinal();
        
    }


}