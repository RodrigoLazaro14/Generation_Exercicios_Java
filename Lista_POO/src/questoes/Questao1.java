package questoes;

public class Questao1 
{
	public String nomeCliente;
	public int cadastroCliente;
	public int dataDoCadastro;
	public double creditoCliente;
	public double compraCliente;
	
	
	public void informacoesCliente()
	{	
		System.out.println("\nOlá "+nomeCliente);
		System.out.println("Seu número de cadastro é: "+cadastroCliente);
		System.out.println("Você é cliente desde: "+dataDoCadastro);
		System.out.println("Valor da compra: R$"+compraCliente);
		
		double saldoCliente;
		saldoCliente = creditoCliente-compraCliente;
		if(saldoCliente>0)
		{
			System.out.printf("Seu saldo está positivo: R$%.2f", saldoCliente);
		}
		else if(saldoCliente==0)
		{
			System.out.println("Seu saldo está zerado.");
		}
		else if(saldoCliente<0)
		{
			System.out.printf("Seu saldo está negativo: R$%.2f", saldoCliente);
		}
	}
	
	
	
}