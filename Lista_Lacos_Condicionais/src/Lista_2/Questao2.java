package Lista_2;

import java.util.Scanner;

public class Questao2 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		int valor, controle, par=0, impar=0;
		
		for(controle=1; controle<=10; controle++)
		{
			System.out.print("Digite um valor: ");
			valor = tec.nextInt();
			
			if(valor%2 == 0)
			{
				par++;
			}
			else
			{
				impar++;
			}

		}
		
		System.out.printf("\nDos números digitados, %d são pares e %d são ímpares.", par, impar);
		
		tec.close();
	}

}
