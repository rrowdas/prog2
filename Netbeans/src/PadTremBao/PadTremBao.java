package PadTremBao;

import Clientes.Clientes;
import Estoque.Estoque;
import Fornecedores.Fornecedores;
import Funcionarios.Funcionarios;
import Funcionarios.Vendedor;
import Vendas.Vendas;
import Produtos.Produtos;

public class PadTremBao implements Impostos {

    private int posVenda, posFuncionario, posCliente;
    private Fornecedores[] fornecedor = new Fornecedores [20];
    private Funcionarios[] funcionario = new Funcionarios[10];
    private Clientes[] cliente = new Clientes[40];
    private final Vendas[] venda = new Vendas[50];
    private final Estoque estoque = new Estoque();

    public PadTremBao() {
    }

    public Vendas[] getVenda() {
        return venda;
    }

    public Fornecedores[] getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedores[] fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Funcionarios[] getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionarios[] funcionario) {
        this.funcionario = funcionario;
    }
    
    public Estoque getEstoque(){
        return estoque;
    }
    
    public Clientes[] getCliente() {
        return cliente;
    }

    public void setCliente(Clientes[] cliente) {
        this.cliente = cliente;
    }

    public void updateCliente(Clientes c) {
        int p = consultaCliente(c.getCpf());
        this.cliente[p] = c;

    }

    public int consultaFornecedor(String cnpjConsulta) {
        int posicao = -1;
        boolean existe = false;
        for (int i = 0; i < fornecedor.length && !existe; i++) {
            if (fornecedor[i] != null && fornecedor[i].getCnpj().equalsIgnoreCase(cnpjConsulta)) {
                existe = true;
                posicao = i;
            }
        }
        return posicao;

    }

    public void cadastraFornecedor(Fornecedores novoFornecedor) {

        boolean cadastrado = false;
        if (consultaFornecedor(novoFornecedor.getCnpj()) != -1) {
            System.out.println("Esse fornecedor já está cadastrado.");

        } else {
            for (int i = 0; i < fornecedor.length  && !cadastrado; i++) {
                if (fornecedor[i] == null) {
                    System.out.println("Fornecedor " + novoFornecedor.getNome() + " cadastrado");
                    fornecedor[i] = novoFornecedor;
                    cadastrado = true;
                }
            }
            if (cadastrado == false) {
                System.out.println("Não é possível cadastrar mais fornecedores em nosso sistema (número máximo alcançado).");
            }
        }
    }

    public void removeFornecedor(String fornecedorCnpjExcluido) {

        boolean removido = false;
        int posicao = consultaFornecedor(fornecedorCnpjExcluido);

        if (posicao != -1) {
            fornecedor[posicao] = null;
            System.out.println("O Fornecedor " + fornecedor[posicao].getNome() + " foi removido.");
        } else {
            System.out.println("Fornecedor não encontrado. Tente novamente com um CNPJ válido.");
        }
    }

    public int consultaFuncionario(String cpfFuncionario) {
        int posicao = -1;
        boolean existe = false;

        for (int i = 0; i < funcionario.length && !existe; i++) {
            if (funcionario[i] != null && funcionario[i].getCpf().equalsIgnoreCase(cpfFuncionario)) {
                existe = true;
                posicao = i;
            }
        }
        return posicao;
    }

    public void cadastraFuncionario(Funcionarios novoFuncionario) {

        boolean cadastrado = false;
        if (consultaFuncionario(novoFuncionario.getCpf()) != -1) {
            System.out.println("Esse funcionario já está cadastrado.");
        } else {
            for (int i = 0; i < funcionario.length && !cadastrado; i++) {
                if (funcionario[i] == null) {
                    System.out.println("Funcionario " + novoFuncionario.getNome() + " cadastrado");
                    funcionario[i] = novoFuncionario;
                    cadastrado = true;
                }
            }
            if (cadastrado == false) {
                System.out.println("Não é possível cadastrar mais funcionario em nosso sistema (número máximo alcançado).");
            }
        }
    }

    public void removeFuncionario(String funcionarioCpfExcluido) {

        boolean removido = false;
        int posicao = consultaFuncionario(funcionarioCpfExcluido);

        if (posicao != -1) {
            funcionario[posicao] = null;
            System.out.println("O Funcionario " + funcionario[posicao].getNome() + " foi removido.");
        } else {
            System.out.println("Funcionario não encontrado. Tente novamente com um CPF válido.");
        }
    }

    public int consultaCliente(String cpfCliente) {

        int posicao = -1;
        boolean existe = false;

        for (int i = 0; i < cliente.length && !existe; i++) {
            if (cliente[i] != null && cliente[i].getCpf().equalsIgnoreCase(cpfCliente)) {
                existe = true;
                posicao = i;
            }
        }
        return posicao;
    }

    public void cadastraCliente(Clientes novoCliente) {

        boolean cadastrado = false;
        if (consultaCliente(novoCliente.getCpf()) != -1) {
            System.out.println("Esse cliente já está cadastrado.");
        } else {
            for (int i = 0; i < cliente.length && !cadastrado; i++) {
                if (cliente[i] == null) {
                    System.out.println("Cliente " + novoCliente.getNome() + " cadastrado");
                    cliente[i] = novoCliente;
                    cadastrado = true;
                }
            }
            if (cadastrado == false) {
                System.out.println("Não é possível cadastrar mais clientes em nosso sistema (número máximo alcançado).");
            }
        }
    }

    public boolean removeCliente(String clienteCpfExcluido) {

        boolean removido = false;
        int posicao = consultaCliente(clienteCpfExcluido);

        if (posicao != -1) {
             System.out.println("O Cliente " + cliente[posicao].getNome() + " foi removido.");
            cliente[posicao] = null;
           
            return true;
        } else {
            System.out.println("Cliente não encontrado. Tente novamente com um CPF válido.");
            return false;
        }
    }

    public void adicionaVenda(Vendas novaVenda) {
        boolean vendaAdicionado = false;
        this.posCliente = consultaCliente(novaVenda.getCpfCliente());
        this.posFuncionario = consultaFuncionario(novaVenda.getCpfVendedor());

        if (posCliente != -1 && posFuncionario != -1) {

            for (int i = 0; i < venda.length && !vendaAdicionado; i++) {
                if (venda[i] == null) {
                    venda[i] = novaVenda;
                    vendaAdicionado = true;
                    this.posVenda = i;
                }
            }
        } else {
            System.out.println("CPF(s) não cadastrado(s), impossível realizar a venda.");
        }

    }

    //posicao, prodtoObjeto, Existe?, Qtde, adicionar, retirar 1 estoque, verificar status(mandar aviso)
    public void adicionaProduto(String codigoProduto) {
        int posProduto = estoque.consultaProduto(codigoProduto);    //retorna posicao do produto, -1 se nao existe

        if (posProduto != -1) {                                     //nao esquecer do ELSE
            Produtos auxProd = estoque.getProdutos()[posProduto];   // atribui a auxProd o Produto que foi consultado //MINHA DUVIDA DO APONTADOR DE MEMORIA
            if (auxProd.getQuantidade() == 0) // ve se tem produto em estoque
            {
                System.out.println("Não há produto no estoque, REABASTECER!");
            } else {
                venda[posVenda].adicionaProdutoCarrinho(auxProd);
                estoque.getProdutos()[posProduto].setQuantidade(estoque.getProdutos()[posProduto].getQuantidade() - 1);
                System.out.println("Produto " + estoque.getProdutos()[posProduto].getNome() + " foi cadastrado.");
                
                if (estoque.getProdutos()[posProduto].getQuantidade() == 1) //ALERTA PRODUTO ACABANDO
                {
                    System.out.println("Possui apenas 1 produto, favor reabastecer. ");
                }
            }
        }
    }

    //totalvenda*fidelidade, adc no cliente, adc no vendedor
    public void finalizaVenda() {
        double valorFinalVenda = venda[posVenda].getValorTotalDoCarrinho() * cliente[posCliente].cartaoFidelidade(); //valor Atual do carrinho * ajuste de cartao fidelidade
        cliente[posCliente].setAcumuladoCompras(valorFinalVenda);    // atualizar o acumulado do cliente para compras futuras (cartao fidelidade)
        Vendedor vendedor = (Vendedor) funcionario[posFuncionario];  //god typecast pra poder usar método de montante vendas do vendedor (afinal de contas só vendedor faz vendas)
        vendedor.setMontanteVendas(valorFinalVenda);  // atualizacao do montate do vendedor pra aumentar o salario do coitado
        venda[posVenda].setValorTotalDoCarrinho(valorFinalVenda);    //Atualizando o valor total da venda para fins tributarios
    }

    @Override
    public double impostoSobreVendas() {
        double vendasTotal = 0.0;
        for (int i = 0; i < venda.length; i++) {
            vendasTotal += venda[i].getValorTotalDoCarrinho();
        }
        return vendasTotal * 0.15;
    }

    @Override
    public double impostoSobreSalarios() {
        double salariosTotal = 0.0;
        for (int i = 0; i < funcionario.length; i++) {
            salariosTotal += funcionario[i].salarioFinal();
        }
        return salariosTotal * 0.18;
    }

    public void imprimeDadosFuncionarios() {
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < funcionario.length; i++) {
            if (funcionario[i] != null) {
                funcionario[i].imprimeDados();
            }
        }
        System.out.println("------------------------------------------------------");
    }

    public void imprimeDadosFuncionarios(String cpfFuncionario) {
        if (consultaFuncionario(cpfFuncionario) != -1) {
            funcionario[consultaFuncionario(cpfFuncionario)].imprimeDados();
        } else {
            System.out.println("Funcionario inexistente");
        }
    }

    public void imprimeDadosFornecedores() {
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < fornecedor.length; i++) {
            if (fornecedor[i] != null) {
                fornecedor[i].imprimeDados();
            }
        }
        System.out.println("------------------------------------------------------");
    }

    public void imprimeDadosFornecedores(String cnpjFornecedor) {
        if (consultaFornecedor(cnpjFornecedor) != -1) {
            fornecedor[consultaFornecedor(cnpjFornecedor)].imprimeDados();
        } else {
            System.out.println("Fornecedor inexistente");
        }
    }

    public void imprimeDadosClientes() {
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i] != null) {
                cliente[i].imprimeDados();
            }
        }
        System.out.println("------------------------------------------------------");
    }

    public void imprimeDadosClientes(String cpfCliente) {
        if (consultaCliente(cpfCliente) != -1) {
            cliente[consultaCliente(cpfCliente)].imprimeDados();
        } else {
            System.out.println("Cliente inexistente");
        }
    }
    
    public Clientes dadosClientes(String cpfCliente) {
        Clientes c = null;
        if (consultaCliente(cpfCliente) != -1) {
            cliente[consultaCliente(cpfCliente)].imprimeDados();
            c = cliente[consultaCliente(cpfCliente)];
        } else {
            System.out.println("Cliente inexistente");
            c = null;
        }
        return c;
    }
    
     public String[][] dadosClientes() {
        String[][] dataValues = new String[cliente.length][4];
        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i] != null) {
                dataValues[i][0] = cliente[i].getNome();
                dataValues[i][1] = cliente[i].getEndereco();
                dataValues[i][2] = cliente[i].getCpf();
                dataValues[i][3] = cliente[i].getTelefone();
            }
        }
        return dataValues;
    }


    public void imprimeDadosProdutos() {
        for (int i = 0; i < estoque.getProdutos().length; i++) {
            if (estoque.getProdutos()[i] != null) {
                estoque.getProdutos()[i].imprimeDados();
            }
        }
    }

    public void imprimeDadosProdutos(String infoProduto) {
        if (estoque.consultaProduto(infoProduto) != -1) {
            estoque.getProdutos()[estoque.consultaProduto(infoProduto)].imprimeDados();
        } else {
            System.out.println("Produto inexistente");
        }
    }
}
