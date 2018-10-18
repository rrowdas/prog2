package Padaria;

public class Vendedor extends Funcionarios{
    
    private double montanteVendas;
    private double metaVendasMes = 1000; // estipular metas de vendas na interface grafica
    

	public Vendedor(String nome, String endereco, String cpf, String telefone, double salarioBase){
        super(nome, endereco, cpf, telefone, salarioBase);
    }
	
	public double getMetaVendasMes() {
		return metaVendasMes;
	}
	
	public void setMetaVendasMes(double metaVendasMes) {
		this.metaVendasMes = metaVendasMes;
	}
	
	public double getMontanteVendas() {
		return montanteVendas;
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
    
    public void imprimeDados()
    {
        System.out.println("VENDEDOR");
        System.out.println();
        super.imprimeDados();
        salarioFinal();
        
    }
}