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
		System.out.println("\nOl� "+nomeCliente);
		System.out.println("Seu n�mero de cadastro �: "+cadastroCliente);
		System.out.println("Voc� � cliente desde: "+dataDoCadastro);
		System.out.println("Valor da compra: R$"+compraCliente);
		
		double saldoCliente;
		saldoCliente = creditoCliente-compraCliente;
		if(saldoCliente>0)
		{
			System.out.printf("Seu saldo est� positivo: R$%.2f", saldoCliente);
		}
		else if(saldoCliente==0)
		{
			System.out.println("Seu saldo est� zerado.");
		}
		else if(saldoCliente<0)
		{
			System.out.printf("Seu saldo est� negativo: R$%.2f", saldoCliente);
		}
	}
	
	
	
}