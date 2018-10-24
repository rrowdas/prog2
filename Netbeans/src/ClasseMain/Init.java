package ClasseMain;

import Clientes.Clientes;
import Fornecedores.Fornecedores;
import Fornecedores.Ocasional;
import Fornecedores.Recorrente;
import Funcionarios.Gerente;
import Funcionarios.Padeiro;
import Funcionarios.Vendedor;
import PadTremBao.PadTremBao;
import Produtos.Pereciveis;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Init {

    Scanner teclado = new Scanner(System.in);
    Menu menu = new Menu();
    PadTremBao padaria;
    ValidacaoRegras valida = new ValidacaoRegras();

    public Init(PadTremBao padaria) {
        this.padaria = padaria;
    }

    public void menu() {

        String opcao;

        do {
            menu.telaInicial();
            opcao = teclado.nextLine();

            switch (opcao) {
                case "1":
                    cadastrarOuRemover();
                    break;

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
                case "0":
                    return;
                default:
                    menu.opcaoInvalida();
                    break;
            }
        } while (true);
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
            opcao = teclado.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Nome: ");
                    String nome = teclado.nextLine();

                    System.out.print("Endereco: ");
                    String endereco = teclado.nextLine();

                    System.out.print("CPF: ");
                    String cpf = teclado.nextLine();
                    while (!valida.validaCpf(cpf)) {
                        System.out.print("Cpf invalio, digite novamente:");
                        cpf = teclado.nextLine();
                    }

                    System.out.print("Telefone: ");
                    String telefone = teclado.nextLine();

                    Clientes c1 = new Clientes(nome, endereco, cpf, telefone); // Cria o cliente
                    padaria.cadastraCliente(c1);
                    break;

                case "2":
                    System.out.print("Escreva o CPF do cliente: ");
                    padaria.removeCliente(teclado.nextLine());
                    break;

                case "3":
                    System.out.print("CPF do cliente que deseja atualizar: ");
                    String cpfAtualiza = teclado.nextLine();
                    padaria.imprimeDadosClientes(cpfAtualiza);

                    System.out.print("Novo nome: ");
                    padaria.getCliente()[padaria.consultaCliente(cpfAtualiza)].setNome(teclado.nextLine());

                    System.out.print("Novo endereco: ");
                    padaria.getCliente()[padaria.consultaCliente(cpfAtualiza)].setEndereco(teclado.nextLine());

                    System.out.print("Novo telefone: ");
                    padaria.getCliente()[padaria.consultaCliente(cpfAtualiza)].setTelefone(teclado.nextLine());

                    break;
                case "0":
                    return;

                default:
                    menu.opcaoInvalida();
                    break;
            }

        } while (true);

    }

    public void opcoesFornecedor() {
        String opcao;

        do {
            menu.acao();
            opcao = teclado.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Nome: ");
                    String nome = teclado.nextLine();

                    System.out.print("Endereco: ");
                    String endereco = teclado.nextLine();

                    System.out.print("CNPJ: ");
                    String cnpj = teclado.nextLine();

                    while (valida.validaCnpj(cnpj)) {
                        System.out.print("Cnpj invalido, digite novamente:");
                        cnpj = teclado.nextLine();
                    }

                    System.out.print("Taxa de Desconto (em decimal), caso o cliente seja ocasional, coloque 0: ");
                    double taxaDesconto = teclado.nextDouble();

                    if (taxaDesconto != 0.0) {
                        Recorrente rec1 = new Recorrente(nome, endereco, cnpj, taxaDesconto);
                        padaria.cadastraFornecedor(rec1);
                    } else {
                        Ocasional oc1 = new Ocasional(nome, endereco, cnpj);
                        padaria.cadastraFornecedor(oc1);
                    }

                    break;
                case "2":
                    System.out.println("Escreva o CNPJ do fornecedor: ");
                    padaria.removeFornecedor(teclado.nextLine());
                    break;
                case "3":
                    System.out.print("CNPJ do fornecedor que deseja atualizar: ");
                    String cnpjAtualiza = teclado.nextLine();
                    padaria.imprimeDadosClientes(cnpjAtualiza);

                    System.out.print("Novo nome: ");
                    padaria.getFornecedor()[padaria.consultaCliente(cnpjAtualiza)].setNome(teclado.nextLine());

                    System.out.print("Novo endereco: ");
                    padaria.getFornecedor()[padaria.consultaCliente(cnpjAtualiza)].setEndereco(teclado.nextLine());

                case "0":
                    return;

                default:
                    menu.opcaoInvalida();
                    break;
            }

        } while (true);
    }

    public void opcoesFuncionario() {
        String opcao;

        do {
            menu.acao();
            opcao = teclado.nextLine();

            switch (opcao) {
                case "1":
                    menu.tipoFuncionario();
                    String opcao2 = teclado.nextLine();

                    System.out.print("Nome: ");
                    String nome = teclado.nextLine();

                    System.out.print("Endereco: ");
                    String endereco = teclado.nextLine();

                    System.out.print("CPF: ");
                    String cpf = teclado.nextLine();
                    while (!valida.validaCpf(cpf)) {
                        System.out.print("Cpf invalio, digite novamente:");
                        cpf = teclado.nextLine();
                    }

                    System.out.print("Telefone: ");
                    String telefone = teclado.nextLine();

                    System.out.println("Salario Base:");
                    double salario = teclado.nextDouble();

                    if (opcao2.equals("1")) {
                        Gerente g1 = new Gerente(nome, endereco, cpf, telefone, salario);
                        padaria.cadastraFuncionario(g1);
                    } else if (opcao2.equals("2")) {
                        System.out.println("Horas normais trabalhadas: ");
                        int horasNormais = teclado.nextInt();

                        System.out.println("Horas alternativas trabalhadas");
                        int horasAlternativa = teclado.nextInt();

                        Padeiro p1 = new Padeiro(nome, endereco, cpf, telefone, salario, horasNormais, horasAlternativa);
                        padaria.cadastraFuncionario(p1);
                    } else if (opcao2.equals("3")) {
                        Vendedor v1 = new Vendedor(nome, endereco, cpf, telefone, salario);
                        padaria.cadastraFuncionario(v1);
                    } else {
                        menu.opcaoInvalida();
                    }

                    break;

                case "2":
                    System.out.print("Escreva o CPF do cliente: ");
                    padaria.removeFuncionario(teclado.nextLine());
                    break;

                case "3":
                    System.out.print("CPF do funcionario que deseja atualizar: ");
                    String cpfAtualiza = teclado.nextLine();
                    padaria.imprimeDadosFuncionarios(cpfAtualiza);

                    System.out.print("Novo nome: ");
                    padaria.getFuncionario()[padaria.consultaFuncionario(cpfAtualiza)].setNome(teclado.nextLine());

                    System.out.print("Novo endereco: ");
                    padaria.getFuncionario()[padaria.consultaFuncionario(cpfAtualiza)].setEndereco(teclado.nextLine());

                    System.out.print("Novo telefone: ");
                    padaria.getFuncionario()[padaria.consultaFuncionario(cpfAtualiza)].setTelefone(teclado.nextLine());

                    System.out.print("Novo salario base: ");
                    padaria.getFuncionario()[padaria.consultaFuncionario(cpfAtualiza)].setSalarioBase(teclado.nextDouble());

                    //FALTA MODIFICAR AS HORAS DO PADEIRO;
                    break;
                case "0":
                    return;

                default:
                    menu.opcaoInvalida();
                    break;
            }

        } while (true);

    }

    public void opcoesProduto() {
        String opcao;

        do {
            menu.acao();
            opcao = teclado.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Nome: ");
                    String nome = teclado.nextLine();

                    System.out.print("Codigo do Produto: ");
                    String codigo = teclado.nextLine();
                    while (!valida.validaCodigo(codigo)) {
                        System.out.print("Cpf invalio, digite novamente:");
                        codigo = teclado.nextLine();
                    }

                    System.out.print("Cnpj do Fornecedor: ");
                    String cnpj = teclado.nextLine();
                    while (!valida.validaCnpj(cnpj)) {
                        System.out.print("Cpf invalio, digite novamente:");
                        cnpj = teclado.nextLine();
                    }

                    System.out.print("Preco de custo, caso seja um fornecedor recorrente, o desconto será aplicado automaticamente: ");
                    double precoDeCusto = teclado.nextDouble();

                    System.out.print("Preco final no qual vai vender: ");
                    double precoFinal = teclado.nextDouble();

                    System.out.println("Apelido: ");
                    String apelido = teclado.nextLine();

                    System.out.println("Caso seja perecivel, coloque as datas abaixo. Se caso nao for perecivel, apenas aperte enter");
                    System.out.println("Dia: ");
                    int dia = teclado.nextInt();

                    while (!valida.validaCnpj(cnpj)) {
                        System.out.print("Cpf invalio, digite novamente:");
                        cnpj = teclado.nextLine();
                    }

                    System.out.println("Mes: ");
                    int mes = teclado.nextInt();
                    while (!valida.validaCnpj(cnpj)) {
                        System.out.print("Cpf invalio, digite novamente:");
                        cnpj = teclado.nextLine();
                    }

                    System.out.println("Ano: ");
                    int ano = teclado.nextInt();
                    try {
                            System.out.print("Cpf invalio, digite novamente:");
                            cnpj = teclado.nextLine();
                    } catch (InputMismatchException a) {
                        System.out.println("Tem que ser numero, digite novamente.");
                    }

                    break;

                case "2":
                    System.out.print("Escreva o CPF do cliente: ");
                    padaria.removeCliente(teclado.nextLine());
                    break;

                case "3":
                    System.out.print("CPF do cliente que deseja atualizar: ");
                    String cpfAtualiza = teclado.nextLine();
                    padaria.imprimeDadosClientes(cpfAtualiza);

                    System.out.print("Novo nome: ");
                    padaria.getCliente()[padaria.consultaCliente(cpfAtualiza)].setNome(teclado.nextLine());

                    System.out.print("Novo endereco: ");
                    padaria.getCliente()[padaria.consultaCliente(cpfAtualiza)].setEndereco(teclado.nextLine());

                    System.out.print("Novo telefone: ");
                    padaria.getCliente()[padaria.consultaCliente(cpfAtualiza)].setTelefone(teclado.nextLine());

                    break;
                case "0":
                    return;

                default:
                    menu.opcaoInvalida();
                    break;
            }

        } while (true);
    }

}
