import java.util.Scanner;
public class TesteGeral
{
    public static void main (String[] args)
    {
        System.out.println("Digite o código de SEIS dígitos: ");

        Scanner teclado = new Scanner(System.in);
        Padeiro fun = new Padeiro("Victor", "Rua da FACOM", "741258", "978654321", 1500, 50, 20);
        Funcionarios fun2 = new Padeiro("Fernando", "Rua do PET", "4521367", "97841172472", 1000, 20, 10);

        //Produtos prod = new Produtos("Pão", teclado.next(), 42.00, 100.00);
        System.out.println();

        Pereciveis pe = new Pereciveis("Arroz", teclado.next(), 30, 70, 10, 5, 2018, 10, 5, 2017);
        Pereciveis pe1 = new Pereciveis("Feijão", teclado.next(), 30, 70, 10, 5, 2018, 10, 5, 2019);
        Pereciveis pe2 = new Pereciveis("Macarrão", prod.getCodigo(), 30, 70, 10, 5, 2018, 32, 5, 2017);
       // NaoPereciveis np = new NaoPereciveis("Bolacha", teclado.next(), 3.00, 50.00)

        Gerente ger = new Gerente("Roger", "Rua do MultiUso", "741258963", "9123654789", 2000);
        Gerente ger2 = new Gerente("Gabriel", "Rua do Lab3", "123321", "9456357159", 1700);

        Vendedor ven = new Vendedor("Bruno Nogueira", "Rua do Segundo andar da FACOM", "7410258", "333333333", 3000, 2000);

        //Fornecedores forn = new Fornecedores("Pão e tal", "Euclides da Cunha", "369", 1000);
        Recorrente rec = new Recorrente("Carrefour", "Rua do Shopping", "235", 100.00, 0.10);

        Ocasional oc = new Ocasional("Sadia", "Rua Aleatória", "147", 70.00);

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
        //fun.somaSalarial(salarioBase, horasAlternativas, horasNormal);
        
        
        System.out.println();
        prod.imprimeDados();

        System.out.println();
        pe.imprimeDados();

        System.out.println();
        pe1.imprimeDados();

        System.out.println();
        pe2.imprimeDados();

        System.out.println();
        System.out.println("/////////////////////////////////////////////////");
        rec.valorFinal();
        System.out.println();
        oc.valorFinal();



        
        
        


    }
}