package POO;

public class Cavalo extends Animal {
	
	private String raca;
	private float peso;
	
	public Cavalo(String nome, int idade, String raca, float peso)
	{
		super(nome,idade);
		this.raca = raca;
		this.peso = peso;
	}
	
	public void imprimirCavalo()
	{
		System.out.println("\nNome: " + getNome() + "\nIdade: " + getIdade()+" anos \nRa?a: "+ raca + "\nPeso: " + peso + " kg");
	}
	
	@Override
	public void som(String som) {
		System.out.print("\nO cavalo come?ou a relinchar!!\n "+som);
	}
	
	@Override
	public void correr() {
		System.out.print("\nO cavalo come?ou a correr!!");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
}
