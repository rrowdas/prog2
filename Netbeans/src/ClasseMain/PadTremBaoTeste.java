/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseMain;

import Clientes.Clientes;
import PadTremBao.Informacoes;
import PadTremBao.Impostos;
import PadTremBao.PadTremBao;
import Fornecedores.Fornecedores;
import Fornecedores.Ocasional;
import Fornecedores.Recorrente;
import Funcionarios.Funcionarios;
import Funcionarios.Gerente;
import Funcionarios.Padeiro;
import Funcionarios.Vendedor;
import Funcionarios.Salario;
import Produtos.NaoPereciveis;
import Produtos.Pereciveis;
import Produtos.Produtos;
import java.util.Scanner;


/**
 *
 * @author roger
 */
public class PadTremBaoTeste {

    public static void main(String[] args) {

        Menu janela = new Menu();
        Scanner teclado = new Scanner(System.in);
        PadTremBao padaria = new PadTremBao();
//
//        //TESTANDO APENAS O RECORRENTE!!
//        Recorrente r1 = new Recorrente("Fernando", "Rua da UFMS", "12345678996325", 0);
//
//        r1.imprimeDados();
//        r1.setNome("Kendy");
//        r1.setCnpj("52369987654321");
//        r1.setEndereco("Rua da Universidade Federal de Mato Grosso do Sul");
//        r1.setTaxaDesconto(0.30);
//
//        r1.imprimeDados(); //Aplicando os sets
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//        //TESTANDO APENAS O OCASIONAL!!
//        Ocasional oc = new Ocasional("Gabriel", "Rua do Multiuso", "12223331472583");
//
//        oc.imprimeDados();
//        oc.setNome("Nao lembro o sobrenome kk");
//        oc.setCnpj("151151515121744");
//        oc.setEndereco("Rua da sala 16");
//
//        oc.imprimeDados(); //Aplicando os sets
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//        //TESTANDO APENAS O GERENTE!!
//        Gerente ger = new Gerente("Roger", "FACOM", "75395146280", "7410-0258", 3000.00);
//        ger.imprimeDados();
//        //Aplicando os sets aqui!
//        ger.setNome("Joao");
//        ger.setCpf("1111111111");
//        ger.setTelefone("9876-4512");
//        ger.setEndereco("Rua Ceará");
//
//        ger.imprimeDados();
//        ger.setSalarioBase(0);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//        //TESTANDO O VENDEDOR
//        Vendedor ven = new Vendedor("Victor", "Mato Grosso", "00147369900", "1236-5478", 1200.00);
//        ven.imprimeDados();
//        //Aplicando os sets aqui!
//        ven.setNome("Joao");
//        ven.setCpf("1111111111");
//        ven.setTelefone("9876-4512");
//        ven.setEndereco("Rua Ceará");
//        ven.setMetaVendasMes(600.00);
//        ven.setMontanteVendas(200);
//        ven.setSalarioBase(1400);
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        //TESTANDO O PADEIRO
//        Padeiro pad = new Padeiro("Ronaldinho", "Rua dos Drible", "10101010101010", "9638-5274", 1500.0, 48, 20);
//
//        pad.imprimeDados();
//        //Aplicando os sets aqui!
//        pad.setNome("Gaucho");
//        pad.setCpf("95175325846");
//        pad.setEndereco("Rua Aleatório");
//        pad.setTelefone("1010-1111");
//        pad.setSalarioBase(1700.00);
//        pad.sethorasNormais(50);
//        pad.setHorasAlternativas(18);
//        pad.imprimeDados();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
        //TESTANDO O CLIENTE
        Clientes c1 = new Clientes("Menino Neymar", "14 de julho", "99999999999", "4002-6400");

        c1.imprimeDados();
        //Aplicando os sets aqui!
        c1.setNome("Junior");
        c1.setCpf("100012378945");
        c1.setEndereco("Bosque dos Ypes");
        c1.setTelefone("4002-8922");
        c1.setAcumuladoCompras(150);
        c1.imprimeDados();

        Clientes c2 = new Clientes("Coutinho", "Marechal Rondon", "00000000000", "9214-7412");
        Clientes c3 = new Clientes("Marcelo camisa 6", "Euclides da Cunha", "11111111111", "7894-1563");
        Clientes c4 = new Clientes("Gabriel Jesus", "Afonso Pena", "22222222222", "4569-8712");
        Clientes c5 = new Clientes("Antonio", "Bom Pastor", "33333333333", "1645-2398");
        Clientes c6 = new Clientes("Alex", "Rua Goias", "44444444444", "3305-5033");
        Clientes c7 = new Clientes("Wesley", "Mato Grosso", "55555555555", "7777-8888");
        Clientes c8 = new Clientes("Rodrigo", "Rua Jupiter", "66666666666", "4563-2198");
        Clientes c9 = new Clientes("Pedro", "Rua Ceara", "77777777777", "7412-5896");
        Clientes c10 = new Clientes("Isabela", "Rua 3 Coracoes", "88888888888", "7412-5896");

        c2.setAcumuladoCompras(201);
        c6.setAcumuladoCompras(198);
        c3.setAcumuladoCompras(250);

        c4.setAcumuladoCompras(100);

        c5.setAcumuladoCompras(120);

        padaria.cadastraCliente(c1);
        padaria.cadastraCliente(c2);
        padaria.cadastraCliente(c3);
        padaria.cadastraCliente(c4);
        padaria.cadastraCliente(c5);
        padaria.cadastraCliente(c6);
        padaria.cadastraCliente(c7);
        padaria.cadastraCliente(c8);
        padaria.cadastraCliente(c9);
        padaria.cadastraCliente(c10);

        Ocasional oc1 = new Ocasional("Anderson", "Calogeras", "00000000000000");
        Ocasional oc2 = new Ocasional("Flavio", "Rua Aleatoria", "11111111111111");
        Ocasional oc3 = new Ocasional("Rafael", "Centro", "22222222222222");
        Ocasional oc4 = new Ocasional("Henrique", "Jarim Paulista", "33333333333333");
        Recorrente rec5 = new Recorrente("Alexandra", "Rua Amazonas", "44444444444444", 0.3);
        Recorrente rec6 = new Recorrente("Wesley", "Mato Grosso", "55555555555555", 0.4);
        Recorrente rec7 = new Recorrente("Renata", "Rua Jupiter", "66666666666666", 0.4);

        padaria.cadastraFornecedor(oc1);
        padaria.cadastraFornecedor(oc2);
        padaria.cadastraFornecedor(oc3);
        padaria.cadastraFornecedor(oc4);
        padaria.cadastraFornecedor(rec5);
        padaria.cadastraFornecedor(rec6);
        padaria.cadastraFornecedor(rec7);

        Padeiro padeiro1 = new Padeiro("Cesar", "Centro", "00000000000", "4433-3344", 1300.00, 40, 12);
        Vendedor ven2 = new Vendedor("Otavio", "Tres Barras", "11111111111", "3300-4747", 1100.00);
        Vendedor ven3 = new Vendedor("Joana", "Zona Norte", "22222222222", "4400-0044", 1000.00);
        Gerente ger4 = new Gerente("Gabriel", "Av. Paulista", "33333333333", "7474-0000", 2000.00);
        Padeiro padeiro5 = new Padeiro("Jonathan", "Liberdade", "44444444444", "1212-2121", 1150.00, 20, 10);

        padaria.cadastraFuncionario(padeiro1);
        padaria.cadastraFuncionario(ven2);
        padaria.cadastraFuncionario(ven3);
        padaria.cadastraFuncionario(ger4);
        padaria.cadastraFuncionario(padeiro5);
   
        // ESSA EH PRA VC ROGEEEEEEEEEEEEEEEER
        
//         milho, macarrão, feijão, soja, arroz, café, fubá, açúcar, polvilho, farinha de trigo, cevada, farelo de trigo, leite em pó, óleo, biscoitos, pipoca, achocolatado e gelatina em pó.  
//        NaoPereciveis milho = new NaoPereciveis("Milho", "111111", "11111111111111", "2.00", "6.00", "50");
//        NaoPereciveis cafe = new NaoPereciveis("Cafe", "222222", "22222222222222", "2.00", "8.00", "100");
//        NaoPereciveis gelatinaEmPo = new NaoPereciveis("Gelatina em pó", "333333", "33333333333333", "1.00", "4.00", "50");
//        NaoPereciveis acucar = new NaoPereciveis("Acucar", "444444", "44444444444444", "3.00", "6.00", "40");
//        NaoPereciveis trigo = new NaoPereciveis("Farinha de Trigo", "555555", "55555555555555", "3.00", "5.00", "50");
//        NaoPereciveis leite = new NaoPereciveis("Leite em pó", "66666", "11111111111111", "1.50", "4.00", "60");
//        NaoPereciveis trakinas = new NaoPereciveis("Trakinas", "777777", "33333333333333", "1.00", "3.50", "50");
//        NaoPereciveis oleo = new NaoPereciveis("Oleo", "888888", "22222222222222", "1.50", "3.50", "40");
//        NaoPereciveis achocolatado = new NaoPereciveis("Achocolatado", "999999", "22222222222222", "2.00", "5.00", "30");
//        NaoPereciveis fuba = new NaoPereciveis("Fuba", "101010", "55555555555555", "2.00", "6.00", "20");
//
//        Pereciveis pao = new Pereciveis("Pão", "000000", "00000000000000", "5.00", "13.00", "Cacetinho", "40", "12", "12", "2018");
//        Pereciveis brigadeiro = new Pereciveis("Brigadeiro", "111222", "00000000000000", "1.00", "3.00", "Negrinho", "60", "1", "12", "2019");
//        Pereciveis geladinho = new Pereciveis("Geladinho", "111000", "00000000000000", "0.50", "2.00", "Chup-chup", "50", "25", "11", "2019");
//        Pereciveis mingau = new Pereciveis("Mingau", "123000", "11111111111111", "4.00", "10.00", "Canjica", "30", "12", "3", "2019");
//        Pereciveis aimpim = new Pereciveis("Aimpim", "787878", "00000000000000", "6.00", "9.00", "Mandioca", "40", "21", "7", "2019");
//        Pereciveis esfiha = new Pereciveis("Esfiha", "020202", "66666666666666", "2.00", "4.00", "100", "26", "10", "2019");
//        Pereciveis chipa = new Pereciveis("Chipa", "808080", "66666666666666", "2.00", "4.00", "Pao de queijo", "100", "23", "4", "2019");
//        Pereciveis pastel = new Pereciveis("Pastel", "141414", "66666666666666", "2.00", "4.00", "100", "13", "7", "2019");
//        Pereciveis quibe = new Pereciveis("Quibe", "505050", "66666666666666", "2.00", "4.00", "100", "29", "8", "2019");
//        Pereciveis enroladinho = new Pereciveis("Enroladinho", "313131", "66666666666666", "2.00", "4.00", "100", "6", "6", "2019");

        NaoPereciveis milho = new NaoPereciveis("Milho", "111111", "11111111111111", 2.00, 6.00, 50);
        NaoPereciveis cafe = new NaoPereciveis("Cafe", "222222", "22222222222222", 2.00, 8.00, 100);
        NaoPereciveis gelatinaEmPo = new NaoPereciveis("Gelatina em pó", "333333", "33333333333333", 1.00, 4.00, 50);
        NaoPereciveis acucar = new NaoPereciveis("Acucar", "444444", "44444444444444", 3.00, 6.00, 40);
        NaoPereciveis trigo = new NaoPereciveis("Farinha de Trigo", "555555", "55555555555555", 3.00, 5.00, 50);
        NaoPereciveis leite = new NaoPereciveis("Leite em pó", "66666", "11111111111111", 1.50, 4.00, 60);
        NaoPereciveis trakinas = new NaoPereciveis("Trakinas", "777777", "33333333333333", 1.00, 3.50, 50);
        NaoPereciveis oleo = new NaoPereciveis("Oleo", "888888", "22222222222222", 1.50, 3.50, 40);
        NaoPereciveis achocolatado = new NaoPereciveis("Achocolatado", "999999", "22222222222222", 2.00, 5.00, 30);
        NaoPereciveis fuba = new NaoPereciveis("Fuba", "101010", "55555555555555", 2.00, 6.00, 20);

        Pereciveis pao = new Pereciveis("Pão", "000000", "00000000000000", 5.00, 13.00, "Cacetinho", 40, 12, 12, 2018);
        Pereciveis brigadeiro = new Pereciveis("Brigadeiro", "111222", "00000000000000", 1.00, 3.00, "Negrinho", 60, 1, 12, 2019);
        Pereciveis geladinho = new Pereciveis("Geladinho", "111000", "00000000000000", 0.50, 2.00, "Chup-chup", 50, 25, 11, 2019);
        Pereciveis mingau = new Pereciveis("Mingau", "123000", "11111111111111", 4.00, 10.00, "Canjica", 30, 12, 3, 2019);
        Pereciveis aimpim = new Pereciveis("Aimpim", "787878", "00000000000000", 6.00, 9.00, "Mandioca", 40, 21, 7, 2019);
        Pereciveis esfiha = new Pereciveis("Esfiha", "020202", "66666666666666", 2.00, 4.00, 100, 26, 10, 2019);
        Pereciveis chipa = new Pereciveis("Chipa", "808080", "66666666666666", 2.00, 4.00, "Pao de queijo", 100, 23, 4, 2019);
        Pereciveis pastel = new Pereciveis("Pastel", "141414", "66666666666666", 2.00, 4.00, 100, 13, 7, 2019);
        Pereciveis quibe = new Pereciveis("Quibe", "505050", "66666666666666", 2.00, 4.00, 100, 29, 8, 2019);
        Pereciveis enroladinho = new Pereciveis("Enroladinho", "313131", "66666666666666", 2.00, 4.00, 100, 6, 6, 2019);

        
        padaria.getEstoque().cadastrarProduto(milho);
        padaria.getEstoque().cadastrarProduto(cafe);
        padaria.getEstoque().cadastrarProduto(gelatinaEmPo);
        padaria.getEstoque().cadastrarProduto(acucar);
        padaria.getEstoque().cadastrarProduto(trigo);
        padaria.getEstoque().cadastrarProduto(leite);
        padaria.getEstoque().cadastrarProduto(trakinas);
        padaria.getEstoque().cadastrarProduto(oleo);
        padaria.getEstoque().cadastrarProduto(achocolatado);
        padaria.getEstoque().cadastrarProduto(fuba);
        padaria.getEstoque().cadastrarProduto(pao);
        padaria.getEstoque().cadastrarProduto(brigadeiro);
        padaria.getEstoque().cadastrarProduto(geladinho);
        padaria.getEstoque().cadastrarProduto(mingau);
        padaria.getEstoque().cadastrarProduto(aimpim);
        padaria.getEstoque().cadastrarProduto(esfiha);
        padaria.getEstoque().cadastrarProduto(chipa);
        padaria.getEstoque().cadastrarProduto(pastel);
        padaria.getEstoque().cadastrarProduto(quibe);
        padaria.getEstoque().cadastrarProduto(enroladinho);
                
        
        Init inicio = new Init(padaria);
        inicio.menu();
    }
}
