import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Jogo 
{

	public static void main(String[] args) 
	{

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		
		final int LINHA=3, COLUNA=3, DURACAOJOGO=1000;
		String[][] matriz = new String[LINHA][COLUNA];
		String[][] matriz2 = new String[LINHA][COLUNA];
		int linha, coluna, escolha=0, controle=0, menu=0;
				
		matriz[0][0] = "1";
		matriz[0][1] = "2";
		matriz[0][2] = "3";
		matriz[1][0] = "4";
		matriz[1][1] = "5";
		matriz[1][2] = "6";
		matriz[2][0] = "7";
		matriz[2][1] = "8";
		matriz[2][2] = "9";
		
		matriz2[0][0] = "X";
		matriz2[0][1] = "X";
		matriz2[0][2] = "X";
		matriz2[1][0] = "0";
		matriz2[1][1] = "0";
		matriz2[1][2] = "X";
		matriz2[2][0] = "0";
		matriz2[2][1] = "0";
		matriz2[2][2] = "X";
			
		System.out.println("Escolha uma opção:\n");
		System.out.println("Digite 1 para iniciar o jogo \nDigite 2 para exibir o gabarito do jogo \nDigite 3 para sair\n");
		System.out.print("Faça sua escolha: ");
		menu = teclado.nextInt();
//-------------------------------------------------------------------------------------------------------------		
		if(menu==1)
		{
			System.out.println("Se você quiser finalizar o jogo, digite 1234.");
			System.out.println("\nMatriz 1: \n");		
			for(linha=0; linha<LINHA; linha++)
			{
				for(coluna=0; coluna<COLUNA; coluna++)
				{	
					System.out.printf(" %s \t", matriz[linha][coluna]);
				}
				System.out.println(); 
			}
		
		
			for(controle=0; controle<DURACAOJOGO; controle++)
			{
	
					System.out.println("\n\nEscolha um número: ");
					escolha = teclado.nextInt();
					if(escolha==1)
					{
						for(linha=0; linha<LINHA; linha++)
						{
							for(coluna=0; coluna<COLUNA; coluna++)
							{	
								matriz[0][0]= matriz2[0][0];
								System.out.printf(" %s \t", matriz[linha][coluna]);
							}
							System.out.println(); 
						}
						
					}
					else if(escolha==2)
					{
						for(linha=0; linha<LINHA; linha++)
						{
							for(coluna=0; coluna<COLUNA; coluna++)
							{	
								matriz[0][1]= matriz2[0][1];
								System.out.printf(" %s \t", matriz[linha][coluna]);
							}
							System.out.println(); 
						}
					}
					else if(escolha==3)
					{
						for(linha=0; linha<LINHA; linha++)
						{
							for(coluna=0; coluna<COLUNA; coluna++)
							{	
								matriz[0][2]= matriz2[0][2];
								System.out.printf(" %s \t", matriz[linha][coluna]);
							}
							System.out.println(); 
						}
					}
					else if(escolha==4)
					{
						for(linha=0; linha<LINHA; linha++)
						{
							for(coluna=0; coluna<COLUNA; coluna++)
							{	
								matriz[1][0]= matriz2[1][0];
								System.out.printf(" %s \t", matriz[linha][coluna]);
							}
							System.out.println(); 
						}
					}
					else if(escolha==5)
					{
						for(linha=0; linha<LINHA; linha++)
						{
							for(coluna=0; coluna<COLUNA; coluna++)
							{	
								matriz[1][1]= matriz2[1][1];
								System.out.printf(" %s \t", matriz[linha][coluna]);
							}
							System.out.println(); 
						}
					}
					else if(escolha==6)
					{
						for(linha=0; linha<LINHA; linha++)
						{
							for(coluna=0; coluna<COLUNA; coluna++)
							{	
								matriz[1][2]= matriz2[1][2];
								System.out.printf(" %s \t", matriz[linha][coluna]);
							}
							System.out.println(); 
						}
					}
					else if(escolha==7)
					{
						for(linha=0; linha<LINHA; linha++)
						{
							for(coluna=0; coluna<COLUNA; coluna++)
							{	
								matriz[2][0]= matriz2[2][0];
								System.out.printf(" %s \t", matriz[linha][coluna]);
							}
							System.out.println(); 
						}
					}
					else if(escolha==8)
					{
						for(linha=0; linha<LINHA; linha++)
						{
							for(coluna=0; coluna<COLUNA; coluna++)
							{	
								matriz[2][1]= matriz2[2][1];
								System.out.printf(" %s \t", matriz[linha][coluna]);
							}
							System.out.println(); 
						}
					}
					else if(escolha==9)
					{
						for(linha=0; linha<LINHA; linha++)
						{
							for(coluna=0; coluna<COLUNA; coluna++)
							{	
								matriz[2][2]= matriz2[2][2];
								System.out.printf(" %s \t", matriz[linha][coluna]);
							}
							System.out.println(); 
						}
					}
					else if(escolha==1234)
					{
						System.out.println("Fim de jogo");
						break;
					}
					else
					{
						System.out.println("Número inválido, tente novamente.");
					}
					if(matriz[0][0]==matriz2[0][0] && matriz[0][1]==matriz2[0][1] && matriz[0][2]==matriz2[0][2] && matriz[1][0]==matriz2[1][0] && matriz[1][1]==matriz2[1][1] && matriz[1][2]==matriz2[1][2] && matriz[2][0]==matriz2[2][0] && matriz[2][1]==matriz2[2][1] && matriz[2][2]==matriz2[2][2])
					{
						System.out.println("Jogo concluído!");
						break;
					}
	
			}

		}
		else if(menu==2)
		{
			System.out.println("\nGabarito: \n");
			for(linha=0; linha<LINHA; linha++)
			{
				for(coluna=0; coluna<COLUNA; coluna++)
				{
					System.out.printf(" %s \t", matriz2[linha][coluna]);
				}
				System.out.println(); 
			} 
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
