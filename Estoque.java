public class Estoque extends PadTremBao{
    
    protected Produtos [] produto = new Produtos[50];
    protected int [] posicaoProduto = new int [50];

    public Estoque(){
        this.produto = new Produtos [50];
        this.posicaoProduto = new int [50];
    }

    public Produtos [] getProduto(){
        return produto;
    }

    public void setProduto(Produtos [] produto){
        this.produto = produto;
    }
    public void cadastrarProduto(Produtos novoProduto){
		boolean cadastrado = false;
    	
    	for(int i = 0; i < produto.length && !cadastrado; i++)
    		if(produto[i] != null && produto[i].getCodigo().equalsIgnoreCase(novoProduto.getCodigo())) {
    			System.out.println("Esse código já foi cadastro");
    			cadastrado = true;
    		}
    	
    	for(int i = 0; i < produto.length && !cadastrado; i++) {
    		if(produto[i] == null) {
    			System.out.println("Foi cadastrado");
                produto[i] = novoProduto;
                posicaoProduto[i] = 30;
    			cadastrado = true;
    		}
    	}
    	if(cadastrado == false)
    		System.out.println("Não foi possível cadastrar");
    }

    /*
    public boolean alerta(Produto newProduto){
       for (int i = 0; i < produtos.length; i++) {
            if (newProduto == produtos[i]) {                  GABRIEL 
                return false;
            }       }
        return true;
    } */
}