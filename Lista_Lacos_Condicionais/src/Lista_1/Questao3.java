package Lista_1;

import java.util.Scanner;

public class Questao3 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.print("Digite o seu nome: ");
		nome = tec.nextLine();
		System.out.print("Digite a sua idade: ");
		idade = tec.nextInt();
		
		if(idade<10)
		{
			System.out.printf("%s � uma crian�a.", nome);
		}
		else if(idade>=10 && idade<=14)
		{
			System.out.printf("%s � infantil.", nome);
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.printf("%s � juvenil.", nome);
		}
		else if(idade>=18)
		{
			System.out.printf("%s � adulto.", nome);
		}	
		
		tec.close();
	}

}
