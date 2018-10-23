package Produtos;

import Fornecedores.Fornecedores;
import Fornecedores.Recorrente;

public class Pereciveis extends Produtos {

    private int diaValidade, mesValidade, anoValidade;

    public Pereciveis(String nome, String codigo, Fornecedores fornecedor, double precoCusto, double precoFinal, String apelido, int quantidade, int diaValidade, int mesValidade, int anoValidade) {
        super(nome, codigo, fornecedor, precoCusto, precoFinal, apelido, quantidade);
        this.diaValidade = diaValidade;
        this.mesValidade = mesValidade;
        this.anoValidade = anoValidade;
    }

    public Pereciveis(String nome, String codigo, Fornecedores fornecedor, double precoCusto, double precoFinal, int quantidade, int diaValidade, int mesValidade, int anoValidade) {
        super(nome, codigo, fornecedor, precoCusto, precoFinal, quantidade);
        this.diaValidade = diaValidade;
        this.mesValidade = mesValidade;
        this.anoValidade = anoValidade;
    }

    public Pereciveis(String pão, String string, Recorrente r1, int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getDiaValidade() {
        return this.diaValidade;
    }

    public void setDiaValidade(int diaValidade) {
        this.diaValidade = diaValidade;
    }

    public int getMesValidade() {
        return this.mesValidade;
    }

    public void setMesValidade(int mesValidade) {
        this.mesValidade = mesValidade;
    }

    public int getAnoValidade() {
        return this.anoValidade;
    }

    public void setAnoValidade(int anoValidade) {
        this.anoValidade = anoValidade;
    }

    public void comparaValidade(int diaReferencia, int mesReferencia, int anoReferencia) {

        if (anoReferencia > 0 && anoValidade > 0 && mesReferencia > 0 && mesReferencia < 13 && mesValidade > 0 && mesValidade < 13 && diaValidade > 0 && diaValidade < 32 && diaReferencia > 0 && diaReferencia < 32) {
            if (anoReferencia < anoValidade && mesReferencia < mesValidade && diaReferencia < diaValidade) {
                System.out.println("Produto em estoque com validade em dia!");
            }

            else {
                System.out.println("Produto vencido!!!!!");
            }
        }
        else {
            System.out.println("Datas inseridas incorretamente.");
        }
    }

    @Override
    public void imprimeDados() {
        System.out.println("*******PRODUTO PERECÍVEL*******");
        super.imprimeDados();
        System.out.println("Validade: " + diaValidade + "/" + mesValidade + "/" + anoValidade);
    }
}
