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
		System.out.println("INFORMAÇÕES DO VOO: ");
		System.out.println("Empresa: "+nomeEmpresa);
		System.out.println("Partida: "+partida);
		System.out.println("Destino: "+destino);
		System.out.println("Preço da passagem: R$"+precoPassagem);
		System.out.println("Número máximo de passageiros: "+quantidadePassageiros);
		System.out.println("Número de assentos ocupados: "+assentosOcupados);
		
		
		int assentosVazios= quantidadePassageiros - assentosOcupados;
		if(assentosVazios>0)
		{
			System.out.printf("Há %d assentos vazios.\n", assentosVazios);
		}
		else if(assentosVazios==0)
		{
			System.out.println("Não há assentos vazios.");
		}
		else if(assentosVazios<0)
		{
			System.out.println("Erro ao calcular o número de assentos vazios, tente novamente.");
		}
	}
}