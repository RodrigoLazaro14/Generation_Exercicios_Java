package ListaArrays;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Teste 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		
		final int LINHA=3, COLUNA=3;
		double[][] matriz = new double[LINHA][COLUNA];
		double[][] matriz2 = new double[LINHA][COLUNA];
		/*	double[][] matrizSoma = new double[LINHA][COLUNA];
		double[][] matrizSubtracao = new double[LINHA][COLUNA]; */
		int linha, coluna, escolha=0, constante=0;
		
		System.out.println("\nMatriz 1: \n");		
		for(linha=0; linha<LINHA; linha++)
		{
			for(coluna=0; coluna<COLUNA; coluna++)
			{
				matriz[linha][coluna] = aleatorio.nextDouble() * 10;
				System.out.printf(" %.2f \t", matriz[linha][coluna]);
			}
			System.out.println(); 
		}
		System.out.println("\nMatriz 2: \n");
		for(linha=0; linha<LINHA; linha++)
		{
			for(coluna=0; coluna<COLUNA; coluna++)
			{
				matriz2[linha][coluna] = aleatorio.nextDouble() * 10;
				System.out.printf(" %.2f \t", matriz2[linha][coluna]);
			}
			System.out.println(); 
		}  
		while(matriz[0][0]!=matriz2[0][0] && matriz[0][1]!=matriz2[0][1] && matriz[0][2]!=matriz2[0][2] && matriz[1][0]!=matriz2[1][0] && matriz[1][1]!=matriz2[1][1] && matriz[1][2]!=matriz2[1][2] && matriz[2][0]!=matriz2[2][0] && matriz[2][1]!=matriz2[2][1] && matriz[2][2]!=matriz2[2][2])
		{
			
		}
	}

}
