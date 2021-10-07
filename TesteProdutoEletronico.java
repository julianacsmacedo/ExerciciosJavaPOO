package POO;

import java.util.Scanner;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		//Entrada de produtos
		
		String p1,p2,p3,p4;
		float n1,n2,n3,n4;
		
		ProdutoEletronico[] eletro = new ProdutoEletronico[4];
		
		eletro[0] = new ProdutoEletronico(" ",500);
		eletro[1] = new ProdutoEletronico(" ",0);
		eletro[2] = new ProdutoEletronico(" ",0);
		eletro[3] = new ProdutoEletronico(" ",0);
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o nome do primeiro produto eletrônico: ");
		p1 = leia.next();
		eletro[0].setProduto(p1);
		System.out.println("\nDigite o valor do produto: ");
		n1 = leia.nextFloat();
		eletro[0].setPreco(n1);
		System.out.println("\nDigite o nome do primeiro produto eletrônico: ");
		p2 = leia.next();
		eletro[1].setProduto(p2);
		System.out.println("\nDigite o valor do produto: ");
		n2 = leia.nextFloat();
		eletro[1].setPreco(n2);
		System.out.println("\nDigite o nome do primeiro produto eletrônico: ");
		p3 = leia.next();
		eletro[2].setProduto(p3);
		System.out.println("\nDigite o valor do produto: ");
		n3 = leia.nextFloat();
		eletro[2].setPreco(n3);
		System.out.println("\nDigite o nome do primeiro produto eletrônico: ");
		p4 = leia.next();
		eletro[3].setProduto(p4);
		System.out.println("\nDigite o valor do produto: ");
		n4 = leia.nextFloat();
		eletro[3].setPreco(n4);
		
		for(ProdutoEletronico roda: eletro)
		{
			roda.imprimi();
		}

		if(n1>5000 || n2>5000 || n3>5000 || n4>5000)
		{
			System.out.println("\nProdutos acima de R$5.000,00 tem desconto de 20% na compra!!\n**************************\n");
		}
		
		
	}

}
