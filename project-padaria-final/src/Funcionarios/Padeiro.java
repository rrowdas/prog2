package Funcionarios;

public class Padeiro extends Funcionarios {

    private String horasAlternativas;
    private String horasNormais;

    public Padeiro(String nome, String endereco, String cpf, String telefone, String salarioBase, String horasNormais,
            String horasAlternativas) {
        super(nome, endereco, cpf, telefone, salarioBase);
        this.horasNormais = horasNormais;
        this.horasAlternativas = horasAlternativas;
    }

    public String getHorasNormais() {
        return horasNormais;
    }

    public void sethorasNormais(String horasNormais) {
        this.horasNormais = horasNormais;
    }

    public String getHorasAlternativas() {
        return horasAlternativas;
    }

    public void setHorasAlternativas(String horasAlternativas) {
        this.horasAlternativas = horasAlternativas;
    }

    @Override
    public double salarioFinal() {
        double bonificacao, somaTotal, salarioHora;
        double sb = Double.parseDouble(salarioBase);
        int hN = Integer.parseInt(horasNormais);
        int hA = Integer.parseInt(horasAlternativas);
        
        salarioHora = sb / (hN + hA);

        bonificacao = hA * (salarioHora * 1.25);

        somaTotal = bonificacao + sb;

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

        super.imprimeDados();
        System.out.printf("R$ %.2f\n", salarioFinal());
    }

}
