package Lista_1;

import java.util.Locale;
import java.util.Scanner;

public class Desafio 
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		int n1, n2;
		double n3;
		String nome;
		
		Scanner tec = new Scanner(System.in);
		
		//System.out.println("n1 : ");
		//n1 = tec.nextInt();
		
		//System.out.println("n2 : ");
		//n2 = tec.nextInt();
		
		//tec.nextLine();
		//System.out.println("n3 : ");
	//	n3 = tec.nextDouble();
		
	//	tec.nextLine();
		System.out.println("nome: ");
		nome = tec.nextLine();
		
		System.out.println("n3 : ");
		n3 = tec.nextDouble();
		
		System.out.println(n3+1);
		
		
		
		tec.close();

	}

}
