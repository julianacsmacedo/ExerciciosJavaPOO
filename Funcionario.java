package POO;

public class Funcionario {
	 
	/*Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, 
	 * em seguida crie um objeto funcion�rio, defina as instancias deste objeto e apresente as 
	 * informa��es deste objeto no console.
	 */
	
	//Declaracao dos atributos da classe
	
	private String nome;
	private String cargo;
	private double salario;
	private double horaExtra;
	
	//M�todo especial construtor
	
	public Funcionario(String nome, String cargo, double salario,double horaExtra)
	{
		this.setNome(nome);		this.setCargo(cargo);
		this.setHoraExtra(horaExtra);
		this.setSalario(salario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(double horaExtra) {
		this.horaExtra = horaExtra;
	}
	public void imprimi()
	{
		System.out.println("\nFuncion�rio: "+ nome + "\nCargo: " + cargo + "\nHora(s) extra(s): " + horaExtra + "\nSal�rio: "+salario);
	}


}
