package questoes;

public class Questao2 
{
	public String nomeEmpresa;
	public String destino;
	public String partida;
	public int quantidadePassageiros=200;
	public int assentosOcupados;
	public double precoPassagem;
		
	public void informacoesAviao() 
	{
		System.out.println("INFORMA��ES DO VOO: ");
		System.out.println("Empresa: "+nomeEmpresa);
		System.out.println("Partida: "+partida);
		System.out.println("Destino: "+destino);
		System.out.println("Pre�o da passagem: R$"+precoPassagem);
		System.out.println("N�mero m�ximo de passageiros: "+quantidadePassageiros);
		System.out.println("N�mero de assentos ocupados: "+assentosOcupados);
		
		
		int assentosVazios= quantidadePassageiros - assentosOcupados;
		if(assentosVazios>0)
		{
			System.out.printf("H� %d assentos vazios.\n", assentosVazios);
		}
		else if(assentosVazios==0)
		{
			System.out.println("N�o h� assentos vazios.");
		}
		else if(assentosVazios<0)
		{
			System.out.println("Erro ao calcular o n�mero de assentos vazios, tente novamente.");
		}
	}
}