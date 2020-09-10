package Lista_1;

import java.util.Scanner;

public class Desafio2 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite 1 para MASCULINO, 2 para FEMININO e 3 para OUTRO: ");
		numero = tec.nextInt();
		
		System.out.println((numero==1)? "Você escolheu MASCULINO." : (numero==2)? "Você escolheu FEMININO." : (numero==3)? "Você escolheu OUTRO." : ("Você escolheu um valor inválido."));
		// ALT + SHIFT + Y PARA DESCER A LINHA ASSIM, OU ENTÃO CLICAR NAQUELE ICONE AZUL ABAIXO DO HELP.
				
		tec.close();
	}

}
