package Lista_2;

import java.util.Locale;
import java.util.Scanner;

public class Questao6 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		double numero, multiplo3=0, auxiliar=0;
		double media=0;
				
		do
		{
			System.out.print("Digite um n�mero: ");
			numero = tec.nextDouble();
			if((numero%3)==0)
			{
				multiplo3 = multiplo3+numero;
				auxiliar++;
			}
			
			
		}while(numero!=0);
		
		System.out.printf("multiplo3 = %.2f", multiplo3);
		System.out.printf("\nauxiliar = %.2f", auxiliar);
		media = (multiplo3/(auxiliar-1.0));
		System.out.println("\nA m�dia dos n�meros multiplos de 3 �: "+ media);
		
		tec.close();
	}

}
