/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseMain;

import Clientes.Clientes;
import Fornecedores.Ocasional;
import Fornecedores.Recorrente;
import Funcionarios.Gerente;
import Funcionarios.Padeiro;
import Funcionarios.Vendedor;
import PadTremBao.PadTremBao;
import Produtos.NaoPereciveis;
import Produtos.Pereciveis;
import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Opcoes {

    Scanner teclado = new Scanner(System.in);

    public void opcoesCliente(PadTremBao padaria, Menu menu, ValidacaoRegras valida) {
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
                        System.out.print("Cpf invalido, digite novamente:");
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

    public void opcoesFornecedor(PadTremBao padaria, Menu menu, ValidacaoRegras valida) {
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

    public void opcoesFuncionario(PadTremBao padaria, Menu menu, ValidacaoRegras valida) {
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
                        System.out.print("Cpf invalido, digite novamente:");
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

    public void opcoesProduto(PadTremBao padaria, Menu menu, ValidacaoRegras valida) {
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
                        System.out.print("Cpf invalido, digite novamente:");
                        codigo = teclado.nextLine();
                    }

                    System.out.print("Cnpj do Fornecedor: ");
                    String cnpj = teclado.nextLine();
                    while (!valida.validaCnpj(cnpj)) {
                        System.out.print("Cpf invalido, digite novamente:");
                        cnpj = teclado.nextLine();
                    }

                    System.out.print("Preco de custo, caso seja um fornecedor recorrente, o desconto será aplicado automaticamente: ");
                    double precoDeCusto = teclado.nextDouble();
                    precoDeCusto = padaria.getFornecedor()[padaria.consultaFornecedor(cnpj)].getTaxaDesconto();

                    System.out.print("Preco final no qual vai vender: ");
                    double precoFinal = teclado.nextDouble();

                    System.out.println("Apelido: ");
                    String apelido = teclado.nextLine();

                    System.out.println("Caso seja perecivel, coloque as datas abaixo. Se caso nao for perecivel, apenas aperte enter");
                    System.out.print("Dia: ");
                    String dia = teclado.nextLine();

                    while (!valida.validaDia(dia)) {
                        System.out.print("Dia invalido, digite novamente: ");
                        dia = teclado.nextLine();
                    }

                    System.out.print("Mes: ");
                    String mes = teclado.nextLine();
                    while (!valida.validaMes(mes)) {
                        System.out.print("Mes invalido, digite novamente: ");
                        mes = teclado.nextLine();
                    }

                    System.out.print("Ano: ");
                    String ano = teclado.nextLine();

                    while (!valida.validaDigito(ano)) {
                        System.out.println("Ano invalido, digite novamente: ");
                        ano = teclado.nextLine();
                    }

                    System.out.print("Quantidade do produto: ");
                    String quantidade = teclado.nextLine();

                    if (dia.equalsIgnoreCase("") || mes.equalsIgnoreCase("") | ano.equalsIgnoreCase("")) {
                        int qntInt = Integer.parseInt(quantidade);

                        if (apelido.equals("")) {
                            NaoPereciveis n1 = new NaoPereciveis(nome, codigo, apelido, precoDeCusto, precoFinal, qntInt);
                            System.out.println("Foi cadastrado o produto " + "nome");
                        } else {
                            NaoPereciveis n1 = new NaoPereciveis(nome, codigo, apelido, precoDeCusto, precoFinal, apelido, qntInt);
                            System.out.println("Foi cadastrado o produto " + "nome");
                        }
                    } else {
                        int qntInt = Integer.parseInt(quantidade);

                        if (apelido.equals("")) {
                            Pereciveis p1 = new Pereciveis(nome, codigo, apelido, precoDeCusto, precoFinal, qntInt, qntInt, qntInt, qntInt);
                            System.out.println("Foi cadastrado o produto " + "nome");
                        } else {
                            Pereciveis p1 = new Pereciveis(nome, codigo, apelido, precoDeCusto, precoFinal, apelido, qntInt, qntInt, qntInt, qntInt);
                            System.out.println("Foi cadastrado o produto " + "nome");
                        }
                    }
                    break;

                case "2":
                    System.out.print("Escreva o codigo do produto: ");
                    padaria.getEstoque().removerProduto(teclado.nextLine());
                    break;

                case "3": // NAO TERMINADO
//                    System.out.print("Codigo do produto que deseja atualizar: ");
//                    String codigoProd = teclado.nextLine();
//                    padaria.imprimeDadosProdutos(codigoProd);
//
//                    System.out.print("Novo nome: ");
//                    padaria.getEstoque().getProdutos()[padaria.getEstoque().consultaProduto(codigoProd)].setNome(teclado.nextLine());
//
//                    System.out.print("Novo Apelido: ");
//                    padaria.getEstoque().getProdutos()[padaria.getEstoque().consultaProduto(codigoProd)].setApelido(teclado.nextLine());
//
//                    System.out.print("Novo fornecedor: ");
//                    padaria.getEstoque().getProdutos()[padaria.getEstoque().consultaProduto(codigoProd)].setFornecedor(teclado.nextLine());
//
//                    System.out.print("Novo preco de custo: ");
//                    double novoPrecoCusto = teclado.nextDouble();
//                    novoPrecoCusto = novoPrecoCusto * padaria.getFornecedor()[padaria.consultaFornecedor(cnpj)].getTaxaDesconto(); // ERRO AQUI
//                    
//                    padaria.getEstoque().getProdutos()[padaria.getEstoque().consultaProduto(codigoProd)].setPrecoCusto(novoPrecoCusto);
//                    

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
