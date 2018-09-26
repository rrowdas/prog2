package Padaria;

public class Fornecedores {
    public String nome;
    public String endereco;
    public String cnpj;
 
    public Fornecedores(String nome, String endereco, String cnpj, String tipoFornecedor) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }
 
    public String getNome() {
        return this.nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getEndereco() {
        return this.endereco;
    }
 
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
 
    public String getCnpj() {
        return this.cnpj;
    }
 
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
