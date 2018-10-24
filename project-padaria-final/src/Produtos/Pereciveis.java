package Produtos;

import Fornecedores.Fornecedores;
import Fornecedores.Recorrente;

public class Pereciveis extends Produtos {

    private String diaValidade, mesValidade, anoValidade;

    public Pereciveis(String nome, String codigo, String fornecedor, String precoCusto, String precoFinal, String apelido, String quantidade, String diaValidade, String mesValidade, String anoValidade) {
        super(nome, codigo, fornecedor, precoCusto, precoFinal, apelido, quantidade);
        this.diaValidade = diaValidade;
        this.mesValidade = mesValidade;
        this.anoValidade = anoValidade;
    }

    public Pereciveis(String nome, String codigo, String fornecedor, String precoCusto, String precoFinal, String quantidade, String diaValidade, String mesValidade, String anoValidade) {
        super(nome, codigo, fornecedor, precoCusto, precoFinal, quantidade);
        this.diaValidade = diaValidade;
        this.mesValidade = mesValidade;
        this.anoValidade = anoValidade;
    }

  

    public String getDiaValidade() {
        return this.diaValidade;
    }

    public void setDiaValidade(String diaValidade) {
        this.diaValidade = diaValidade;
    }

    public String getMesValidade() {
        return this.mesValidade;
    }

    public void setMesValidade(String mesValidade) {
        this.mesValidade = mesValidade;
    }

    public String getAnoValidade() {
        return this.anoValidade;
    }

    public void setAnoValidade(String anoValidade) {
        this.anoValidade = anoValidade;
    }

//    public void comparaValidade(int diaReferencia, int mesReferencia, int anoReferencia) {
//
//        if (anoReferencia > 0 && anoValidade > 0 && mesReferencia > 0 && mesReferencia < 13 && mesValidade > 0 && mesValidade < 13 && diaValidade > 0 && diaValidade < 32 && diaReferencia > 0 && diaReferencia < 32) {
//            if (anoReferencia < anoValidade && mesReferencia < mesValidade && diaReferencia < diaValidade) {
//                System.out.println("Produto em estoque com validade em dia!");
//            }
//
//            else {
//                System.out.println("Produto vencido!!!!!");
//            }
//        }
//        else {
//            System.out.println("Datas inseridas incorretamente.");
//        }
//    }

    @Override
    public void imprimeDados() {
        System.out.println("*******PRODUTO PERECÍVEL*******");
        super.imprimeDados();
        System.out.println("Validade: " + diaValidade + "/" + mesValidade + "/" + anoValidade);
    }
}
