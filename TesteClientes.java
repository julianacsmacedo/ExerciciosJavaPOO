package Familia36;

public class TesteClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente[] dados = new Cliente[5];
		
		dados[0] = new Cliente("Juliana", "julianam@gmail.com",999999999);
		dados[1] = new Cliente("Sofia", "sofia@gmail.com",99567099);
		dados[2] = new Cliente("Joel", "joel@gmail.com",999999999);
		dados[3] = new Cliente("Cliente2", "julianam@gmail.com",999999999);
		dados[4] = new Cliente("Cliente3", "julianam@gmail.com",999999999);
		
		for(Cliente exibe:dados)
		{
			exibe.imprimir();
		}
	}

}
