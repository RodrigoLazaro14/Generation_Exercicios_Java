package entidades;

public class Fornecedor extends Pessoa
{
	public double valorCredito;
	public double valorDivida;
	
	public Fornecedor() 
	{
		
	}
	
	public Fornecedor(String nomePessoa, double valorCredito, double valorDivida) {
		super(nomePessoa);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public Fornecedor(String nomePessoa, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nomePessoa, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public void obterSaldo()
	{
		double saldo;
		saldo = this.valorCredito - this.valorDivida;
		
		if(saldo>0)
		{
			System.out.printf("Seu saldo está positivo: R$%.2f", saldo);
		}
		else if(saldo==0)
		{
			System.out.println("Seu saldo está zerado.");
		}
		else if(saldo<0)
		{
			System.out.printf("Seu saldo está negativo: R$%.2f", saldo);
		}
		
	}
	
	
}
