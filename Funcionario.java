package POO;

public class Funcionario {
	 
	/*Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente as 
	 * informações deste objeto no console.
	 */
	
	//Declaracao dos atributos da classe
	
	private String nome;
	private String cargo;
	private double salario;
	private double horaExtra;
	
	//Método especial construtor
	
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
		System.out.println("\nFuncionário: "+ nome + "\nCargo: " + cargo + "\nHora(s) extra(s): " + horaExtra + "\nSalário: "+salario);
	}


}
