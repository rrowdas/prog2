public class Estoque extends PadTremBao{
    
    protected Produtos [] produtos = new Produtos[50];

    public Estoque(){
        this.produto = new Produtos [50];
    }

    public Produtos [] getTodosProdutos(){
		return produtos;
	}
	
	public Produtos [] getProduto(String codProd){
		for (var i = 0; i < produtos.length; i++) {
			if(produtos[i].getCodigo().equalsIgnoreCase(codProd))
				return produto[i];
		}
		return null
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
    			cadastrado = true;
    		}
    	}
    	if(cadastrado == false)
    		System.out.println("Não foi possível cadastrar");
	}
	
	public void removerProduto(Produto produto){

		boolean estoque

		for(int i = 0; i < produto.length && !cadastrado; i++)
    		if(produto[i] != null && produto[i].getCodigo().equalsIgnoreCase(novoProduto.getCodigo())) {
    			System.out.println("Esse código já foi cadastro");
    			cadastrado = true;
    		}

	}
}