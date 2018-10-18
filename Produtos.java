//package Padaria;
import java.util.Scanner;

public abstract class Produtos
{   
    Scanner teclado = new Scanner(System.in);
    protected String nome;
    protected String codigo;
    protected double precoCusto, precoFinal;
    protected String apelido;
    protected int quantidade;


    public Produtos(String nome, String codigo, double precoCusto, double precoFinal, String apelido, int quantidade){
        this.nome = nome;
        while(codigo.length() != 6){
            System.out.println("Número de código deve ter 6(SEIS) dígitos. Por favor, coloque o código corretamente, obrigado.");
            codigo = teclado.nextLine();                        //ver se o teclado nextline vai dar aquela treta famosa...
        }
        this.codigo = codigo;   
        this.precoCusto = precoCusto;
        this.precoFinal = precoFinal;
        this.apelido = apelido;
        setQuantidade(quantidade);
    }

    public Produtos(String nome, String codigo, double precoCusto, double precoFinal, int quantidade){
        this.nome = nome;
        while(codigo.length() != 6){
            System.out.println("Número de código deve ter 6(SEIS) dígitos. Por favor, coloque o código corretamente, obrigado.");
            codigo = teclado.nextLine();                        //ver se o teclado nextline vai dar aquela treta famosa...
        }
        this.codigo = codigo;   
        this.precoCusto = precoCusto;
        this.precoFinal = precoFinal;
        this.apelido = "Sem apelido";
        setQuantidade(quantidade);
    }

    
    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int novaQuantidade){
        boolean quantCorreto = false;
        
        while(!quantCorreto){
            if(novaQuantidade <= 30 && novaQuantidade > 0){
                this.quantidade = novaQuantidade;
                quantCorreto = true;
            }
            else
                System.out.println("A quantidade tem que ser menor ou igual a 30");
                //FALTA INTERROMPER O LOOP
        }
    }
    public String getApelido(){
        return apelido;
    }

    public void setApelido(String apelido){
        this.apelido = apelido;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public double getPrecoFinal(){
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal){
        this.precoFinal = precoFinal;
    }

    public double getPrecoCusto(){
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto){
        this.precoCusto = precoCusto;
    }

    
    
    public void imprimeDados(){
        System.out.println("------------------------------------------");
        System.out.println("PRODUTO:");
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.printf("Preço: R$%.2f\n", precoFinal);
        System.out.printf("Custo: R$%.2f\n", precoCusto);
        System.out.println("Apelido: " + apelido);
        System.out.println("Quantidade de " + nome + " é: " + quantidade + " unidades");

    }
 
}