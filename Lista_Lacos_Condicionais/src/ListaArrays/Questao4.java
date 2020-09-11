package ListaArrays;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Questao4 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		
		final int LINHA=2, COLUNA=2;
		double[][] matriz = new double[LINHA][COLUNA];
		double[][] matriz2 = new double[LINHA][COLUNA];
		double[][] matrizSoma = new double[LINHA][COLUNA];
		double[][] matrizSubtracao = new double[LINHA][COLUNA];
		int linha, coluna, escolha=0, constante=0;
				
		for(linha=0; linha<LINHA; linha++)
		{
			for(coluna=0; coluna<COLUNA; coluna++)
			{
				matriz[linha][coluna] = aleatorio.nextDouble() * 10;
			}
		}
		for(linha=0; linha<LINHA; linha++)
		{
			for(coluna=0; coluna<COLUNA; coluna++)
			{
				matriz2[linha][coluna] = aleatorio.nextDouble() * 10;
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
		System.out.println("\nMatriz 2: \n");
		for(linha=0; linha<LINHA; linha++)
		{
			for(coluna=0; coluna<COLUNA; coluna++)
			{
				System.out.printf(" %.2f \t", matriz2[linha][coluna]);

			}
			System.out.println();
		}  
		
		
		System.out.println("\nFaça uma escolha: \n");
		System.out.println("Digite 1 para somar as duas matrizes.");
		System.out.println("Digite 2 para subtrair a primeira matriz da segunda.");
		System.out.println("Digite 3 para adicionar uma constante as duas matrizes.");
		System.out.println("Digite 4 para imprimir as matrizes ");
		System.out.print("\nDigite sua escolha: ");
		escolha = teclado.nextInt();
		if(escolha<1 || escolha>4)
		{
			System.out.println("\nOpção inválida, tente novamente.");
		}
		else
		{
			if(escolha==1)
			{
				System.out.println("\nRESULTADO: \n");
				for(linha=0; linha<LINHA; linha++)
				{
					for(coluna=0; coluna<COLUNA; coluna++)
					{
						matrizSoma[linha][coluna]=(matriz[linha][coluna]+matriz2[linha][coluna]);
					}
				}
				for(linha=0; linha<LINHA; linha++)
				{
					for(coluna=0; coluna<COLUNA; coluna++)
					{
						System.out.printf(" %.2f \t", matrizSoma[linha][coluna]);
					}
					System.out.println();
				}
			}
			else if(escolha==2)
			{
				System.out.println("\nRESULTADO: \n");
				for(linha=0; linha<LINHA; linha++)
				{
					for(coluna=0; coluna<COLUNA; coluna++)
					{
						matrizSubtracao[linha][coluna]=(matriz2[linha][coluna]-matriz[linha][coluna]);
					}
				}
				for(linha=0; linha<LINHA; linha++)
				{
					for(coluna=0; coluna<COLUNA; coluna++)
					{
						System.out.printf(" %.2f \t", matrizSubtracao[linha][coluna]);
					}
					System.out.println();
				}
			}
			else if(escolha==3)
			{
				System.out.print("\nDigite um valor para a constante: ");
				constante = teclado.nextInt();
				System.out.println("\nRESULTADO: ");
				System.out.println("\nMatriz 1: \n");
				for(linha=0; linha<LINHA; linha++)
				{
					for(coluna=0; coluna<COLUNA; coluna++)
					{
						matriz[linha][coluna] = matriz[linha][coluna] + constante;
						System.out.printf(" %.2f \t", matriz[linha][coluna]);
					}
					System.out.println();
				}
				System.out.println("\nMatriz 2: \n");
				for(linha=0; linha<LINHA; linha++)
				{
					for(coluna=0; coluna<COLUNA; coluna++)
					{
						matriz2[linha][coluna] = matriz2[linha][coluna] + constante;
						System.out.printf(" %.2f \t", matriz2[linha][coluna]);

					}
					System.out.println();
				}  
			}
			else
			{
				System.out.println("\nRESULTADO: \n");
				System.out.println("\nMatriz 1: \n");
				for(linha=0; linha<LINHA; linha++)
				{
					for(coluna=0; coluna<COLUNA; coluna++)
					{
						System.out.printf(" %.2f \t", matriz[linha][coluna]);
					}
					System.out.println();
				}
				System.out.println("\nMatriz 2: \n");
				for(linha=0; linha<LINHA; linha++)
				{
					for(coluna=0; coluna<COLUNA; coluna++)
					{
						System.out.printf(" %.2f \t", matriz2[linha][coluna]);

					}
					System.out.println();
				}  
			}
		}


	}

}
