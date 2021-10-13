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
	
	@Override
	public void som(String som) {
		System.out.print("\n A preguiça começou a emitir um barulho!!\n "+som);
	}
	
	@Override
	public void correr() {
		System.out.print("\nA preguiça não consegue correr!!");
	}
	
	public void subirEmArvores()
	{
		System.out.println("\nA preguiça subiiu em uma árvore!!");
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
