package Familia36;

public class Cliente {
	/*Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um 
	 * objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.
	*/
	
		private String nome;
		private String email;
		private int telefone;
		
		public Cliente(String nome, String email, int tel)
		{
			this.nome = nome;
			this.email = email;
			this.telefone = tel;
		}
		
		// Declaração dos demais métodos da classe;

		public void imprimir() 
		{
			System.out.println("\nCliente: " + nome + "\nEmail: " + email + "\nTelefone: "+ telefone);
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getTelefone() {
			return telefone;
		}
		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
		

}

