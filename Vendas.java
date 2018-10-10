public class Vendas extends PadTremBao{
    
    protected String dataVenda;
    protected String nomeVendedor;
    protected String formaPagamento;
    protected double [] carrinhoDeVendas;

    public Vendas(String dataVenda, String nomeVendedor, String formaPagamento){

        this.dataVenda = dataVenda;
        this.nomeVendedor = nomeVendedor;
        this.formaPagamento = formaPagamento;
        this.carrinhoDeVendas = new double [20];
    }

    public void compra(String codigo){

        int guardarPosicaoProduto = -1;
        boolean encontrou = false;
        boolean cadastradoNoCarrinho = false;

        for(int i = 0; i < super.produto.length-1 && !encontrou; i++){
            if(super.produto[i] != null && super.produto[i].equals(codigo)){
                guardarPosicaoProduto = i;
                encontrou = true;
            }
            else
                System.out.println("Código não encontrado");
        }


        for(int i =0; i < carrinhoDeVendas.length-1 && encontrou; i++){
            if(carrinhoDeVendas[19] != 0)
                System.out.println("O carrinho está cheio, favor abrir nova venda.");

            else if(carrinhoDeVendas[i] == 0 && !cadastradoNoCarrinho){
                
                carrinhoDeVendas[i] = super.produto[guardarPosicaoProduto].getPrecoFinal(); //TESTAR GETPRECOFINAL, POIS NÃO SE ENCONTRA COMO SUGESTÃO DO TAB
                cadastradoNoCarrinho = true;
                System.out.println("Numeros de produtos no carrinho: " + i);
            }
        }

    }

    public double totalCarrinho(){

        double valorTotalCompra = 0;

        for(int i = 0; i < carrinhoDeVendas.length && carrinhoDeVendas[i] != 0; i++){
                valorTotalCompra += carrinhoDeVendas[i];
        }

        return valorTotalCompra;
    }


}