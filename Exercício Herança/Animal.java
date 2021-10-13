package POO;

public abstract class Animal {
	
	private String nome;
	private int idade;
	
	//Poliformismo
	abstract public void som(String som);
	abstract public void correr();
	
	//Construtor
	public Animal(String nome, int idade)
	{
		this.nome = nome;
		this.idade = idade;
	}
	
	public void imprimir()
	{
		System.out.println("\t--REGISTRO ANIMAL--");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
