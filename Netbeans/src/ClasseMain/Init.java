package ClasseMain;

import Clientes.Clientes;
import Fornecedores.Fornecedores;
import Fornecedores.Ocasional;
import PadTremBao.PadTremBao;
import java.util.Scanner;

public class Init {

    Scanner teclado = new Scanner(System.in);
    Menu menu = new Menu();
    PadTremBao padaria = new PadTremBao();

    public void menu() {

        String opcao;
        do {
            menu.telaInicial();
            opcao = teclado.nextLine();

            switch (opcao) {
//                case "1":
//                    cadastrar();
//                    break;
//
//                case "2":
//                    vender();
//                    break;

                case "3":
                    System.out.println("ENtrou");
                    consultar();
                    break;

//                case "4":
//                    definir();
//                    break;
                case "0":
                    System.exit(0);

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (true);

    }

    public void consultar() {

        String opcao;

        do {
            menu.consultar();
            opcao = teclado.nextLine();

            switch (opcao) {
                case "1":
                    padaria.imprimeDadosClientes(teclado.nextLine());
                    break;
                case "2":
                    padaria.imprimeDadosClientes();
                    break;
                case "3":
                    padaria.imprimeDadosFornecedores(teclado.nextLine());
                    break;
                case "4":
                    padaria.imprimeDadosFornecedores();
                    break;
                case "5":
                    padaria.imprimeDadosFuncionarios(teclado.nextLine());
                    break;
                case "6":
                    padaria.imprimeDadosFuncionarios();
                    break;
                case "7":
                    padaria.imprimeDadosProdutos(teclado.nextLine());
                    break;
                case "8":
                    padaria.imprimeDadosProdutos();
                    break;
                default:
                    menu.opcaoInvalida();
                    break;
            }
        } while (opcao.equals("0"));
    }

    public void cadastrarOuRemover() {
        String opcao;

        do {
            menu.cadastrarOuRemover();
            opcao = teclado.nextLine();

            switch (opcao) {
                case "1":
                    opcoesCliente();
                    break;
                case "2":
                    padaria.imprimeDadosClientes();
                    break;
                case "3":
                    padaria.imprimeDadosFornecedores(teclado.nextLine());
                    break;
                case "4":
                    padaria.imprimeDadosFornecedores();
                    break;
                default:
                    menu.opcaoInvalida();
                    break;
            }

        } while (opcao.equals("0"));
    }

    public void opcoesCliente() {
        String opcao;

        do {
            menu.acao();
            opcao = teclado.next();

            switch (opcao) {
                case "1":
                    System.out.println("Nome: ");
                    String nome = teclado.nextLine();

                    System.out.println("Endereco: ");
                    String endereco = teclado.nextLine();

                    System.out.println("CPF: ");
                    String cpf = teclado.nextLine();

                    System.out.println("Telefone: ");
                    String telefone = teclado.nextLine();

                    Clientes c1 = new Clientes(nome, endereco, cpf, telefone);

                    padaria.cadastraCliente(c1);
                    break;
                case "2":
                    System.out.println("Escreva o CPF do cliente: ");
                    padaria.removeCliente(teclado.nextLine());
                    break;
                case "3":
                    System.out.println("CPF do cliente que deseja atualizar: ");
                    //if()                                                                    ATUALIZAR AINDA ESSE NEGÓCIO
                    padaria.imprimeDadosClientes(teclado.nextLine());
                    break;
                default:
                    menu.opcaoInvalida();
                    break;
            }

        } while (opcao.equals("0"));
        
        
    public void opcoesFornecedor() {
        String opcao;

        do {
            menu.acao();
            opcao = teclado.next();

            switch (opcao) {
                case "1":
                    System.out.println("Nome: ");
                    String nome = teclado.nextLine();
                    
                    System.out.println("Endereco: ");
                    String endereco = teclado.nextLine();

                    System.out.println("CNPJ: ");
                    String cnpj = teclado.nextLine();
                    
                    System.out.println("Taxa de Desconto (em ): ");
                    String cnpj = teclado.nextLine();
                    
                    if(tax)
                    Ocasional oc1 = new Ocasional(nome, endereco, cnpj);
                    padaria.cadastraFornecedor(oc1);
                    break;
                case "2":
                    System.out.println("Escreva o CNPJ do fornecedor: ");
                    padaria.removeFornecedor(teclado.nextLine());
                    break;
                case "3":
                    System.out.println("CNPJ do fornecedor que deseja atualizar: ");
                    //if()                                                                    ATUALIZAR AINDA ESSE NEGÓCIO
                    padaria.imprimeDadosFornecedores(teclado.nextLine());
                    break;
                default:
                    menu.opcaoInvalida();
                    break;
            }

        } while (opcao.equals("0"));
    }
}
