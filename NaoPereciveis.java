public class NaoPereciveis extends Produtos{
    //private String semValidade;

    public NaoPereciveis(String nome, String codigo, double precoCusto, double precoFinal, String semValidade){
        super(nome, codigo, precoCusto, precoFInal);
        this.semValidade = semValidade;
    }

    //public String getSemValidade(){
    //    return semValidade;
   // }
    
  //  public void setSemValidade(String semValidade){
   //     this.semValidade = semValidade;
   // }

    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("PRODUTO NÃO PERECÍVEL");

    }

    
}