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
		
		System.out.printf("\nDos n�meros digitados, %d s�o pares e %d s�o �mpares.", par, impar);
		
		tec.close();
	}

}
