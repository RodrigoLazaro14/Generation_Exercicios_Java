package TabelaBrasileirao;

import java.util.Scanner;

public class TabelaVetor 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		String[] vTimes = {"CORINTHIANS", "PALMEIRAS", "SANTOS", "SPFC"};
		int [] vTimesPontos = {0,0,0,0};
		int[] vPontos = {0, 1, 3};
		final int RODADA = 3;
		int indice;
		
		for(indice=0; indice<RODADA; indice++)
		{
			System.out.println("O Corinthians: ");
			System.out.println("1 - Perdeu; 2 - empatou; 3 - ganhou");
			
		}

	}

}
