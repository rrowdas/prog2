public class NaoPereciveis extends Produtos{

    public NaoPereciveis(String nome, String codigo, double precoCusto, double precoFinal, String apelido, int quantidade){
        super(nome, codigo, precoCusto, precoFinal, apelido, quantidade);
    }
    public NaoPereciveis(String nome, String codigo, double precoCusto, double precoFinal, int quantidade){
        super(nome, codigo, precoCusto, precoFinal, quantidade);
    }
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("*******PRODUTO NÃO PERECÍVEL*******");

    }

    
}