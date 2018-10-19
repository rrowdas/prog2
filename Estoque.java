public class Estoque extends PadTremBao{
    
    protected Produtos [] produtos = new Produtos[50];

    public Estoque(){
        this.produtos = new Produtos [50];
    }

    public Produtos [] getTodosProdutos(){
		return produtos;
	}
	
	public Produtos [] getProduto(String codProd){
		for (var i = 0; i < produtos.length; i++) {
			if(produtos[i].getCodigo().equalsIgnoreCase(codProd))
				return produtos[i];
		}
		return null;
	}

    public void cadastrarProduto(Produtos novoProduto){
		boolean cadastrado = false;
    	
    	for(int i = 0; i < produtos.length && !cadastrado; i++)
    		if(produtos[i] != null && produtos[i].getCodigo().equalsIgnoreCase(novoProduto.getCodigo())) {
    			System.out.println("Esse código já foi cadastro");
    			cadastrado = true;
    		}
    	
    	for(int i = 0; i < produtos.length && !cadastrado; i++) {
    		if(produtos[i] == null) {
    			System.out.println("Foi cadastrado");
                produtos[i] = novoProduto;
    			cadastrado = true;
    		}
    	}
    	if(cadastrado == false)
    		System.out.println("Não foi possível cadastrar");
	}
	
	public void removerProduto(Produto produto){

		Produtos p = getProduto(produto.getCodigo())

		if(p != null)
			

		for(int i = 0; i < produtos.length && !cadastrado; i++)
    		if(produtos[i] != null && produtos[i].getCodigo().equalsIgnoreCase(novoProduto.getCodigo())) {
    			System.out.println("Esse código já foi cadastro");
    			cadastrado = true;
    		}

	}
}