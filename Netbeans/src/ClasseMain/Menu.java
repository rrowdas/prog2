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

    public void telaInicial() {
        System.out.println("");
        System.out.println("\t\t\t\tBem vindo à Padaria Trem Bão");
        System.out.println();
        System.out.println();
        System.out.println("Selecione uma opção:");
        System.out.println("1 : Manipular CADASTROS e REMOÇÕES");
        System.out.println("2 : Realizar uma NOVA VENDA");
        System.out.println("3 : CONSULTAR dados");
        System.out.println("0 : SAIR");
        System.out.println();
        System.out.print("Escolha uma opcao: ");
    }

    public void consultar() {
        System.out.println("");
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
        System.out.println("");
        System.out.println("9 : Imposto sobre vendas");
        System.out.println("10 - Imposto sobre salarios");
        System.out.println("");
        System.out.println("0 : Voltar");
        System.out.println();
        System.out.print("Escolha uma opcao: ");

    }

    public void cadastrarOuRemover() {
        System.out.println("");
        System.out.println("\t\t\t\tCADASTRAR/REMOVER");
        System.out.println();
        System.out.println();
        System.out.println("O que deseja cadastrar?:");
        System.out.println("1 : Clientes");
        System.out.println("2 : Fornecedores");
        System.out.println("3 : Funcionarios");
        System.out.println("4 : Produtos");
        System.out.println("0 : Voltar");
        System.out.println();
        System.out.print("Escolha uma opcao: ");

    }
    public void acao(){
        System.out.println("");
        System.out.println("\t\t\t\tOPCOES");
        System.out.println();
        System.out.println();
        System.out.println("O que deseja fazer?:");
        System.out.println("1 : Cadastrar");
        System.out.println("2 : Remover");
        System.out.println("3 : Atualizar");
        System.out.println("0 : Voltar");
        System.out.println();
        System.out.print("Escolha uma opcao: ");
    }
    
    public void tipoFuncionario(){
        System.out.println("");
        System.out.println("");
        System.out.println("Qual funcionario sera cadastrado?");
        System.out.println("1 - Gerente");
        System.out.println("2 - Padeiro");
        System.out.println("3 - Vendedor");
        System.out.println("0 - Voltar");
        System.out.print("Escolha uma opcao: ");

    }

    public void opcaoInvalida() {
        System.out.println("");
        System.out.println("Opcao inválido");
        System.out.println("");
    }
    
}
