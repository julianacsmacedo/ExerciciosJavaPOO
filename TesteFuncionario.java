package POO;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario[] lista = new Funcionario[3];
		
		lista[0] = new Funcionario(" ", " Estagiário de vendas ", 3500, 0); //nome, cargo, salário e hora extra
		lista[1] = new Funcionario(" ", " Dev Jr. ", 5500, 0);
		lista[2] = new Funcionario(" ", "Gerente Executivo ", 7500, 0);
		
		String n1,n2,n3;
		double salarioNovo,h1,h2,h3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o nome do funcionário: ");
		n1 = leia.next();
		lista[0].setNome(n1);
		System.out.println("\nDigite a quantidade de horas extras: ");
		h1 = leia.nextDouble();
		lista[0].setHoraExtra(h1);
		System.out.println("\nDigite o nome do funcionário: ");
		n2 = leia.next();
		lista[1].setNome(n2);
		System.out.println("\nDigite a quantidade de horas extras: ");
		h2 = leia.nextDouble();
		lista[1].setHoraExtra(h2);
		System.out.println("\nDigite o nome do funcionário: ");
		n3 = leia.next();
		lista[2].setNome(n3);
		System.out.println("\nDigite a quantidade de horas extras: ");
		h3 = leia.nextDouble();
		lista[2].setHoraExtra(h3);
		
		for(Funcionario roda:lista)
		{
			salarioNovo = (h1 * 20) + lista[0].getSalario(); //acessar o salário armazena e fazer a conta
			lista[0].setSalario(salarioNovo);
			salarioNovo = (h2 * 20) + lista[1].getSalario();
			lista[1].setSalario(salarioNovo);
			salarioNovo = (h3 * 20) + lista[2].getSalario();
			lista[2].setSalario(salarioNovo);
			roda.imprimi();
		}
	
	}

}
