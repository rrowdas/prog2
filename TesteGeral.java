import java.util.Scanner;
public class TesteGeral
{
    public static void main (String[] args)
    {

        Scanner teclado = new Scanner(System.in);
        Funcionarios fun = new Padeiro("Victor", "Rua da FACOM", "741258", "978654321", 1500, 50, 20);
        Funcionarios fun2 = new Padeiro("Fernando", "Rua do PET", "4521367", "97841172472", 1000, 20, 10);

        Produtos prod = new Produtos("Pão", teclado.next(), 42.00, 100.00);

        Gerente ger = new Gerente("Roger", "Rua do MultiUso", "741258963", "9123654789", 2000);
        Gerente ger2 = new Gerente("Gabriel", "Rua do Lab3", "123321", "9456357159", 1700);

        Vendedor ven = new Vendedor("Bruno Nogueira", "Rua do Segundo andar da FACOM", "7410258", "333333333", 3000, 2000);

        

        ger.salarioGratificacao();
        ger.imprimeDadosPessoais();
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println();

        ven.setMontanteVendas(4000);
        ven.imprimeDadosPessoais();
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println();

        fun.imprimeDadosPessoais();
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println();
        fun2.imprimeDadosPessoais();


        System.out.println();
        prod.imprimeDados();
    }
}