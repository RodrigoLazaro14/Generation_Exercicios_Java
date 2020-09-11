package Lista_2;

public class Questao1 
{

	public static void main(String[] args) 
	{
		int numero;
		
		System.out.println("Números que divididos por 11 o resto é 5:");
		for (numero=1000; numero<2000; numero++)
		{
			if((numero%11)==5)
			{
				System.out.printf("\n%d", numero);
			}
		}
		
	}

}