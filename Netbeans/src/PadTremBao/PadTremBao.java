package PadTremBao;

import Clientes.Clientes;
import Estoque.Estoque;
import Fornecedores.Fornecedores;
import Funcionarios.Funcionarios;
import Vendas.Vendas;

public class PadTremBao {

    private Fornecedores[] fornecedor = new Fornecedores[10];
    private Funcionarios[] funcionario = new Funcionarios[10];
    private Clientes[] cliente = new Clientes[10];
    private Vendas[] venda = new Vendas[50];
    private Estoque estoque;

    public PadTremBao(Estoque estoque) {
        this.estoque = estoque;
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

    public Clientes[] getCliente() {
        return cliente;
    }

    public void setCliente(Clientes[] cliente) {
        this.cliente = cliente;
    }


    public int consultaFornecedor(String cnpjConsulta) {
        int posicao = -1;
        boolean existe = false;
        for (int i = 0; i < fornecedor.length && !existe; i++) {
            if (fornecedor[i] != null && fornecedor[i].getCnpj().equalsIgnoreCase(cnpjConsulta)) {
                System.out.println("Esse CNPJ já possui cadastro");
                existe = true;
                posicao = i;
            }
        }
        return posicao;

    }

    public void cadastraFornecedor(Fornecedores novoFornecedor) {
        
        boolean cadastrado = false;
        if(consultaFornecedor(novoFornecedor.getCnpj()) != -1){
            System.out.println("Esse fornecedor já está cadastrado.");
        }
        else{
            for (int i = 0; i < fornecedor.length && !cadastrado; i++) {
                if (fornecedor[i] == null) {
                    System.out.println("Fornecedor "+ novoFornecedor.getNome() + " cadastrado");
                    fornecedor[i] = novoFornecedor;
                    cadastrado = true;
                }
            }        
            if (cadastrado == false) 
                System.out.println("Não é possível cadastrar mais fornecedores em nosso sistema (número máximo alcançado).");
        }
    }    

//        }
    }

    public void removeFornecedor(String fornecedorCnpjExcluido) {

        boolean removido = false;
        int posicao = consultaFornecedor(fornecedorCnpjExcluido);

        if (posicao != -1){
            fornecedor[posicao] = null;
            System.out.println("O Fornecedor " + fornecedor[posicao].getNome() + " foi removido.");
        }
        else 
            System.out.println("Fornecedor não encontrado. Tente novamente com um CNPJ válido.");
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean consultaFuncionario(Funcionarios novoFuncionario) {
        boolean existe = false;

        for (int i = 0; i < funcionario.length && !existe; i++) {
            if (funcionario[i] != null && funcionario[i].getCpf().equalsIgnoreCase(novoFuncionario.getCpf())) {
                System.out.println("Esse CPF já possui cadastro");
                existe = true;
            }
        }

        return existe;
    }

    public void cadastraFuncionario(Funcionarios novoFuncionario) {
        boolean cadastrado = consultaFuncionario(novoFuncionario);

        for (int i = 0; i < funcionario.length && !cadastrado; i++) {
            if (funcionario[i] == null) {
                System.out.println("Funcionario " + novoFuncionario.getNome() +" cadastrado");
                funcionario[i] = novoFuncionario;
                cadastrado = true;
            }
        }
        if (cadastrado == false) {
            System.out.println("Não foi possível cadastrar");
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void removeFuncionario(String funcionarioCpfExcluido) {

        boolean removido = false;

        for (int i = 0; i < funcionario.length && !removido; i++) {
            if (funcionario[i] != null && funcionario[i].getCpf().equalsIgnoreCase(funcionarioCpfExcluido)) {
                System.out.println("O funcionario " + funcionario[i].getNome() + " foi removido.");
                funcionario[i] = null;
                removido = true;
            }
        }
    }

    public boolean consultaCliente(Clientes novoCliente) {
        boolean existe = false;

        for (int i = 0; i < cliente.length && !existe; i++) {
            if (cliente[i] != null && cliente[i].getCpf().equalsIgnoreCase(novoCliente.getCpf())) {
                System.out.println("Esse CPF já foi cadastro");
                existe = true;
            }
        }
        return existe;
    }
    
    public void cadastraCliente(Clientes novoCliente) {
        boolean cadastrado = consultaCliente(novoCliente);

        for (int i = 0; i < cliente.length && !cadastrado; i++) {
            if (cliente[i] == null) {
                cliente[i] = novoCliente;
                System.out.println("Cliente "+ novoCliente.getNome()+" cadastrado");
            }
        }
        if (cadastrado == false) {
            System.out.println("Não foi possível cadastrar");
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void removeCliente(String clienteCpfExcluido) {

        boolean removido = false;

        for (int i = 0; i < cliente.length && !removido; i++) {
            if (cliente[i] != null && cliente[i].getCpf().equalsIgnoreCase(clienteCpfExcluido)) {
                System.out.println("O cliente " + cliente[i].getNome() + " foi removido");
                cliente[i] = null;
                removido = true;
            }
        }
    }
    public void adicionaVenda(Vendas novaVenda) {

        boolean vendaAdicionado = false;
        int guardarPosicao = -1;
        
        
        
        //VERIFICAR CPF VENDEDOR E CLIENTE

        for (int i = 0; i < venda.length && !vendaAdicionado; i++) {
            if (venda[i] == null) {
                venda[i] = novaVenda;
                vendaAdicionado = true;
                guardarPosicao = i;
            }
        }
        
        venda[guardarPosicao].adicionaProdutoCarrinho(produto, codigoProduto);
        /**
         * Como faremos para o usuario ficar passando vários codigos?? Pois,
         * teriamos que chamar o vendas de novo ou sla
         */
        for (int i = 0; i < venda[guardarPosicao].getCarrinhoCompras().length; i++) {
            venda[guardarPosicao].adicionaProdutoCarrinho(estoque.getProdutos(), codigoProduto);

        }

        //NO FINAL DE TUDO, CHAMAMOS O CARRINHO TOTAL
        System.out.println(venda[guardarPosicao].carrinhoTotal(cliente, funcionario));

    }
    
    
}
