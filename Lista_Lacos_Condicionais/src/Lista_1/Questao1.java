package Lista_1;

import java.util.Scanner;

public class Questao1 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int numero1, numero2, numero3;
		
		System.out.print("Digite o primeiro valor: ");
		numero1 = tec.nextInt();
		System.out.print("Digite o segundo valor: ");
		numero2 = tec.nextInt();
		System.out.print("Digite o terceiro valor: ");
		numero3 = tec.nextInt();
		
		if(numero1>numero2 && numero1>numero3)
		{
			System.out.println("\nO primeiro valor � o maior.");
		}
		else if(numero2>numero1 && numero2>numero3)
		{
			System.out.println("\nO segundo valor � o maior.");
		}
		else if(numero3>numero1 && numero3>numero2)
		{
			System.out.println("\nO terceiro valor � o maior.");
		}
		else if(numero1==numero2 && numero1==numero3)
		{
			System.out.println("\nTodos os valores s�o iguais.");
		}
		else if(numero1>=numero2 && numero1>numero3)
		{
			System.out.println("\nO primeiro e o segundo valor s�o iguais e maiores que o terceiro valor.");	
		}
		else if(numero1>=numero3 && numero1>numero2)
		{
			System.out.println("\nO primeiro e o terceiro valor s�o iguais e maiores que o segundo valor.");	
		}
		else if(numero2>=numero3 && numero2>numero1)
		{
			System.out.println("\nO segundo e o terceiro valor s�o iguais e maiores que o primeiro valor.");	
		}
		tec.close();
	}

}
