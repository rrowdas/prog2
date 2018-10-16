public class Ocasional extends Fornecedores{
    
    public Ocasional(String nome, String endereco, String cnpj, double precoCobrado){
        super(nome, endereco, cnpj, precoCobrado);
    }
    public void valorFinal(){ //Sobrescrita do metodo valorFinal em fornecedores
        super.valorFinal();
    }

}