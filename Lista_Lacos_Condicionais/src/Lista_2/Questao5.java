package Lista_2;

import java.util.Scanner;

public class Questao5 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		int numero, soma=0;
		
		do
		{
			System.out.print("Digite um n�mero: ");
			numero = tec.nextInt();
			soma=soma+numero;
			
		}while(numero!= 0);
		
		System.out.printf("A soma total dos n�meros digitados � de: %d", soma);
		
		tec.close();
	}

}
