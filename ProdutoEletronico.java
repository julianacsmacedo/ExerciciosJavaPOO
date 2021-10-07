package POO;

public class ProdutoEletronico {
	
	/* Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e apresente as informações 
	 * deste objeto no console.
	 */
	
	private String produto;
	private float preco;
		
	//Construtor
	
	public ProdutoEletronico(String produto, float preco)
	{
		this.setProduto(produto);
		this.setPreco(preco);
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	public void imprimi()
	{
		System.out.printf("\nO %s está custando %.2f.",produto,preco);
	}
	

}
