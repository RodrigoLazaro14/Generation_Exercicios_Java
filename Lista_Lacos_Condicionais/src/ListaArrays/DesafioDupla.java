package ListaArrays;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class DesafioDupla 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		
		final int LINHA=3, COLUNA=3;
		double[][] matriz = new double[LINHA][COLUNA];

		int linha, coluna;
		double somaDiagonal=0, total = 0;
				
		for(linha=0; linha<LINHA; linha++)
		{
			for(coluna=0; coluna<COLUNA; coluna++)
			{
				matriz[linha][coluna] = aleatorio.nextDouble() * 10;
			}
		}


		System.out.println("\nMatriz 1: \n");
		for(linha=0; linha<LINHA; linha++)
		{
			for(coluna=0; coluna<COLUNA; coluna++)
			{
				System.out.printf(" %.2f \t", matriz[linha][coluna]);
			}
			System.out.println();
		}
		
		for(linha=0; linha<LINHA; linha++)
		{
			for(coluna=0; coluna<COLUNA; coluna++)
			{
				total = total + matriz[linha][coluna];
				if(linha==coluna)
				{
					somaDiagonal= somaDiagonal + matriz[linha][coluna];
				}
			}
			
		}
		
		System.out.printf("A soma da diagonal é: %.2f",somaDiagonal);
		System.out.printf("\nA soma total é: %.2f",total);

	}

}
