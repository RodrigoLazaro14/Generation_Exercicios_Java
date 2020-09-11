package ListaArrays;

import java.util.Scanner;

public class Questao2 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int[] vetor = new int[6];
		int[] vetorPar = new int[6];
		int[] vetorImpar = new int[6];
		int controle, somaPar=0, quantidadeImpar=0, quantidadePar=0, quantidadeZero=0;
		
		for(controle=0; controle<6; controle++)
		{
			System.out.print("Digite um n�mero: ");
			vetor[controle] = teclado.nextInt();
			
			if((vetor[controle]%2)==0 && vetor[controle]!=0)
			{
				vetorPar[controle] = vetor[controle];
				somaPar = somaPar + vetorPar[controle];
				quantidadePar++;
			}
			else if((vetor[controle]%2)==1)
			{
				vetorImpar[controle] = vetor[controle];
				quantidadeImpar++;
			}
			if(vetor[controle]==0)
			{
				quantidadeZero++;
			}
		}
		//------------------------------------ PAR ---------------------------------------------------------------
		System.out.println("\nN�meros pares digitados: ");
		for(controle=0;controle<6;controle++)
		{
			if(vetorPar[controle]!=0)
			{
				System.out.printf("\nVetor [%d] = %d", controle, vetorPar[controle]);
			}
		}
		if(quantidadePar==0)
		{
			System.out.println("N�o tem n�mero par.");
		}

		//--------------------------------------------------------------------------------------------------------
		//------------------------------------ IMPAR -------------------------------------------------------------
		System.out.println("\n\nN�meros �mpares digitados: ");
		for(controle=0; controle<6; controle++)
		{
			if(vetorImpar[controle]!=0)
			{
				System.out.printf("\nVetor [%d] = %d", controle, vetorImpar[controle]);
			}
		}
		if(quantidadeImpar==0)
		{
			System.out.println("N�o tem n�mero �mpar.");
		}

		//--------------------------------------------------------------------------------------------------------
		
		//----------------------------------------- ZERO ---------------------------------------------------------
		System.out.println("\n\nValores iguais a zero: ");
		for(controle=0; controle<6; controle++)
		{
			if(vetor[controle]==0)
			{
				System.out.printf("\nVetor [%d] = %d", controle, vetor[controle]);
			}
		}		
		if(quantidadeZero==0)
		{
			System.out.println("N�o tem valores iguais a zero.");
		}
		
		System.out.printf("\n\nA soma total dos n�meros pares digitados � de: %d", somaPar); 
		System.out.printf("\nA quantidade de n�meros �mpares digitado � de: %d", quantidadeImpar);

		teclado.close();
	}

}
