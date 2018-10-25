package ClasseMain;

import Clientes.Clientes;
import Fornecedores.Fornecedores;
import Fornecedores.Ocasional;
import Fornecedores.Recorrente;
import Funcionarios.Gerente;
import Funcionarios.Padeiro;
import Funcionarios.Vendedor;
import PadTremBao.PadTremBao;
import Produtos.NaoPereciveis;
import Produtos.Pereciveis;
import Vendas.Prazo;
import Vendas.Vista;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    
    Opcoes op = new Opcoes();

    public void menu() {

        String opcao;

        do {
            menu.telaInicial();
            opcao = teclado.nextLine();

            switch (opcao) {
                case "1":
                    cadastrarOuRemover();
                    break;

                case "2":
                    venda();
                    break;
                case "3":
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
                case "9":
                    padaria.impostoSobreVendas();
                    break;
                case "10":
                    padaria.impostoSobreSalarios();
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
                    op.opcoesCliente(padaria, menu, valida);
                    break;
                case "2":
                    op.opcoesFornecedor(padaria, menu, valida);
                    break;
                case "3":
                    op.opcoesFuncionario(padaria, menu, valida);
                    break;
                case "4":
                    op.opcoesProduto(padaria, menu, valida);
                    break;
                case "0":
                    return;
                default:
                    menu.opcaoInvalida();
                    break;
            }

        } while (true);
    }


    public void venda() {

        System.out.print("Olá, para fazer uma nova venda, digite a data de hoje nesse formato(##/##/##). Por favor:");
        String data = teclado.nextLine();
//        Date data = null;
//        String dataTexto = new String();
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//        try {
//            format.setLenient(false);
//            data = format.parse(dataTexto);
//        } catch (ParseException e) {
//            System.out.println("Data invalida");
//        }

        System.out.print("Cpf do vendendor: ");
        String cpfVe = teclado.nextLine();
        while (!valida.validaCpf(cpfVe)) {
            System.out.print("Cpf invalido, digite novamente:");
            cpfVe = teclado.nextLine();
        }

        System.out.print("Forma de pagamento(dinheiro, debito ou credito): ");
        String formaPag = teclado.nextLine();
        while (!valida.validaFormaPagamento(formaPag)) {
            System.out.print("Forma de pagamento invalido, escolha dinheiro, debito ou credito: ");
            formaPag = teclado.nextLine();
        }

        System.out.print("Cpf do cliente: ");
        String cpfCl = teclado.nextLine();
        while (!valida.validaCpf(cpfCl)) {
            System.out.print("Cpf invalido, digite novamente:");
            cpfCl = teclado.nextLine();
        }

        System.out.println("Numero de parcelas: ");
        String parcelas = teclado.nextLine();
        while (!valida.validaCpf(cpfCl)) {
            System.out.print("Numero invalido, digite novamente:");
            parcelas = teclado.nextLine();
        }

        if (parcelas.equals("1")) {
            Vista v1 = new Vista(data, cpfVe, formaPag, cpfCl);
            boolean comprar = true;

            while (comprar) {
                System.out.println("Digite 1 para adicionar produto no carrinho e 2 para fechar venda");
                String opcaoVenda = teclado.nextLine();

                switch (opcaoVenda) {

                    case "1":
                        System.out.println("Digite o codigo do produto que deseja adicionar");
                        String codigoProduto = teclado.nextLine();

                        padaria.imprimeDadosProdutos(codigoProduto);
                        padaria.adicionaProduto(codigoProduto);

                        break;
                    case "2":
                        padaria.finalizaVenda();
                        comprar = false;
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                        break;

                }

            }

        } 
        else {
            int novaPa = Integer.parseInt(parcelas);
            Prazo p1 = new Prazo(data, cpfVe, formaPag, cpfCl, novaPa);

            boolean comprar = true;

            while (comprar) {
                System.out.println("Digite 1 para adicionar produto no carrinho e 2 para fechar venda");
                String opcaoVenda = teclado.nextLine();

                switch (opcaoVenda) {

                    case "1":
                        System.out.println("Digite o cpf do produto que deseja adicionar");
                        String cpfProduto = teclado.nextLine();

                        padaria.imprimeDadosProdutos(cpfProduto);
                        padaria.adicionaProduto(cpfProduto);

                        break;
                    case "2":
                        padaria.finalizaVenda();
                        comprar = false;
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                        break;

                }

            }

        }

    }
    
}
