package Familia36;

public class TesteAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciando um objeto da classe Aviao
		
		Aviao pouso = new Aviao("Boeing", "Gol", "Luis", "Guarulhos", "Macei�");
		
		pouso.imprimir();
		System.out.println("\n***Transfer�ncia de aeronave***\n");
		pouso.setModelo("Airbus");
		pouso.imprimir();
		
	}

}
