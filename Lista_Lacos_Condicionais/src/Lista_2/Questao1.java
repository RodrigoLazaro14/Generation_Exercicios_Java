package Lista_2;

public class Questao1 
{

	public static void main(String[] args) 
	{
		int numero, restoIgual5;
		
		System.out.println("Números que divididos por 11 o resto é 5:");
		for (numero=1000; numero<2000; numero++)
		{
			if((numero%11)==5)
			{
				restoIgual5 = numero;
				System.out.printf("\n%d", restoIgual5);
			}
		}
		
	}

}