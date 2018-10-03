public class Produtos
{
    protected String nome;
    protected String codigo;
    protected Fornecedores fornecedor;
    protected double precoCusto, precoFinal;

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String nome)
    {
        this.nome = nome;
    }

}