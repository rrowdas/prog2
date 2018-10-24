package Funcionarios;

public class Gerente extends Funcionarios {

    public Gerente(String nome, String endereco, String cpf, String telefone, String salarioBase) {
        super(nome, endereco, cpf, telefone, salarioBase);
    }

    @Override
    public double salarioFinal() {

        double somaTotal = 0;
        double sb = Double.parseDouble(salarioBase);
        somaTotal = sb + (sb * 0.20);

        //System.out.printf("Salario: R$%.2f\n", somaTotal);
        return somaTotal;
    }

    @Override
    public void imprimeDados() {
        System.out.println();
        System.out.println("GERENTE");
        System.out.println();

        super.imprimeDados();
        System.out.printf("R$ %.2f\n", salarioFinal());
    }
}
