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

/**
 *
 * @author roger
 */
public class PadTremBaoTeste {
    public static void main(String[] args){

        //TESTANDO APENAS O RECORRENTE!!
        Recorrente r1 = new Recorrente("Fernando", "Rua da UFMS","12345678996325", 0);
        
        r1.imprimeDados();
        r1.setNome("Kendy");
        r1.setCnpj("52369987654321");
        r1.setEndereco("Rua da Universidade Federal de Mato Grosso do Sul");
        r1.setTaxaDesconto(0.30);
        
        r1.imprimeDados(); //Aplicando os sets
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        //TESTANDO APENAS O OCASIONAL!!
        Ocasional oc = new Ocasional("Gabriel", "Rua do Multiuso","12223331472583");
        
        oc.imprimeDados();
        oc.setNome("Nao lembro o sobrenome kk");
        oc.setCnpj("151151515121744");
        oc.setEndereco("Rua da sala 16");
        
        oc.imprimeDados(); //Aplicando os sets
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        //TESTANDO APENAS O GERENTE!!
        Gerente ger = new Gerente("Roger", "FACOM", "75395146280","7410-0258" ,3000.00);
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
        Clientes cl = new Clientes("Menino Neymar","14 de julho", "99947123548", "4002-6400");
        
        cl.imprimeDados();
         //Aplicando os sets aqui!
        cl.setNome("Junior");
        cl.setCpf("100012378945");
        cl.setEndereco("Bosque dos Ypes");
        cl.setTelefone("4002-8922");
        cl.setAcumuladoCompras(150);
        cl.imprimeDados();

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        //TESTANDO O PRODUTO
        Pereciveis 
        Pereciveis pao = new Pereciveis("Pão", "123456", r1, 4.00, "Cacetinho", 1, 12, 5, 2018);



    }
}
