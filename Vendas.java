public abstract class Vendas extends Estoque{ //Estoque
    
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

        int guardarPosicaoProduto = -1; // Esse guarda a posição em que o produto se encontra no vetor
        boolean encontrou = false; // caso encontre o produto
        boolean cadastradoNoCarrinho = false; // caso seja cadastrado o produto

        for(int i = 0; i < super.produto.length && !encontrou; i++){ // Esse for serve para encontrar o código do produto no estoque, caso ele não encontre, esse código é inválido.
            if(super.produto[i] != null && super.produto[i].equals(codigo)){
                guardarPosicaoProduto = i;               
                encontrou = true;                  
            }
            else
                System.out.println("Código não encontrado");
        }


        for(int i =0; i < carrinhoDeVendas.length && encontrou; i++){ // Caso o produto seja encontrado no for acima, ele poderá ser colocado no carrinho de vendas para efetuar a compra.
            if(carrinhoDeVendas[19] != 0)
                System.out.println("O carrinho está cheio, favor abrir nova venda.");

            else if(carrinhoDeVendas[i] == 0 && !cadastradoNoCarrinho){
                
                carrinhoDeVendas[i] = super.produto[guardarPosicaoProduto].getPrecoFinal(); //TESTAR GETPRECOFINAL, POIS NÃO SE ENCONTRA COMO SUGESTÃO DO TAB
                super.posicaoProduto[guardarPosicaoProduto]--; //Retirando um do estoque(pois já foi colocado no carrinho)
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