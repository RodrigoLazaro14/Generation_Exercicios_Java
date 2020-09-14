package ListaArrays;

import java.util.Scanner;

public class Questao3 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int linha, coluna, maiorQue10=0;
		final int LINHA=3, COLUNA=3;
		
		System.out.println("Matriz [3][3] : \n");
		
		for(linha=0; linha<LINHA; linha++)
		{
			for(coluna=0; coluna<COLUNA; coluna++)
			{
				System.out.printf("Digite um valor para Matriz[%d][%d] : ", (linha+1), (coluna+1));
				matriz[linha][coluna] = teclado.nextInt();
				System.out.printf(" %d \t", matriz[linha][coluna]);
				if(matriz[linha][coluna]>10)
				{
					maiorQue10++;
				}
				System.out.println();
				
			}
		}

		if(maiorQue10==0)
		{
			System.out.println("\nNão há nenhum número maior que 10 nessa matriz.");
		}
		else
		{
			System.out.printf("\nHá %d números maíores que 10 nessa matriz.", maiorQue10);	
		}

		teclado.close();
	}

}
