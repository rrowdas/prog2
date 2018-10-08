public class Produtos
{
    protected String nome;
    protected String codigo;
    protected Fornecedores fornecedor;
    protected double precoCusto, precoFinal;

    public Produtos(String nome, String codigo, Fornecedores fornecedor, double precoCusto, double precoFinal){
        this.nome = nome;
        while(codigo.length() != 6){
            System.out.println("Número de código deve ter 6(SEIS) dígitos. Por favor, coloque o código corretamente, obrigado.");
            codigo = teclado.nextLine();                        //ver se o teclado nextline vai dar aquela treta famosa...
        }
        this.codigo = codigo;   
        this.fornecedor = fornecedor;
        this.precoCusto = precoCusto;
        this.precoFinal = precoFinal;
    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


}