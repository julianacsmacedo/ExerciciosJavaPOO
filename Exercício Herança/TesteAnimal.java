package POO;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro cao = new Cachorro("Cachorro", 0, " ", " ");
		Cavalo cav = new Cavalo("Cavalo", 0, " ", 0);
		Preguica preg = new Preguica("Pregui�a", 10, 30, 23, "Chile");
		Animal animal = null;
		
		Scanner leia = new Scanner(System.in);
		
		int id1,id2,id3,pc, op;
		String raca,dono,raca1;
		
		animal = cao;
		System.out.println("\nDigite a idade do cachorro:");
		id1 = leia.nextInt();
		cao.setIdade(id1);
		System.out.println("\nDigite a ra�a do cachorro:");
		raca = leia.next();
		cao.setRaca(raca);
		System.out.println("\nDigite o dono do cachorro:");
		dono = leia.next();
		cao.setDono(dono);
		
		
		animal = cav;
		System.out.println("\nDigite a idade do cavalo:");
		id2 = leia.nextInt();
		cav.setIdade(id2);
		System.out.println("\nDigite a ra�a do cavalo:");
		raca1 = leia.next();
		cav.setRaca(raca1);
		System.out.println("\nDigite o peso do cavalo:");
		pc = leia.nextInt();
		cav.setPeso(pc);
		
		
		cao.imprimir();
		cao.imprimirCachorro();
		cao.correr();
		cao.som("AUUUUUUUU\n");
		cav.imprimirCavalo();
		cav.correr();
		cav.som("iiirrrr�\n");
		animal = preg;
		preg.imprimirPreguica();
		preg.som("**Barulho ina�divel**");
		preg.subirEmArvores();
		
		
	}

}
