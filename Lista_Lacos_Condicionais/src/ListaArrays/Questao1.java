package ListaArrays;

public class Questao1 
{

	public static void main(String[] args) 
	{
		int[] vetor = { 1, 0, 5, -2, -5, 7};
		int soma=0, controle=0;
		
		soma = vetor[0]+vetor[1]+vetor[5];
		
		System.out.println("A soma entre os valores das posições vetor[0], vetor[1] e vetor[5]: "+soma);
		vetor[4]=100;
		System.out.printf("Vetor na posição 4 = %d \n", vetor[4]);
		System.out.println("\nResultado final: ");
		for(controle=0; controle<6; controle++)
		{
			System.out.printf("\nVetor [%d] = %d", controle, vetor[controle]);
		}

	}

}
