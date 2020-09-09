package Lista_1;

import java.util.Locale;
import java.util.Scanner;

public class Questao4 
{

	public static void main(String[] args) 
	{	
		Locale.setDefault(Locale.US); //Para padronizar a v�rgula como ponto - Padr�o americano.
		Scanner tec = new Scanner(System.in);
		double numero, raiz=0, potencia=0;
		
		System.out.print("Digite um n�mero: ");
		numero = tec.nextDouble();
		
		if(numero%2==0)
		{
			raiz = Math.sqrt(numero);
			System.out.printf("%.2f � par e sua ra�z quadrada �: %.2f.", numero, raiz);
		}
		else
		{
			potencia = Math.pow(numero, 2);
			System.out.printf("%.2f � um n�mero �mpar e %.2f ao quadrado �: %.2f", numero, numero, potencia);
		}
		
		tec.close();
	}

}
