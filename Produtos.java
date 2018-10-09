import java.util.Scanner;
public class Produtos
{   
    Scanner teclado = new Scanner(System.in);
    protected String nome;
    protected String codigo;
    protected double precoCusto, precoFinal;

    public Produtos(String nome, String codigo, double precoCusto, double precoFinal){
        this.nome = nome;
        while(codigo.length() != 6){
            System.out.println("Número de código deve ter 6(SEIS) dígitos. Por favor, coloque o código corretamente, obrigado.");
            codigo = teclado.nextLine();                        //ver se o teclado nextline vai dar aquela treta famosa...
        }
        this.codigo = codigo;   
        this.precoCusto = precoCusto;
        this.precoFinal = precoFinal;
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
        System.out.println("PRODUTO ADQUIRIDO:");
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.printf("Preço: %.2f\n", precoFinal);
        System.out.printf("Custo: %.2f\n", precoCusto);

    }
 
}