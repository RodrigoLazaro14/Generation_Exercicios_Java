package entidades;

public class Aluno 
{
	// Primerio passo - Atributos:
	
	public String nomeAluno;
	public int anoNascimentoAluno;
	public char sexoAluno;
	public char turmaAluno;
	public double notas[] = new double[4];
	public double mediaAluno;
	public double mediaMinima;
	
	
	public void mostra()
	
	{
		if(sexoAluno=='M')
		{	
			System.out.printf("\nO nome do aluno � %s e ele � do sexo masculino.", nomeAluno);
	
		}
		else if(sexoAluno=='F')
		{	
			System.out.printf("\nO nome da aluna � %s e ela � do sexo feminino.", nomeAluno);
	
		}
	}
	
	public double mediaAluno()
	{
		for(int x=0; x<4;x++)
		{
			mediaAluno = mediaAluno+notas[x];
		}
		mediaAluno=mediaAluno/4;
		System.out.printf("\nA m�dia do aluno �: %.2f", mediaAluno);
		return mediaAluno;
	}
	
	public void reprovouPassou(double mediaMinima)
	{
		this.mediaMinima = mediaMinima;
		if(mediaAluno<this.mediaMinima)
		{
			System.out.println("\nO aluno reprovou.");
		}
		else
		{
			System.out.println("\nO aluno passou.");
		}
	}
}
