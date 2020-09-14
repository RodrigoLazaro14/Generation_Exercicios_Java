import java.util.Scanner;

public class Rev2 
{

	public static void main(String[] args) 
	{

		Scanner teclado = new Scanner(System.in);
		
		final int LINHA=5, COLUNA=5, DURACAOJOGO=1000;
		String[][] matriz = new String[LINHA][COLUNA];
		String[][] matriz2 = new String[LINHA][COLUNA];
		int linha, coluna, escolhaLinha=0, escolhaColuna=0, controle=0, menu=0, contador=-1;
				
		for(linha=0; linha<LINHA; linha++)
		{
			for(coluna=0; coluna<COLUNA; coluna++)
			{	
				matriz[linha][coluna]= "~";
			}
		}
		
		for(linha=0; linha<LINHA; linha++)
		{
			for(coluna=0; coluna<COLUNA; coluna++)
			{	
				matriz2[linha][coluna]= "*";
			}
		}	
		
		matriz2[1][2] = "X";
		matriz2[4][2] = "X";
		matriz2[3][3] = "X";
			
		System.out.println("Escolha uma opção:\n");
		System.out.println("Digite 1 para iniciar o jogo.");
		System.out.println("Digite 2 para exibir o gabarito do jogo");
		System.out.println("Digite 3 para sair.");
		System.out.print("\nFaça sua escolha: ");
		menu = teclado.nextInt();
//-------------------------------------------------------------------------------------------------------------		
		if(menu==1)
		{
			System.out.println("Legenda pro usuário: \n");
			System.out.println("~ : água no bloco. Ainda não foi dado tiro.");
			System.out.println("* : tiro dado, não há nada ali.");
			System.out.println("X : tiro dado, havia um navio ali.\n");
			System.out.println("Se você quiser finalizar o jogo, digite 5 na linha e na coluna. \n");

			
			
			System.out.println("       0     1     2     3     4     \n");
			for(linha=0; linha<LINHA; linha++)
			{
				contador++;
				System.out.printf("%d   |",contador);
				for(coluna=0; coluna<COLUNA; coluna++)
				{	
					
					System.out.printf("  %s  |", matriz[linha][coluna]);
				}
				System.out.println("\n"); 
			}
			contador=-1;		
		
			for(controle=0; controle<DURACAOJOGO; controle++)
			{
	
					System.out.print("\n\nEscolha a linha: ");
					escolhaLinha = teclado.nextInt();
					System.out.print("Escolha a coluna: ");
					escolhaColuna = teclado.nextInt();
					System.out.println("\n\n");
					if(escolhaLinha==1 && escolhaColuna==2)
					{
						matriz[1][2]= matriz2[1][2];
						System.out.println("Você acertou um navio, parabéns.\n");
					}
					else if(escolhaLinha==3 && escolhaColuna==3)
					{
						matriz[3][3] = matriz2[3][3];
						System.out.println("Você acertou um navio, parabéns.\n");
					}
					else if(escolhaLinha==4 && escolhaColuna==2)
					{
						matriz[4][2] = matriz2[4][2];
						System.out.println("Você acertou um navio, parabéns.\n");
					}

					else if(escolhaLinha<0 || escolhaLinha>5 || escolhaColuna<0 || escolhaColuna>5)
					{
						System.out.println("Número inválido, tente novamente.");
					}
					else if(escolhaLinha==5 && escolhaColuna==5)
					{
						System.out.println("Fim de jogo");
						break;
					}
					else
					{
						System.out.println("Erooooooouuu\n");
						if(escolhaLinha==1 || escolhaLinha==3 || escolhaLinha==4)
						{
							System.out.println("Há um navio nesta linha.");
						}
						else if(escolhaColuna==2 || escolhaColuna==3)
						{
							System.out.println("Há um navio nesta coluna.");
						}
						for(linha=0; linha<LINHA; linha++)
						{
							for(coluna=0; coluna<COLUNA; coluna++)
							{
								matriz[escolhaLinha][escolhaColuna]=matriz2[escolhaLinha][escolhaColuna];
							}
						}	
					}
					System.out.println("       0     1     2     3     4     \n");
					for(linha=0; linha<LINHA; linha++)
					{
						contador++;
						System.out.printf("%d   |",contador);
						for(coluna=0; coluna<COLUNA; coluna++)
						{	
							
							System.out.printf("  %s  |", matriz[linha][coluna]);
						}
						System.out.println("\n"); 
					}
					contador=-1;	
					if(matriz[1][2]==matriz2[1][2] && matriz[4][2]==matriz2[4][2] && matriz[3][3]==matriz2[3][3])
					{
						System.out.println("\nJogo concluído!");
						break;
					}

	
			}

		}
		else if(menu==2)
		{
			System.out.println("\nGabarito: \n");
			System.out.println("       0     1     2     3     4     \n");
			for(linha=0; linha<LINHA; linha++)
			{
				contador++;
				System.out.printf("%d   |",contador);
				for(coluna=0; coluna<COLUNA; coluna++)
				{	
					
					System.out.printf("  %s  |", matriz2[linha][coluna]);
				}
				System.out.println("\n"); 
			}
			contador=-1;
		}
		else if(menu==3)
		{
			System.out.println("Volte logo.");
		}
		else
		{
			System.out.println("Opção inválida, tente novamente.");
		}
	
	}

}