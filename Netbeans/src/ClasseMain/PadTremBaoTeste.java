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

        //TESTANDO APENAS O RECORRENTE!!
        Recorrente r1 = new Recorrente("Fernando", "Rua da UFMS", "12345678996325", 0);

        r1.imprimeDados();
        r1.setNome("Kendy");
        r1.setCnpj("52369987654321");
        r1.setEndereco("Rua da Universidade Federal de Mato Grosso do Sul");
        r1.setTaxaDesconto(0.30);

        r1.imprimeDados(); //Aplicando os sets
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //TESTANDO APENAS O OCASIONAL!!
        Ocasional oc = new Ocasional("Gabriel", "Rua do Multiuso", "12223331472583");

        oc.imprimeDados();
        oc.setNome("Nao lembro o sobrenome kk");
        oc.setCnpj("151151515121744");
        oc.setEndereco("Rua da sala 16");

        oc.imprimeDados(); //Aplicando os sets
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //TESTANDO APENAS O GERENTE!!
        Gerente ger = new Gerente("Roger", "FACOM", "75395146280", "7410-0258", 3000.00);
        ger.imprimeDados();
        //Aplicando os sets aqui!
        ger.setNome("Joao");
        ger.setCpf("1111111111");
        ger.setTelefone("9876-4512");
        ger.setEndereco("Rua Ceará");

        ger.imprimeDados();
        ger.setSalarioBase(0);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //TESTANDO O VENDEDOR
        Vendedor ven = new Vendedor("Victor", "Mato Grosso", "00147369900", "1236-5478", 1200.00);
        ven.imprimeDados();
        //Aplicando os sets aqui!
        ven.setNome("Joao");
        ven.setCpf("1111111111");
        ven.setTelefone("9876-4512");
        ven.setEndereco("Rua Ceará");
        ven.setMetaVendasMes(600.00);
        ven.setMontanteVendas(200);
        ven.setSalarioBase(1400);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //TESTANDO O PADEIRO
        Padeiro pad = new Padeiro("Ronaldinho", "Rua dos Drible", "10101010101010", "9638-5274", 1500.0, 48, 20);

        pad.imprimeDados();
        //Aplicando os sets aqui!
        pad.setNome("Gaucho");
        pad.setCpf("95175325846");
        pad.setEndereco("Rua Aleatório");
        pad.setTelefone("1010-1111");
        pad.setSalarioBase(1700.00);
        pad.sethorasNormais(50);
        pad.setHorasAlternativas(18);
        pad.imprimeDados();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
        //TESTANDO O CLIENTE
        Clientes c1 = new Clientes("Menino Neymar", "14 de julho", "99947123548", "4002-6400");

        c1.imprimeDados();
        //Aplicando os sets aqui!
        c1.setNome("Junior");
        c1.setCpf("100012378945");
        c1.setEndereco("Bosque dos Ypes");
        c1.setTelefone("4002-8922");
        c1.setAcumuladoCompras(150);
        c1.imprimeDados();
    
        Clientes c2 = new Clientes("Coutinho", "Marechal Rondon", "15935746820", "9214-7412");
        Clientes c3 = new Clientes("Marcelo camisa 6", "Euclides da Cunha", "47850000000", "7894-1563");
        Clientes c4 = new Clientes("Gabriel Jesus", "Afonso Pena", "22223335647", "4569-8712");
        Clientes c5 = new Clientes("Antonio", "Bom Pastor", "96357835484", "1645-2398");
        Clientes c6 = new Clientes("Alex", "Rua Goias", "55557123548", "3305-5033");
        Clientes c7 = new Clientes("Wesley", "Mato Grosso", "59963214548", "7777-8888");
        Clientes c8 = new Clientes("Rodrigo", "Rua Jupiter", "77415289631", "4563-2198");
        Clientes c9 = new Clientes("Pedro", "Rua Ceara", "33947123000", "7412-5896");
        Clientes c10 = new Clientes("Isabela", "Rua 3 Coracoes", "44444123000", "7412-5896");
        
        c2.setAcumuladoCompras(201);
        
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
        
        Ocasional oc1 = new Ocasional("Anderson", "Calogeras", "14785236995124");
        Ocasional oc2 = new Ocasional("Flavio", "Rua Aleatoria", "14785236995124");
        Ocasional oc3 = new Ocasional("Rafael", "Centro", "45698712104578");
        Ocasional oc4 = new Ocasional("Henrique", "Jarim Paulista", "96321478501236");
        Recorrente rec5 = new Recorrente("Alexandra", "Rua Amazonas", "33333123548635", 0.3);
        Recorrente rec6 = new Recorrente("Wesley", "Mato Grosso", "77778888999945", 0.4);
        Recorrente rec7 = new Recorrente("Renata", "Rua Jupiter", "456321981234567", 0.4);

        padaria.cadastraFornecedor(oc1);
        padaria.cadastraFornecedor(oc2);
        padaria.cadastraFornecedor(oc3);
        padaria.cadastraFornecedor(oc4);
        padaria.cadastraFornecedor(rec5);
        padaria.cadastraFornecedor(rec6);
        padaria.cadastraFornecedor(rec7);
        
        

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //TESTANDO O PRODUTO
        ////////////////////////////////////////////////////////////////////////////////////////////////
        // UI
        
        Init inicio = new Init(padaria);
        inicio.menu();
    }
}
