package Lista_2;

import java.util.Scanner;

public class Questao3 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		int idade, menor21=0, maior50=0;
		
		System.out.print("Digite a sua idade: ");
		idade = tec.nextInt();
		
		while(idade> -99)
		{
			
			if(idade<21 && idade>=0)
			{
				menor21++;
			}
			else if(idade>50)
			{
				maior50++;
			}
			System.out.print("Digite a sua idade: ");
			idade = tec.nextInt();
		}
		
		System.out.printf("Pessoas com menos de 21 anos: %d", menor21);
		System.out.printf("\nPessoas com mais de 50 anos: %d", maior50);
		
		tec.close();
	}

}
