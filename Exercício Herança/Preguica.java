package POO;

public class Preguica extends Animal{
	
	private float peso;
	private float horaSono;
	private String origem;
	
	public Preguica(String nome, int idade, float peso, float horaSono, String origem)
	{
		super(nome, idade);
		this.origem = origem;
		this.horaSono = horaSono;
		this.peso = peso;
	}
	
	public void imprimirPreguica()
	{
		System.out.println("\nNome: " + getNome() + "\nIdade: " + getIdade()+" anos \nOrigem: "+ origem + "\nPeso: " + peso 
				+ " kg \nTempo de sono: " + horaSono);
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getHoraSono() {
		return horaSono;
	}

	public void setHoraSono(float horaSono) {
		this.horaSono = horaSono;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	

}
