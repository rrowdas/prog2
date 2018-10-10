public class Pereciveis extends Produtos{
    private int diaValidade;
    private int mesValidade;
    private int anoValidade;
    private int diaHoje;
    private int mesHoje;
    private int anoHoje;

    public Pereciveis(String nome, String codigo, double precoCusto, double precoFinal, int diaValidade, int mesValidade, int anoValidade, int diaHoje, int mesHoje, int anoHoje){
        super(nome, codigo, precoCusto, precoFinal);
        this.diaValidade = diaValidade;
        this.mesValidade = mesValidade;
        this.anoValidade = anoValidade;
        this.diaHoje = diaHoje;
        this.mesHoje = mesHoje;
        this.anoHoje = anoHoje;
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


    public int getDiaHoje() {
        return this.diaHoje;
    }

    public void setDiaHoje(int diaHoje) {
        this.diaHoje = diaHoje;
    }

    public int getMesHoje() {
        return this.mesHoje;
    }

    public void setMesHoje(int mesValidade) {
        this.mesValidade = mesValidade;
    }

    public int getAnoHoje() {
        return this.anoHoje;
    }

    public void comparaValidez(){
        if(anoHoje > 0 && anoValidade > 0 && mesHoje > 0 && mesHoje < 13 && )
        if(anoHoje < anoValidade){
            if(mesHoje < mesHoje){
                if(anoHoje < anoHoje){
                    System.out.println("Produto em estoque com validade em dia!");
                }
            }
        }
        else
            System.out.println("Produto vencido!!!!!");
    }



}