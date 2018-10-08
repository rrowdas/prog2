import javax.lang.model.util.ElementScanner6;

public class Clientes implements ImprimeInformacoes{
    protected String nome;
    protected String endereco;
    protected String cpf;
    protected String telefone;
    
    public Clientes(String nome, String endereco, String cpf, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void imprimeDadosPessoais(){  //Basear-se no cadastrar cliente e caso nao esteja cadastrado, preencher info do usuario
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone); 
    }
}