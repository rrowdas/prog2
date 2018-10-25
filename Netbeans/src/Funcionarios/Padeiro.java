package Funcionarios;

public class Padeiro extends Funcionarios {

    private int horasAlternativas;
    private int horasNormais;

    public Padeiro(String nome, String endereco, String cpf, String telefone, double salarioBase, int horasNormais,
            int horasAlternativas) {
        super(nome, endereco, cpf, telefone, salarioBase);
        this.horasNormais = horasNormais;
        this.horasAlternativas = horasAlternativas;
    }

    public int getHorasNormais() {
        return horasNormais;
    }

    public void sethorasNormais(int horasNormais) {
        this.horasNormais = horasNormais;
    }

    public int getHorasAlternativas() {
        return horasAlternativas;
    }

    public void setHorasAlternativas(int horasAlternativas) {
        this.horasAlternativas = horasAlternativas;
    }

    @Override
    public double salarioFinal() {
        double bonificacao, somaTotal, salarioHora;
        int horaTotal;
        
        salarioHora = salarioBase / (horasNormais + horasAlternativas);

        bonificacao = horasAlternativas * (salarioHora * 1.25);

        somaTotal = bonificacao + salarioBase;

        /*
		 * System.out.printf("Salário por hora: R$%.2f\n", salarioHora);
		 * 
		 * System.out.printf("Acréscimo salarial: R$%.2f\n", bonificacao);
		 * 
		 * System.out.printf("Soma total do salário do funcionário: R$%.2f\n",
		 * somaTotal);
         */
        return somaTotal;
    }

    @Override
    public void imprimeDados() {
        System.out.println();
        System.out.println("PADEIRO");
        System.out.println();

        System.out.printf("R$ %.2f\n", salarioFinal());
        super.imprimeDados();
        
    }

}
