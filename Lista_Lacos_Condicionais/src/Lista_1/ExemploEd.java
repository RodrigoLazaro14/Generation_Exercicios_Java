package Lista_1;

import java.util.Scanner;

public class ExemploEd 
{

	public static void main(String[] args) 
	{
		
		
		Scanner kb = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.print("Digite N1: ");
		n1 = kb.nextInt();
		System.out.print("Digite N2: ");
		n2 = kb.nextInt();
		System.out.print("Digite N3: ");
		n3 = kb.nextInt();
		
		System.out.print((n1 <= n2 && n2 <= n3)? "A ordem crescente: "+n1+", "+n2+", "+n3:(n1 <= n3 && n3 <= n2)?"A ordem crescente: "+n1+", "+n3+", "+n2:(n2 <= n1 && n1 <= n3)?"A ordem crescente: "+n2+", "+n1+", "+n3:(n2 <= n3 && n3 <= n1)?"A ordem crescente: "+n2+", "+n3+", "+n1:(n3 <= n1 && n1 <= n2)?"A ordem crescente: "+n3+", "+n1+", "+n2:"A ordem crescente: "+n3+", "+n2+", "+n1);
		
		kb.close();
	}
}