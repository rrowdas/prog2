package ClasseMain;

import Clientes.Clientes;
import Fornecedores.Ocasional;
import Fornecedores.Recorrente;
import Funcionarios.Gerente;
import Funcionarios.Padeiro;
import Funcionarios.Vendedor;
import PadTremBao.PadTremBao;
import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);

    PadTremBao padaria = new PadTremBao();

    Recorrente r1 = new Recorrente("Fernando", "Rua da UFMS", "12345678996325", 0);
    Ocasional oc = new Ocasional("Gabriel", "Rua do Multiuso", "12223331472583");
    Gerente ger = new Gerente("Roger", "FACOM", "75395146280", "7410-0258", 3000.00);
    Vendedor ven = new Vendedor("Victor", "Mato Grosso", "00147369900", "1236-5478", 1200.00);
    Padeiro pad = new Padeiro("Ronaldinho", "Rua dos Drible", "10101010101010", "9638-5274", 1500.0, 48, 20);
    Clientes cl = new Clientes("Menino Neymar", "14 de julho", "99947123548", "4002-6400");

    //////////////////////////////////////////////////////////////////////////////////////////////////
    //Tela Inicial
//    public void telaInicial() {
//        System.out.println("\t\t\t\tBem vindo à Padaria Trem Bão");
//        System.out.println();
//        System.out.println();
//        System.out.println("Selecione uma opção:");
//        System.out.println("1 : Manipular CADASTROS e REMOÇÕES");
//        System.out.println("2 : Realizar uma NOVA VENDA");
//        System.out.println("3 : CONSULTAR dados");
//        System.out.println("4 : DEFINIR Padrões");
//        System.out.println("5 : SAIR");
//        int opcao;
//        opcao = teclado.nextInt();
//
//        switch (opcao) {
//            case 1:
//                cadastrar();
//                break;
//
//            case 2:
//                vender();
//                break;
//
//            case 3:
//                consultar();
//                break;
//
//            case 4:
//                definir();
//                break;
//
//            case 0:
//                System.exit(0);
//
//            default:
//                System.out.println("Opção Inválida!");
//                telaInicial();
//                break;
//        }
//    }
//    public void consultar() {
//        System.out.println("\t\t\t\tCONSULTAR");
//        System.out.println();
//        System.out.println();
//        System.out.println("O que deseja verificar?:");
//        System.out.println();
//        System.out.println("1 : Cliente específico");
//        System.out.println("2 : Lista com TODOS os Clientes");
//        System.out.println();
//        System.out.println("3 : Fornecedor específico");
//        System.out.println("4 : Lista com TODOS os Fornecedores");
//        System.out.println();
//        System.out.println("5 : Funcionário específico");
//        System.out.println("6 : Lista com TODOS os Funcionários");
//        System.out.println();
//        System.out.println("7 : Produto específico");
//        System.out.println("8 : Lista com TODOS os Produtos");
//        System.out.println("0 : SAIR");
//
//        int opcao = teclado.nextInt();
//
//        switch (opcao) {
//            case 1:
//                while () {
//
//                    System.out.println("Por favor digite o número de CPF do Cliente a ser consultado: ");
//                    padaria.imprimeDadosClientes(teclado.next());
//                }
//                    break;
//            case 2:
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            case 5:
//                break;
//            case 6:
//                break;
//            case 7:
//                break;
//            case 8:
//                break;
//            case 0:
//                telaInicial();
//                break;
//        }
//    }
    public void telaInicial() {
        System.out.println("\t\t\t\tBem vindo à Padaria Trem Bão");
        System.out.println();
        System.out.println();
        System.out.println("Selecione uma opção:");
        System.out.println("1 : Manipular CADASTROS e REMOÇÕES");
        System.out.println("2 : Realizar uma NOVA VENDA");
        System.out.println("3 : CONSULTAR dados");
        System.out.println("4 : DEFINIR Padrões");
        System.out.println("5 : SAIR");
        System.out.println();
        System.out.println("Escolha uma opcao:");
    }

    public void consultar() {
        System.out.println("\t\t\t\tCONSULTAR");
        System.out.println();
        System.out.println();
        System.out.println("O que deseja verificar?:");
        System.out.println();
        System.out.println("1 : Cliente específico");
        System.out.println("2 : Lista com TODOS os Clientes");
        System.out.println();
        System.out.println("3 : Fornecedor específico");
        System.out.println("4 : Lista com TODOS os Fornecedores");
        System.out.println();
        System.out.println("5 : Funcionário específico");
        System.out.println("6 : Lista com TODOS os Funcionários");
        System.out.println();
        System.out.println("7 : Produto específico");
        System.out.println("8 : Lista com TODOS os Produtos");
        System.out.println("0 : SAIR");
        System.out.println();
        System.out.println("Escolha uma opcao:");

    }

    public void cadastrar() {
        System.out.println("\t\t\t\tCADASTRAR/REMOVER");
        System.out.println();
        System.out.println();
        System.out.println("O que deseja cadastrar?:");
        System.out.println("1 : Clientes");
        System.out.println("2 : Fornecedores");
        System.out.println("3 : Funcionarios");
        System.out.println("4 : Produtos");
        System.out.println();
        System.out.println("Escolha uma opcao:");

    }
    public void acao()

    public void opcaoInvalida() {
        System.out.println("Opcao inválido");
    }
}
