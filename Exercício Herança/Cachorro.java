package POO;

public class Cachorro extends Animal{
	
	private String raca;
	private String dono;
		
	public Cachorro(String nome, int idade,String raca, String dono)
	{
		super(nome,idade);
		this.raca = raca;
		this.dono = dono;
	}
	
	public void imprimirCachorro()
	{
		System.out.println("\nNome: " + getNome() + "\nIdade: " 
	+ getIdade()+" anos \nRa�a: "+ raca + "\nDono: " + dono);
	}
	
	@Override
	public void som(String som) {
		System.out.print("\nO cachorro come�ou a latir!!\n "+som);
	}
	
	@Override
	public void correr() {
		System.out.print("\nO cachorro come�ou a correr!!");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}
	
	

}
